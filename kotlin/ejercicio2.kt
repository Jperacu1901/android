fun main() {
    val nota1 = 7.5
    val nota2 = 9.0

    val NotaMasAlta = if (nota1 > nota2)
        nota1
    else nota2

    val dia = "sabado"

    val turno = when(dia){
        "sabado", "domingo" -> "guardia"
        else -> "Laborable"
    }

    print("$NotaMasAlta $turno")
}