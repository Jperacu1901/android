open class Vehiculo(val matricula: String){
    open fun desplazarse() {
        println("El vehiculo esta en movimiento")

    }
}

class Moto(matricula: String) : Vehiculo(matricula){
    override fun desplazarse(){
        println("Avanza")
    }
}

fun main() {
    val miMoto = Moto("1234")
    miMoto.desplazarse()
}