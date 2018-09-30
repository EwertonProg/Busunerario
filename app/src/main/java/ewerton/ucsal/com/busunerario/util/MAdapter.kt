package ewerton.ucsal.com.busunerario.util

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ewerton.ucsal.com.busunerario.R
import kotlinx.android.synthetic.main.horario_item.view.*

class MAdapter(val lista: List<String>, val contexto: Context, val layout: Int, val listner: (String) -> Unit) : RecyclerView.Adapter<MAdapter.MViewHolder>() {

    inner class MViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val variavel = itemview.tvHora

        fun onClick(string: String) = with(itemView) {
            setOnClickListener {
                listner(string)
            }
        }


    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MAdapter.MViewHolder {
        val view: View = LayoutInflater.from(contexto).inflate(layout, p0, false)
        return MViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(p0: MViewHolder, p1: Int) {
        p0.variavel.text = lista[p1]
        p0.onClick(lista[p1])
    }
}