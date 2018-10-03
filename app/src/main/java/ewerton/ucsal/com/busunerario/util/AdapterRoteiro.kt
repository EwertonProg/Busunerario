package ewerton.ucsal.com.busunerario.util

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ewerton.ucsal.com.busunerario.R
import ewerton.ucsal.com.busunerario.model.Parada
import kotlinx.android.synthetic.main.ponto_item.view.*

class AdapterRoteiro(val lista: List<Parada>, val contexto: Context,  val listner: (Parada) -> Unit) : RecyclerView.Adapter<AdapterRoteiro.HolderRoteiro>() {
    inner class HolderRoteiro(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val variavel = itemview.tvPonto

        fun onClick(parada: Parada) = with(itemView) {
            setOnClickListener {
                listner(parada)
            }
        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterRoteiro.HolderRoteiro {
        val view: View = LayoutInflater.from(contexto).inflate(R.layout.ponto_item, p0, false)
        return HolderRoteiro(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(p0: HolderRoteiro, p1: Int) {
        p0.variavel.text = lista[p1].descricao
        p0.onClick(lista[p1])
    }
}