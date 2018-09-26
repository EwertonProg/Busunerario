package ewerton.ucsal.com.busunerario.acticity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import ewerton.ucsal.com.busunerario.R
import ewerton.ucsal.com.busunerario.model.Intinarario
import ewerton.ucsal.com.busunerario.util.MAdapter

class MainActivity : AppCompatActivity() {

    lateinit var rv : RecyclerView
    lateinit var va: RecyclerView.Adapter<*>
    lateinit var horarios: List<String>
    lateinit var vm: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        horarios = Intinarario.horarios

        rv = findViewById(R.id.recycler_horario)
        vm = LinearLayoutManager(this)
        va = MAdapter(horarios, this)

        rv.layoutManager = vm
        rv.adapter = va
    }
}
