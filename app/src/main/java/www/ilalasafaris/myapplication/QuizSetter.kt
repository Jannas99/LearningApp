package www.ilalasafaris.myapplication

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import www.ilalasafaris.myapplication.databinding.ActivityQuizPracticeBinding
import www.ilalasafaris.myapplication.databinding.QuizResultsDialogBinding


class QuizSetter(
    private val activity: AppCompatActivity,
    private val binding: ActivityQuizPracticeBinding,
    private val mlist: MutableList<Birds>,
    private var mCurrentposition: Int,
    private var answer:String,
    var mediaPlayer: MyMediaPlayer? = null

) : ComponentActivity() {
    private lateinit var correctAnswer:String
    private var points = 0
    private val randomList: MutableList<Birds> = mutableListOf()

    companion object {
        @SuppressLint("StaticFieldLeak")
        var instance: QuizSetter? = null
    }

    fun setQuestion() {
        val count = mlist.count()

        if (randomList.isEmpty()) {
            randomList.addAll(mlist.shuffled())
        }

        binding.progress.max = count
        val sb = StringBuilder()
        sb.append("$mCurrentposition / ")
        sb.append(binding.progress.max)
        binding.txtprogress.text = sb.toString()
        Log.e("BirdIdValue3", "answer: $answer")
        Log.e("BirdIdValue5", "mCurrentposition: $mCurrentposition")

        val question: Birds = randomList.removeAt(0)
        val pictures1 = question.picture1
        val pictures2 = question.picture2
        val pictures3 = question.picture3
        val pictures4 = question.picture4
        val pictures5 = question.picture5
        val allPictures = ArrayList<Int>()
        allPictures.add(pictures1)
        allPictures.add(pictures2)
        allPictures.add(pictures3)
        allPictures.add(pictures4)
        allPictures.add(pictures5)

        allPictures.shuffle()
        val picBundle = allPictures[0]

        correctAnswer = question.name

        Log.e("BirdIdValue1", "correctAnswer: $correctAnswer")
        Log.e("BirdIdValue2", "points: $points")

        binding.apply {
            picture.setOnClickListener {
                imageview.setImageResource(picBundle)
                picture.setImageResource(R.drawable.zzz_ic_photo_on)
            }
            birdCallsexamples(sound,sound2,question.sound)

            binding.next.setOnClickListener {
                // replace the bottom line wit the following to make the app force you to select a name before you can click the next button
                //  if (mCurrentposition != mlist.size && answer.isNotEmpty()) {
                if (mCurrentposition != mlist.size) {
                    mCurrentposition++

                    if (answer == correctAnswer ){
                        Toast.makeText(activity, "Correct", Toast.LENGTH_SHORT).show()
                        pointCounter()
                    } else {
                        Toast.makeText(activity, "Incorrect", Toast.LENGTH_SHORT).show()
                    }
                    binding.searchView.setQuery("", false)
                    binding.searchView.clearFocus()
                    binding.rvChoose.visibility = View.GONE
                    txtprogresscolourflash()
                    setQuestion()
                    mediaPlayer!!.stopResource()

                    binding.apply {
                        imageview.setImageResource(R.drawable.zzz_vraagremovedbackground)
                        progress.progress = mCurrentposition
                        picture.setImageResource(R.drawable.zzz_ic_photo_off)
                    }
                } else if (answer.isEmpty()) {
                    Toast.makeText(activity, "Please select an answer", Toast.LENGTH_SHORT).show()
                } else
                    showCustomDialog(count,points)
            }
        }
    }

    fun setAnswer(answer: String) {
        this.answer = answer
    }
    fun txtprogresscolourflash(){
        val defaultColor = Color.parseColor("#FFFFFF")
        val flashColor = Color.parseColor("#808f75")
        val animator = ValueAnimator.ofArgb(defaultColor, flashColor, defaultColor)
        animator.duration = 250
        animator.addUpdateListener {
            val background = binding.txtprogress.background as GradientDrawable
            background.setColor(it.animatedValue as Int)
        }
        animator.start()
    }
    fun showCustomDialog(total: Int, points: Int) {

        val dialogBuilder = AlertDialog.Builder(activity)
        val inflater = activity.layoutInflater
        val binding = QuizResultsDialogBinding.inflate(inflater, null, false)
        val displayMessage: String

        dialogBuilder.setView(binding.root)
        dialogBuilder.setCancelable(false)

        binding.total.text = total.toString()
        binding.points.text = points.toString()
        val percentage = (points.toFloat() / total.toFloat() * 100).toInt()
        binding.percent.text = percentage.toString()

        displayMessage = percentageMessage(percentage)
        binding.textView7.text = displayMessage

        val alertDialog = dialogBuilder.create()
        binding.exit.setOnClickListener {
            activity.finish()
            instance = null
            alertDialog.dismiss()
            mediaPlayer?.onBack()
        }
        alertDialog.show()
    }
    fun percentageMessage(percent: Int): String {
        return when (percent) {
            100 -> "EXCELLENT!"
            in 90..99 -> "Great Job!"
            in 80..89 -> "Well done!"
            in 75..79 -> "Its not great, but its a pass"
            in 70..74 -> "75% is the pass Mark. YOU FAIL"
            in 60..69 -> "The more you study the less you suck"
            in 50..59 -> "You should rather use your phone for Instagram or Facebook."
            in 30..49 -> "In the age of information, ignorance is a choice"
            in 1..29 -> "Maybe you should rethink your life choices?"
            0 -> "Maybe you should get another Hobby, Yea ?"
            else -> ""
        }
    }
    fun pointCounter() {
        points += 1
    }
    fun dismissQuiz(){
        val builder = AlertDialog.Builder(activity)
        builder.setMessage("Are you sure you want to Quit")
        builder.setPositiveButton("Yes") { dialog, _ ->
            instance = null
            dialog.dismiss()
            activity.finish()
            mediaPlayer?.onBack()
        }
        builder.setNegativeButton("No") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }
    fun birdCallsexamples(playbtn: ImageView, stopbtn: ImageView, audiocall:Int ){
        playbtn.setOnClickListener {
            mediaPlayer!!.playResource(audiocall)
            mediaPlayer!!.setViews(btnPlay = playbtn, btnStop = stopbtn)
            playbtn.visibility = View.GONE
            stopbtn.visibility = View.VISIBLE
        }
        stopbtn.setOnClickListener {
            mediaPlayer!!.stopResource()
            playbtn.visibility = View.VISIBLE
            stopbtn.visibility = View.GONE
        }
    }
}


