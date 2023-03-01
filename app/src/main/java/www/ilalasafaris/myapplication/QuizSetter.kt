package www.ilalasafaris.myapplication

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.media.MediaPlayer
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import www.ilalasafaris.myapplication.databinding.ActivityQuizPracticeBinding

class QuizSetter(
    private val activity: AppCompatActivity,
    private val binding: ActivityQuizPracticeBinding,
    private val mlist: MutableList<Birds>,
    private var mCurrentposition: Int,
    private var answer:String,

) : ComponentActivity() {
    private var mediaPlayer: MediaPlayer? = null
    private lateinit var correctAnswer:String

    companion object {
        @SuppressLint("StaticFieldLeak")
        var instance: QuizSetter? = null
    }

    fun setQuestion() {
        val count = mlist.count().toString()
        binding.progress.max = count.toInt()
        val sb = StringBuilder()
        sb.append("$mCurrentposition / ")
        sb.append(binding.progress.max)
        binding.txtprogress.text = sb.toString()

        val question: Birds = mlist[mCurrentposition - 1]
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
        Log.e("BirdIdValue2", "answer1: $answer")

        binding.apply {
            picture.setOnClickListener {
                imageview.setImageResource(picBundle)
                picture.setImageResource(R.drawable.zzz_ic_photo_on)
            }

            binding.next.setOnClickListener {
                if (mCurrentposition != mlist.size && answer.isNotEmpty() ) {
                    mCurrentposition++

                    if (answer == correctAnswer ){
                        Toast.makeText(activity, "Correct", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(activity, "Incorrect", Toast.LENGTH_SHORT).show()
                    }
                    binding.searchView.setQuery("", false)
                    binding.searchView.clearFocus()
                    binding.rvChoose.visibility = View.GONE
                    txtprogresscolourflash()
                    setQuestion()
                    stopCall()
                    binding.apply {
                        imageview.setImageResource(R.drawable.zzz_vraagremovedbackground)
                        progress.progress = mCurrentposition
                        picture.setImageResource(R.drawable.zzz_ic_photo_off)
                    }
                } else if (answer.isEmpty()) {
                    Toast.makeText(activity, "Please select an answer", Toast.LENGTH_SHORT).show()

                } else
                    onBack()

            }
            fun startCall() {
                sound.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(activity, question.sound)
                    mediaPlayer?.start()
                    sound.setImageResource(R.drawable.zzz_ic_volume_off)
                    finishcall()
                    sound.setOnClickListener {
                        mediaPlayer?.stop()
                        mediaPlayer?.reset()
                        mediaPlayer?.release()
                        mediaPlayer = null
                        sound.setImageResource(R.drawable.zzz_ic_play)
                        setQuestion()
                    }
                }
            }
            startCall()
        }
    }
    fun setAnswer(answer: String) {
        this.answer = answer
        setQuestion()
    }
    private fun finishcall() {
        mediaPlayer?.setOnCompletionListener {
            mediaPlayer?.reset()
            mediaPlayer?.release()
            mediaPlayer = null
            setQuestion()
            binding.sound.setImageResource(R.drawable.zzz_ic_play)
        }
    }
    fun onBack() {
        stopCall()
        activity.finish()
        instance = null
    }
    private fun stopCall() {
        mediaPlayer?.stop()
        mediaPlayer?.reset()
        mediaPlayer?.release()
        mediaPlayer = null
        binding.sound.setImageResource(R.drawable.zzz_ic_play)
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
}

