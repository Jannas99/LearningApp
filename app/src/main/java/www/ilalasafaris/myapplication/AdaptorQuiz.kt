package www.ilalasafaris.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.SearchView
import java.util.*
import kotlin.collections.ArrayList

class AdaptorQuiz(
    private val context: Context,
    private var arrayList: MutableList<Birds>,
) : RecyclerView.Adapter<AdaptorQuiz.ViewHolder>() {

    private var tempNameVersionList = ArrayList(arrayList)


    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        var nameDisplay: TextView? = itemView.findViewById(R.id.ivNameSearch)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.quiz_choice_adaptor, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bird = arrayList[position]

        holder.nameDisplay?.text = bird.idbird

        holder.itemView.setOnClickListener {
            val selectedBirdId = bird.idbird
            (context as AppCompatActivity).findViewById<SearchView>(R.id.searchView).setQuery(selectedBirdId, false)
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(holder.itemView.windowToken, 0)
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