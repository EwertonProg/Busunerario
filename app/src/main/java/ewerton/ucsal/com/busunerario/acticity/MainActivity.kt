package ewerton.ucsal.com.busunerario.acticity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import ewerton.ucsal.com.busunerario.R
import ewerton.ucsal.com.busunerario.model.Intinarario
import ewerton.ucsal.com.busunerario.util.AdapterHorario

class MainActivity : AppCompatActivity() {

    lateinit var rv: RecyclerView
    lateinit var va: RecyclerView.Adapter<*>
    lateinit var horarios: List<String>
    lateinit var vm: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolBar = findViewById(R.id.toolBar) as Toolbar?
        toolBar!!.title = "Dias"
        setSupportActionBar(toolBar)

        val i = Intent(this, ActivityRoteiro::class.java)

        horarios = Intinarario.horarios

        rv = findViewById(R.id.recycler_horario)
        vm = LinearLayoutManager(this)
        va = AdapterHorario( horarios, this, R.layout.horario_item)
        { string -> i.putExtra("hora", string); startActivity(i);  }


        rv.layoutManager = vm
        rv.adapter = va

    }


}
