package ewerton.ucsal.com.busunerario.model

class Intinarario {
    companion object {
        val horarios: List<String> = listOf("6:30", "6:45", "7:00", "7:20", "7:40", "9:30", "10:00", "10:30", "11:15", "11:45", "12:15",
                "12:45", "13:30", "17:10", "18:20", "18:40", "20:30", "20:55", "21:20", "21:40", "22:15")

        val roteiro1: List<Parada> = listOf(Parada.parada1)

        val roteiro2: List<Parada> = listOf(Parada.parada2, Parada.parada3, Parada.parada4)

        val roteiro3: List<Parada> =
                listOf(Parada.parada3, Parada.parada2, Parada.parada1)

        val roteiro4: List<Parada> = listOf(Parada.parada3, Parada.parada5, Parada.parada6, Parada.parada7, Parada.parada1)

        val roteiro5: List<Parada> = listOf(Parada.parada8, Parada.parada2, Parada.parada9, Parada.parada10, Parada.parada11,
                Parada.parada12, Parada.parada13, Parada.parada5, Parada.parada6, Parada.parada7, Parada.parada1)

        val intinerarioSegSex: Map<String, List<Parada>> = mapOf(
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

        var horarioSab: Map<String, List<Parada>> = mapOf(
                "6:50" to roteiro1,
                "8:25" to Intinarario.roteiro2,
                "9:50" to Intinarario.roteiro4,
                "11:30" to Intinarario.roteiro2,
                "12:30" to Intinarario.roteiro4)
    }
}