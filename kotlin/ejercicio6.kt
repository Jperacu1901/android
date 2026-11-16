fun main() {
    val frutas = arrayOf("Manzana","Platano","Naranja")

    println("Primera: ${frutas[0]}")
    println("Ultima: ${frutas[frutas.size -1]}")

    val calificaciones = mutableListOf(5, 7 , 9)
    calificaciones.add(10)
    calificaciones.remove(5)
    print("$calificaciones")
}