fun main() {
    print("Ingrese su Puntuacion: ")
    var puntuacion = readln().toInt()
    
    print("Ingrese su Sueldo: ")
    var sueldo = readln().toDouble()
    
    var tipo_puntuacion = when(puntuacion){
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "error"
    }
    
    println("\nNivel de rendimiento: $tipo_puntuacion")
    println("Cantidad de Dinero Recibido: ${sueldo * (puntuacion/10)}")
}