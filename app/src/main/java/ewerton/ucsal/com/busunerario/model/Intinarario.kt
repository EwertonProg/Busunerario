package ewerton.ucsal.com.busunerario.model

class Intinarario {
    companion object {
        private val paradas: List<String> = listOf(
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

        val horarios: List<String> = listOf("6:30", "6:45", "7:00", "7:20", "7:40", "9:30", "10:00", "10:30", "11:15", "11:45", "12:15",
                "12:45", "13:30", "17:10", "18:20", "18:40", "20:30", "20:55", "21:20", "21:40", "22:15")

        val roteiro1: List<String> = listOf(paradas[0])

        val roteiro2: List<String> = listOf(paradas[1], paradas[2], paradas[3])

        val roteiro3: List<String> =
                listOf(paradas[2], paradas[1], paradas[0])

        val roteiro4: List<String> = listOf(paradas[2], paradas[4], paradas[5], paradas[6], paradas[0])

        val roteiro5: List<String> = listOf(paradas[7], paradas[1], paradas[8], paradas[9], paradas[10],
                paradas[11], paradas[12], paradas[4], paradas[5], paradas[6], paradas[0])

        val intinerarioSegSex: HashMap<String, List<String>> = hashMapOf(
                horarios[0] to Intinarario.roteiro1,
                horarios[1] to Intinarario.roteiro1,
                horarios[2] to Intinarario.roteiro1,
                horarios[3] to Intinarario.roteiro1,
                horarios[4] to Intinarario.roteiro1,
                horarios[5] to Intinarario.roteiro2,
                horarios[6] to Intinarario.roteiro2,
                horarios[7] to Intinarario.roteiro5,
                horarios[8] to Intinarario.roteiro2,
                horarios[9] to Intinarario.roteiro2,
                horarios[10] to Intinarario.roteiro2,
                horarios[11] to Intinarario.roteiro5,
                horarios[12] to Intinarario.roteiro4,
                horarios[13] to Intinarario.roteiro1,
                horarios[14] to Intinarario.roteiro1,
                horarios[15] to Intinarario.roteiro1,
                horarios[16] to Intinarario.roteiro3,
                horarios[17] to Intinarario.roteiro3,
                horarios[18] to Intinarario.roteiro3,
                horarios[19] to Intinarario.roteiro5,
                horarios[20] to Intinarario.roteiro4)

        val horarioSab: Map<String, List<String>> = mapOf(
                "6:50" to roteiro1,
                "8:25" to Intinarario.roteiro2,
                "9:50" to Intinarario.roteiro4,
                "11:30" to Intinarario.roteiro2,
                "12:30" to Intinarario.roteiro4)

        fun getRoteiro (horario: String): List<String>{
            val roteiro = when(horario){
                "6:30" -> roteiro1
                "6:45" -> roteiro1
                "7:00" -> roteiro1
                "7:20" -> roteiro1
                "7:40" -> roteiro1
                "9:30" -> roteiro2
                "10:00" -> roteiro2
                "10:30" -> roteiro5
                "11:15" -> roteiro2
                "11:45" -> roteiro2
                "12:15" -> roteiro2
                "12:45" -> roteiro5
                "13:30" -> roteiro4
                "17:10" -> roteiro1
                "18:20" -> roteiro1
                "18:40" -> roteiro1
                "20:30" -> roteiro3
                "20:55" -> roteiro3
                "21:20" -> roteiro3
                "21:40" -> roteiro5
//                "22:15" -> roteiro4
                else -> roteiro4

            }
            return roteiro
        }


    }
}