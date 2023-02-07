package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import www.ilalasafaris.myapplication.databinding.AdaptorManageBinding
import www.ilalasafaris.myapplication.databinding.ShowPictureBinding


class AdaptorManage(
    private val items:ArrayList<Birds>,
    private var context: Context,
    private var layoutinflater:LayoutInflater,
    private var mediaPlayer:MyMediaPlayer? = null,
    private val deleteListener: (id: Int)-> Unit): RecyclerView.Adapter<AdaptorManage.ViewHolder>() {

    class ViewHolder(binding: AdaptorManageBinding) : RecyclerView.ViewHolder(binding.root){
        val tvName = binding.tvName
        val ivDelete = binding.ivDelete
        val llMain = binding.llMain
        var btnPlay = binding.btnPlay
        var btnStop = binding.btnStop
        var image = binding.ivImage
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            AdaptorManageBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val context = holder.itemView.context
        val item = items[position]

        holder.tvName.text = item.idbird
        holder.image.setImageResource(item.picture1)
        mediaPlayer = MyMediaPlayer.getInstance(holder.itemView.context)

        if (position % 2 == 0) {
            holder.llMain.setBackgroundColor(
                ContextCompat.getColor(
                    holder.itemView.context,
                    R.color.Brown1))
        } else {
            holder.llMain.setBackgroundColor(ContextCompat.getColor(context, R.color.white))
        }
        holder.ivDelete.setOnClickListener {
            deleteListener(item.id)
        }
        holder.image.setOnClickListener {
            displayPicture(item.picture1, item.name)
        }
        holder.btnPlay.setOnClickListener {
            mediaPlayer!!.playResource(item.sound)
            mediaPlayer!!.setViews(
                btnPlay = holder.btnPlay,
                btnStop = holder.btnStop)
            holder.btnPlay.visibility = GONE
            holder.btnStop.visibility = VISIBLE
        }
        holder.btnStop.setOnClickListener {
            mediaPlayer!!.stopResource()
            holder.btnPlay.visibility = VISIBLE
            holder.btnStop.visibility = GONE
        }
    }
    override fun getItemCount(): Int {
        return items.size
    }
    //Todo:  Consider using a fragment for this Dialog
    private fun displayPicture(id: Int, name:String)  {
        val birdCard = Dialog(context, R.style.Theme_Dialog)
        birdCard.setCancelable(false)
        val binding = ShowPictureBinding.inflate(layoutinflater)
        birdCard.setContentView(binding.root)
        binding.imageview.setImageResource(id)
        binding.birdName.text = name
        birdCard.setCanceledOnTouchOutside(true)
        birdCard.show()
    }
}