import kotlin.system.exitProcess

class Producto(val codigo: String){
    var stock: Int = 10

    fun imprimirStock() {
        println("Produto: $codigo, Stock: $stock")
    }
}

class Articulo {
    var descripcion: String = ""
        set(value){
            field = "Articulo: $value"
        }
}

fun main() {
    val producto = Producto("Ejemplo")
    producto.stock = 25
}