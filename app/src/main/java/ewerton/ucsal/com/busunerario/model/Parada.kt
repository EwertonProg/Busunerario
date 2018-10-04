package ewerton.ucsal.com.busunerario.model

import com.google.android.gms.maps.model.LatLng

class Parada(val coordenada: LatLng, val descricao: String) {
    companion object {
        val parada1 = Parada(LatLng(-12.94397, -38.41967), "Av. Paralela (sentido aeroporto) - Parada do estadio de pituaçu")
        val parada2 = Parada(LatLng(-12.96231, -38.4036), "Av. Pinto de Aguiar (sentido Paralela) - Atras do primeiro ponto de onibus")
        val parada3 = Parada(LatLng(-12.95258, -38.40755), "Av. Pinto de Aguiar (sentido Paralela) - Parada do condominio Green")
        val parada4 = Parada(LatLng(-12.94251, -38.4216), "Terminal Pituaçu - 1  andar, Plataforma E, 17.")
        val parada5 = Parada(LatLng(-12.94509, -38.4216), "Av. Paralela (sentido centro) - Parada do estadio de pituaçu")
        val parada6 = Parada(LatLng(-12.96181, -38.43475), "Av. Paralela (sentido centro) - Parada Extra")
        val parada7 = Parada(LatLng(-12.96183, -38.43303), "Av. Paralela (sentido aeroporto) - Parada Extra")
        val parada8 = Parada(LatLng(-12.95168, -38.40877), "Av. Pinto de Aguiar (sentido orla) - Parada do condominio Green")
        val parada9 = Parada(LatLng(-12.93957, -38.412), "Av. Paralela (sentido aeroporto) - ponto do Wall street")
        val parada10 = Parada(LatLng(-12.9391, -38.40873),"Av. Paralela (sentido aeroporto) - ponto do Menor Preço")
        val parada11 = Parada(LatLng(-12.93675, -38.40198), "Av. Paralela (sentido centro) - ponto colegio villa")
        val parada12 = Parada(LatLng(-12.93769, -38.40802), "Av. Paralela (sentido centro) - ponto entrada Flamboyant")
        val parada13 = Parada(LatLng(-12.93835, -38.41119), "Av. Paralela (sentido centro) - Condominio Brisas")
    }
}
