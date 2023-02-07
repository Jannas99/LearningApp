package www.ilalasafaris.myapplication

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class AdaptorCreate(
    private val context: Context,
    private val showPicture: (id: Int, name: String) -> Unit,
    private var mediaPlayer:MyMediaPlayer? = null,
    private var arrayList: MutableList<Birds>
) : RecyclerView.Adapter<AdaptorCreate.ViewHolder>() {

    private var tempNameVersionList = ArrayList(arrayList)
    private lateinit var mListener:OnItemClickListener


    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }
    fun setOnItemClickListener(listener:OnItemClickListener){
        mListener = listener
    }

    class ViewHolder(itemView:View, listener:OnItemClickListener) : RecyclerView.ViewHolder(itemView) {
        var nameDisplay: TextView? = itemView.findViewById(R.id.ivNameSearch)
        var image: ImageView? = itemView.findViewById(R.id.ivImageSearch)
        var playBtn: ImageView? = itemView.findViewById(R.id.ivPlay)
        var stopBtn: ImageView? = itemView.findViewById(R.id.ivStop)
        var science: TextView? = itemView.findViewById(R.id.ivNameScienceSearch)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(bindingAdapterPosition)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.adaptor_create, parent, false)
        return ViewHolder(view,mListener)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val map = arrayList[position]
        mediaPlayer = MyMediaPlayer.getInstance(holder.itemView.context)

        holder.nameDisplay?.text = map.idbird
        holder.science?.text = map.sname
        holder.image?.setImageResource(map.picture1)

        holder.itemView.setOnClickListener {
            mListener.onItemClick(position)
            holder.itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.ilalalight))
            notifyItemChanged(position)

                holder.itemView.postDelayed({
                    holder.itemView.setBackgroundColor(Color.WHITE)
                    notifyItemChanged(position)
                }, 100)
            }

        holder.playBtn?.setOnClickListener {
            mediaPlayer!!.playResource(map.sound)
            mediaPlayer!!.setViews(
                btnPlay = holder.playBtn,
                btnStop = holder.stopBtn)
            holder.playBtn?.visibility = View.GONE
            holder.stopBtn?.visibility = View.VISIBLE
        }
        holder.stopBtn?.setOnClickListener {
            mediaPlayer!!.stopResource()
            holder.playBtn?.visibility = View.VISIBLE
            holder.stopBtn?.visibility = View.GONE
        }
        holder.image?.setOnClickListener { showPicture(map.picture1, map.name)
        }
    }
    override fun getItemCount(): Int {
        return arrayList.size
    }
    fun filter(textfilter: String?) {
        val text = textfilter!!.lowercase(Locale.getDefault())
        arrayList.clear()
        if (text.isEmpty()) {
            arrayList.addAll(tempNameVersionList)
        } else {
            for (i in 0 until tempNameVersionList.size) {
                if (tempNameVersionList[i]!!.idbird.lowercase(Locale.getDefault()).contains(text)) {
                    arrayList.add(tempNameVersionList[i])
                }
            }
        }
        notifyItemRangeRemoved(0, tempNameVersionList.size)
        notifyItemRangeInserted(0, arrayList.size)
    }
}