fun main() {
    val textoNumero: String = "42"
    val puntosBase: Int = textoNumero.toInt()
    var puntosTotales: Int = puntosBase
    puntosTotales += 8

    println("El jugador tiene un total de $puntosTotales puntos")
}