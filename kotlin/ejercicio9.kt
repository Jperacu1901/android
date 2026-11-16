interface Encendible {
    val consumo: Double
    fun encender()
}

abstract class Dispositivo {
    abstract fun reiniciar()

    open fun apagar(){
        println("Apagando...")
    }
}

class Bombilla(override  val consumo: Double = 12.5) : Encendible{
    override fun encender() {
        println("La bombilla esta encendida, $consumo W")
    }
}

fun main() {
    val miBombilla = Bombilla(10.0)
    miBombilla.encender()
}