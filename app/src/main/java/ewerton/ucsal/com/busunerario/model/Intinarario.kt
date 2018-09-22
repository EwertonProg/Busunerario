package ewerton.ucsal.com.busunerario.model

class Intinarario {
    companion object {
        private val paradas: Map<Int, String> = hashMapOf(
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
        val horarioSegSex: Map<String,List<String>> = mapOf(
                "6:30" to Intinarario.ROTEIRO1(),
                "6:45" to Intinarario.ROTEIRO1(),
                "7:00" to Intinarario.ROTEIRO1(),
                "7:20" to Intinarario.ROTEIRO1(),
                "7:40" to Intinarario.ROTEIRO1(),
                "9:30" to Intinarario.ROTEIRO2(),
                "10:00" to Intinarario.ROTEIRO2(),
                "10:30" to Intinarario.ROTEIRO5(),
                "11:15" to Intinarario.ROTEIRO2(),
                "11:45" to Intinarario.ROTEIRO2(),
                "12:15" to Intinarario.ROTEIRO2(),
                "12:45" to Intinarario.ROTEIRO5(),
                "13:30" to Intinarario.ROTEIRO4(),
                "17:10" to Intinarario.ROTEIRO1(),
                "18:20" to Intinarario.ROTEIRO1(),
                "18:40" to Intinarario.ROTEIRO1(),
                "20:30" to Intinarario.ROTEIRO3(),
                "20:55" to Intinarario.ROTEIRO3(),
                "21:20" to Intinarario.ROTEIRO3(),
                "21:40" to Intinarario.ROTEIRO5(),
                "22:15" to Intinarario.ROTEIRO4())
        val horarioSab: Map<String,List<String>> = mapOf(
                "6:50" to Intinarario.ROTEIRO1(),
                "8:25" to Intinarario.ROTEIRO2(),
                "9:50" to Intinarario.ROTEIRO4(),
                "11:30" to Intinarario.ROTEIRO2(),
                "12:30" to Intinarario.ROTEIRO4())

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