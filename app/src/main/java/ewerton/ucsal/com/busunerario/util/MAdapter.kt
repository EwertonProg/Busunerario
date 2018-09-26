package ewerton.ucsal.com.busunerario.util

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ewerton.ucsal.com.busunerario.R
import kotlinx.android.synthetic.main.horario_item.view.*

class MAdapter(val horarios : List<String>, val contexto: Context): RecyclerView.Adapter<MAdapter.MViewHolder>() {

    class MViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val hora = view.tvHora
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MAdapter.MViewHolder {
        val view: View = LayoutInflater.from(contexto).inflate(R.layout.horario_item, p0, false)
        return MViewHolder(view)
    }

    override fun getItemCount(): Int {
        return horarios.size
    }

    override fun onBindViewHolder(p0: MViewHolder, p1: Int) {
        p0.hora.text = horarios[p1]
    }
}