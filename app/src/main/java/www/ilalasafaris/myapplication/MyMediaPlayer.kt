package www.ilalasafaris.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView


class MyMediaPlayer {
    var player: MediaPlayer? = null
    var context: Context? = null
    private var btnPlay: ImageView? = null
    private var btnStop: ImageView? = null

    companion object {
        @SuppressLint("StaticFieldLeak")
         var instance: MyMediaPlayer? = null

        fun getInstance(context: Context): MyMediaPlayer {
            if (instance == null) {
                instance = MyMediaPlayer()
                instance?.context = context
            }
            return instance!!
        }
    }
    fun playResource(audioResource: Int) {
        if (player != null) {
            if (player!!.isPlaying) {
                player!!.stop()
                player!!.reset()
                player!!.release()
                btnPlay?.visibility = VISIBLE
                btnStop?.visibility = GONE
            }
            player = null
        }

        player = MediaPlayer.create(context, audioResource)
        player?.start()
        player?.setOnPreparedListener {
        }

        player?.setOnCompletionListener {
            btnStop?.visibility = GONE
            btnPlay?.visibility = VISIBLE
            it.stop()
        }
    }

    fun stopResource() {
        player?.stop()
        player?.reset()
        player?.release()
        player = null
        btnPlay?.visibility = VISIBLE
        btnStop?.visibility = GONE
    }
    fun setViews(btnPlay: ImageView?, btnStop: ImageView?) {
            this.btnPlay = btnPlay
            this.btnStop = btnStop
        }

    fun onBack(){
        stopResource()
        instance = null
    }
}