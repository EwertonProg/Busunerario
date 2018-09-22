package ewerton.ucsal.com.busunerario.model

class Horario {

    lateinit var roteiro: List<String>

     enum class hora(hora: String, roteiro: List<String>){
         SEIS30("6:30", Roteiro.ROTEIRO1()),
         SEIS45("6:45"),
         SEIS50("6:50"),
         SETE("7:00"),
         SETE20("7:20"),
         SETE40("7:40"),

     }

}