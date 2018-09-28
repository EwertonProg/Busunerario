package ewerton.ucsal.com.busunerario.model

class Intinarario {
    companion object {
        private var paradas: List<String> = listOf(
                "Av. Paralela (sentido aeroporto) - Ponto do estadio de pituaçu",
                "Av. Pinto de Aguiar (sentido Paralela) - Atras do primeiro ponto de onibus",
                "Av. Pinto de Aguiar (sentido Paralela) - Ponto do condominio Green",
                "Terminal Pituaçu - 1  andar, Plataforma E, 17.",
                "Av. Paralela (sentido centro) - Ponto do estadio de pituaçu",
                "Av. Paralela (sentido centro) - Ponto Extra",
                "Av. Paralela (sentido aeroporto) - Ponto Extra",
                "Av. Pinto de Aguiar (sentido orla) - Ponto do condominio Green",
                "Av. Paralela (sentido aeroporto) - ponto do Wall street",
                "Av. Paralela (sentido aeroporto) - ponto do Menor Preço",
                "Av. Paralela (sentido centro) - ponto colegio villa",
                "Av. Paralela (sentido centro) - ponto entrada Flamboyant",
                "Av. Paralela (sentido centro) - Condominio Brisas")
        var horarios: List<String> = listOf("6:30","6:45","7:00","7:20","7:40", "9:30", "10:00","10:30","11:15","11:45","12:15",
                "12:45","13:30","17:10","18:20","18:40","20:30","20:55","21:20","21:40","22:15")
        var intinerarioSegSex: Map<String,List<String>> = mapOf(
                horarios[0] to Intinarario.ROTEIRO1(),
                horarios[1] to Intinarario.ROTEIRO1(),
                horarios[2] to Intinarario.ROTEIRO1(),
                horarios[3] to Intinarario.ROTEIRO1(),
                horarios[4] to Intinarario.ROTEIRO1(),
                horarios[5] to Intinarario.ROTEIRO2(),
                horarios[6] to Intinarario.ROTEIRO2(),
                horarios[7] to Intinarario.ROTEIRO5(),
                horarios[8] to Intinarario.ROTEIRO2(),
                horarios[9] to Intinarario.ROTEIRO2(),
                horarios[10] to Intinarario.ROTEIRO2(),
                horarios[11] to Intinarario.ROTEIRO5(),
                horarios[12] to Intinarario.ROTEIRO4(),
                horarios[13] to Intinarario.ROTEIRO1(),
                horarios[14] to Intinarario.ROTEIRO1(),
                horarios[15] to Intinarario.ROTEIRO1(),
                horarios[16] to Intinarario.ROTEIRO3(),
                horarios[17] to Intinarario.ROTEIRO3(),
                horarios[18] to Intinarario.ROTEIRO3(),
                horarios[19] to Intinarario.ROTEIRO5(),
                horarios[20] to Intinarario.ROTEIRO4())
        var horarioSab: Map<String,List<String>> = mapOf(
                "6:50" to Intinarario.ROTEIRO1(),
                "8:25" to Intinarario.ROTEIRO2(),
                "9:50" to Intinarario.ROTEIRO4(),
                "11:30" to Intinarario.ROTEIRO2(),
                "12:30" to Intinarario.ROTEIRO4())

        fun ROTEIRO1() : List<String>{
            return listOf(paradas[0])
        }

        fun ROTEIRO2() : List<String>{
            return listOf(paradas[1], paradas[2], paradas[3])
        }

        fun ROTEIRO3() : List<String>{
            return listOf(paradas[2], paradas[1], paradas[0])
        }

        fun ROTEIRO4() : List<String>{
            return listOf(paradas[2], paradas[4], paradas[5], paradas[6], paradas[0])
        }

        fun ROTEIRO5() : List<String>{
            return listOf(paradas[7], paradas[1], paradas[8], paradas[9], paradas[10],
                    paradas[11], paradas[12], paradas[4], paradas[5], paradas[6], paradas[0])
        }
    }
}