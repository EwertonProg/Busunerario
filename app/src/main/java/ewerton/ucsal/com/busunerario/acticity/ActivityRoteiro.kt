package ewerton.ucsal.com.busunerario.acticity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import android.widget.Toast
import ewerton.ucsal.com.busunerario.R
import ewerton.ucsal.com.busunerario.model.Intinarario
import ewerton.ucsal.com.busunerario.util.MAdapter

class ActivityRoteiro : AppCompatActivity() {

    lateinit var rv: RecyclerView
    lateinit var ra: RecyclerView.Adapter<*>
    lateinit var lm: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roteiro)
        val it = intent
        val hora = it.getStringExtra("hora")
        val rota = Intinarario.getRoteiro(hora)

        rv = findViewById(R.id.recycler_ponto)
        lm = LinearLayoutManager(this)
        ra = MAdapter(contexto = this, layout = R.layout.ponto_item, lista = rota) { Toast.makeText(this, hora, Toast.LENGTH_SHORT).show() }

        rv.layoutManager = lm
        rv.adapter = ra

    }
}
