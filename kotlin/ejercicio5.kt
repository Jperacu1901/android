val duplicar: (Int) -> Int = {
    it * 2
}

fun Int.esMultiploDeTres(): Boolean = this % 3 == 0

fun main(){
    val numero = 5
    println("El doble es ${duplicar(numero)}")

    println("9 multiplo de 3?: ${9.esMultiploDeTres()}")
    println("10 multiplo de 3? ${10.esMultiploDeTres()}")
}