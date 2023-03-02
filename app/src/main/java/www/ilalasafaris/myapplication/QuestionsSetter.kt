package www.ilalasafaris.myapplication

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.media.MediaPlayer
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding
import java.util.*
import kotlin.collections.ArrayList

    class QuestionsSetter(
        private val activity: AppCompatActivity,
        private val binding: ActivityPracticeBinding,
        private val mlist: MutableList<Birds>,
        private var mCurrentposition: Int) : ComponentActivity()
{
        private var mediaPlayer :MediaPlayer? = null
        private val mToastDuration = 400

        //This help to solve the problem, when i clicked the onBackpress button it did not want to call the stop fucntion
        // This Companion Object, stores a reference to the original instance of QuestionsSetter in a static field or a singleton object, and then access this instance from the onBackPressed method the CoreList1
        companion object {
            @SuppressLint("StaticFieldLeak")
            var instance: QuestionsSetter? = null
        }

        fun setQuestion() {
            //This makes txtprogess TextView box flash when you press next or previous
            val defaultColor = Color.parseColor("#FFFFFF")
            val flashColor = Color.parseColor("#808f75")
            val animator = ValueAnimator.ofArgb(defaultColor, flashColor, defaultColor)

            animator.duration = 250
            animator.addUpdateListener{
                val background = binding.txtprogress.background as GradientDrawable
                background.setColor(it.animatedValue as Int)
            }
            animator.start()

            //This makes the Progress bar and amount of birds in the list regulate
            val count = mlist.count()
            binding.progress.max = count
            val sb = StringBuilder()
            sb.append("$mCurrentposition / " )
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

            binding.apply {
                picture.setOnClickListener {
                    imageview.setImageResource(picBundle)
                    picture.setImageResource(R.drawable.zzz_ic_photo_on)
                }
                name.setOnClickListener {
                    textview.text = question.name
                    textscience.text = question.sname
                    name.setImageResource(R.drawable.zzz_ic_name_on)
                }
                binding.next.setOnClickListener {
                    if (mCurrentposition != mlist.size) {
                        mCurrentposition++
                        setQuestion()
                        stopCall()
                        binding.apply {
                            textview.text = ""
                            textscience.text = ""
                            imageview.setImageResource(R.drawable.zzz_vraagremovedbackground)
                            progress.progress = mCurrentposition
                            picture.setImageResource(R.drawable.zzz_ic_photo_off)
                            name.setImageResource(R.drawable.zzz_ic_name_off)
                        }

                    } else {
                        onBack()
                    }
                }
                previous.setOnClickListener {
                    if (mCurrentposition > 1) {
                        mCurrentposition--
                        setQuestion()
                        stopCall()
                        binding.apply {
                            textview.text = ""
                            textscience.text = ""
                            imageview.setImageResource(R.drawable.zzz_vraagremovedbackground)
                            progress.progress = mCurrentposition
                            picture.setImageResource(R.drawable.zzz_ic_photo_off)
                            name.setImageResource(R.drawable.zzz_ic_name_off)
                        }
                    } else if (mCurrentposition >= 0) {
                        onBack()
                    }
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
                random()
            }
        }
        private fun random() {
            binding.checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) mlist.shuffle()
            }
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
            // instance = null puts the QuestionSetter back to null to close it, Without the instacnce = null it remains open after a onBackpress and leaks memory
            instance = null
        }
        private fun stopCall() {
            mediaPlayer?.stop()
            mediaPlayer?.reset()
            mediaPlayer?.release()
            mediaPlayer = null
            binding.sound.setImageResource(R.drawable.zzz_ic_play)
        }
        fun mDisplayToast(toast: Toast){
            Thread{
                for(i in 1..mToastDuration/400){
                    toast.show()
                    Thread.sleep(400)
                    toast.cancel()
                }
            }.start()
        }
        fun addRecordBasic(birdsDao:DaoBirds) {
            val question: Birds = mlist[mCurrentposition - 1]
            val idbird = question.idbird
            val name = question.name
            val sname = question.sname
            val picture1 = question.picture1
            val picture2 = question.picture2
            val picture3 = question.picture3
            val picture4 = question.picture4
            val picture5 = question.picture5
            val sounds = question.sound
            lifecycleScope.launch {
                birdsDao.insert(BasicStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                    picture2 = picture2,
                    picture3 = picture3,
                    picture4 = picture4,
                    picture5 = picture5,  sound = sounds))
                val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
                mDisplayToast(mToast)
            }
        }
        fun addRecordCore(birdsDao:DaoBirds) {
            val question: Birds = mlist[mCurrentposition - 1]
            val idbird = question.idbird
            val name = question.name
            val sname = question.sname
            val picture1 = question.picture1
            val picture2 = question.picture2
            val picture3 = question.picture3
            val picture4 = question.picture4
            val picture5 = question.picture5
            val sounds = question.sound
            lifecycleScope.launch {
                birdsDao.insert_Core(CoreStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                    picture2 = picture2,
                    picture3 = picture3,
                    picture4 = picture4,
                    picture5 = picture5,  sound = sounds))
                val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
                mDisplayToast(mToast)
            }
        }
        fun addRecordSavanneast(birdsDao:DaoBirds) {
            val question: Birds = mlist[mCurrentposition - 1]
            val idbird = question.idbird
            val name = question.name
            val sname = question.sname
            val picture1 = question.picture1
            val picture2 = question.picture2
            val picture3 = question.picture3
            val picture4 = question.picture4
            val picture5 = question.picture5
            val sounds = question.sound
            lifecycleScope.launch {
                birdsDao.insert_SavannaEast(SavannaEastStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                    picture2 = picture2,
                    picture3 = picture3,
                    picture4 = picture4,
                    picture5 = picture5,  sound = sounds))
                val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
                mDisplayToast(mToast)
            }
        }
        fun addRecordSavannwest(birdsDao:DaoBirds) {
            val question: Birds = mlist[mCurrentposition - 1]
            val idbird = question.idbird
            val name = question.name
            val sname = question.sname
            val picture1 = question.picture1
            val picture2 = question.picture2
            val picture3 = question.picture3
            val picture4 = question.picture4
            val picture5 = question.picture5
            val sounds = question.sound
            lifecycleScope.launch {
                birdsDao.insert_Core(CoreStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                    picture2 = picture2,
                    picture3 = picture3,
                    picture4 = picture4,
                    picture5 = picture5,  sound = sounds))
                val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
                mDisplayToast(mToast)
            }
        }
        fun addRecordDesert(birdsDao:DaoBirds) {
            val question: Birds = mlist[mCurrentposition - 1]
            val idbird = question.idbird
            val name = question.name
            val sname = question.sname
            val picture1 = question.picture1
            val picture2 = question.picture2
            val picture3 = question.picture3
            val picture4 = question.picture4
            val picture5 = question.picture5
            val sounds = question.sound
            lifecycleScope.launch {
                birdsDao.insert_Desert(DesertStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                    picture2 = picture2,
                    picture3 = picture3,
                    picture4 = picture4,
                    picture5 = picture5,  sound = sounds))
                val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
                mDisplayToast(mToast)
            }
        }
        fun addRecordGrassland(birdsDao:DaoBirds) {
            val question: Birds = mlist[mCurrentposition - 1]
            val idbird = question.idbird
            val name = question.name
            val sname = question.sname
            val picture1 = question.picture1
            val picture2 = question.picture2
            val picture3 = question.picture3
            val picture4 = question.picture4
            val picture5 = question.picture5
            val sounds = question.sound
            lifecycleScope.launch {
                birdsDao.insert_Grassland(GrasslandStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                    picture2 = picture2,
                    picture3 = picture3,
                    picture4 = picture4,
                    picture5 = picture5,  sound = sounds))
                val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
                mDisplayToast(mToast)
            }
        }

    fun addRecordKaroo(birdsDao:DaoBirds) {
        val question: Birds = mlist[mCurrentposition - 1]
        val idbird = question.idbird
        val name = question.name
        val sname = question.sname
        val picture1 = question.picture1
        val picture2 = question.picture2
        val picture3 = question.picture3
        val picture4 = question.picture4
        val picture5 = question.picture5
        val sounds = question.sound
        lifecycleScope.launch {
            birdsDao.insert_Karoo(KarooStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                picture2 = picture2,
                picture3 = picture3,
                picture4 = picture4,
                picture5 = picture5,  sound = sounds))
            val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
            mDisplayToast(mToast)
        }
    }
    fun addRecordFynbos(birdsDao:DaoBirds) {
        val question: Birds = mlist[mCurrentposition - 1]
        val idbird = question.idbird
        val name = question.name
        val sname = question.sname
        val picture1 = question.picture1
        val picture2 = question.picture2
        val picture3 = question.picture3
        val picture4 = question.picture4
        val picture5 = question.picture5
        val sounds = question.sound
        lifecycleScope.launch {
            birdsDao.insert_Fynbos(FynbosStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                picture2 = picture2,
                picture3 = picture3,
                picture4 = picture4,
                picture5 = picture5,  sound = sounds))
            val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
            mDisplayToast(mToast)
        }
    }

    fun addRecordForest(birdsDao:DaoBirds) {
        val question: Birds = mlist[mCurrentposition - 1]
        val idbird = question.idbird
        val name = question.name
        val sname = question.sname
        val picture1 = question.picture1
        val picture2 = question.picture2
        val picture3 = question.picture3
        val picture4 = question.picture4
        val picture5 = question.picture5
        val sounds = question.sound
        lifecycleScope.launch {
            birdsDao.insert_Forest(ForestStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                picture2 = picture2,
                picture3 = picture3,
                picture4 = picture4,
                picture5 = picture5,  sound = sounds))
            val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
            mDisplayToast(mToast)
        }
    }
    fun addRecordThicket(birdsDao:DaoBirds) {
        val question: Birds = mlist[mCurrentposition - 1]
        val idbird = question.idbird
        val name = question.name
        val sname = question.sname
        val picture1 = question.picture1
        val picture2 = question.picture2
        val picture3 = question.picture3
        val picture4 = question.picture4
        val picture5 = question.picture5
        val sounds = question.sound
        lifecycleScope.launch {
            birdsDao.insert_Thicket(ThicketStart.Data(idbird = idbird, name = name, sname = sname, picture1 = picture1,
                picture2 = picture2,
                picture3 = picture3,
                picture4 = picture4,
                picture5 = picture5,  sound = sounds))
            val mToast = Toast.makeText(activity, "Bird Saved", Toast.LENGTH_LONG)
            mDisplayToast(mToast)
        }
    }
}












