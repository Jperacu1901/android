fun main(){
    for (i in 1..9 step 2){
        println("$i")
    }
    println("Segundo Contador")

    for (i in 5 downTo 1){
        println(i)
    }
    println("Despegue")

    for (i in 0 until 4) {
        println("Indice: $i")
    }
}