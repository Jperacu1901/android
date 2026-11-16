fun restar(x: Int, y: Int) = x - y

fun mostarMensaje(usuario: String = "Invitado", alerta: String = "Bienvenido" ){
    println("$alerta,$usuario")
}

fun main() {
    val resultado = restar(10, 4)
    println("Resultado: $resultado")

    mostarMensaje(usuario = "pepe")
}