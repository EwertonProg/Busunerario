package ewerton.ucsal.com.busunerario.acticity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import ewerton.ucsal.com.busunerario.R
import ewerton.ucsal.com.busunerario.model.Intinarario
import ewerton.ucsal.com.busunerario.model.Parada
import ewerton.ucsal.com.busunerario.util.AdapterRoteiro

class ActivityRoteiro : AppCompatActivity(), OnMapReadyCallback{
    lateinit var rv: RecyclerView
    lateinit var ra: RecyclerView.Adapter<*>
    lateinit var lm: RecyclerView.LayoutManager
    private lateinit var mMap: GoogleMap
    lateinit var rota: List<Parada>
    var markers: HashMap<Parada,Marker> = HashMap()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roteiro)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val it = intent
        val hora = it.getStringExtra("hora")
        rota = Intinarario.intinerarioSegSex[hora]!!

        rv = findViewById(R.id.recycler_ponto)
        lm = LinearLayoutManager(this)
        ra = AdapterRoteiro(contexto = this, roteiro = rota)
        {parada -> marcarMarker(parada) }

        rv.layoutManager = lm
        rv.adapter = ra

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        for (item in rota){
        markers.put( item, mMap.addMarker(MarkerOptions().position(item.coordenada)))}
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rota[0].coordenada))
        mMap.setMaxZoomPreference(18.0f)
        mMap.setMinZoomPreference(14.0f)
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID)
    }

    fun marcarMarker(parada: Parada){
        for(item in markers.values){
            if(markers[parada] == item){
                item!!.setIcon((BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)))
                mMap.moveCamera(CameraUpdateFactory.newLatLng(item.position))
            }else{
                item!!.setIcon((BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)))
            }
        }
    }
}
