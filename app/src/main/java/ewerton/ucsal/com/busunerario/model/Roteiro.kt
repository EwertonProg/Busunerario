package ewerton.ucsal.com.busunerario.model

class Roteiro {
    companion object {
        val paradas: Map<Int, String> = hashMapOf(
                1 to "Av. Paralela (sentido aeroporto) - Ponto do estadio de pituaçu",
                2 to "Av. Pinto de Aguiar (sentido Paralela) - Atras do primeiro ponto de onibus",
                3 to "Av. Pinto de Aguiar (sentido Paralela) - Ponto do condominio Green",
                4 to "Terminal Pituaçu - 1  andar, Plataforma E, 17.",
                5 to "Av. Paralela (sentido centro) - Ponto do estadio de pituaçu",
                6 to "Av. Paralela (sentido centro) - Ponto Extra",
                7 to "Av. Paralela (sentido aeroporto) - Ponto Extra",
                8 to "Av. Pinto de Aguiar (sentido orla) - Ponto do condominio Green",
                9 to "Av. Paralela (sentido aeroporto) - ponto do Wall street",
                10 to "Av. Paralela (sentido aeroporto) - ponto do Menor Preço",
                11 to "Av. Paralela (sentido centro) - ponto colegio villa",
                12 to "Av. Paralela (sentido centro) - ponto entrada Flamboyant",
                13 to "Av. Paralela (sentido centro) - Condominio Brisas")

        fun ROTEIRO1() : List<String>{
            return listOf(paradas[1]!!)
        }

        fun ROTEIRO2() : List<String>{
            return listOf(paradas[2]!!, paradas[3]!!, paradas[4]!!)
        }

        fun ROTEIRO3() : List<String>{
            return listOf(paradas[3]!!, paradas[2]!!, paradas[1]!!)
        }

        fun ROTEIRO4() : List<String>{
            return listOf(paradas[3]!!, paradas[5]!!, paradas[6]!!, paradas[7]!!, paradas[1]!!)
        }

        fun ROTEIRO5() : List<String>{
            return listOf(paradas[8]!!, paradas[2]!!, paradas[9]!!, paradas[10]!!, paradas[11]!!,
                    paradas[12]!!, paradas[13]!!, paradas[5]!!, paradas[6]!!, paradas[7]!!, paradas[1]!!)
        }
    }
}