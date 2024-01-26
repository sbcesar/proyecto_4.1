fun main() {

    val persona1 = Persona("Lara",35.3, 1.74,0.0)
    val persona2 = Persona("Pepe",70.5, 2.00,0.0)
    val persona3 = Persona("Juan", 85.0, 1.80, 0.0)

    //Modificar nombre persona 1
    println("Persona1\n${persona1.toString()}")
    println("¿Desea modificar su nombre (s/n)?")
    val opcion = readln()
    if (opcion?.lowercase() == "s") {
        persona1.modificarNombre()
        println("Nombre ${persona1.nombre} modificado correctamente")
    }

    //Mostrar informacion de la persona 2
    println("Persona2\n${persona2.toString()}")

    //Actualizar IMC persona 3
    println("Persona3 (antes de actualizar el IMC)\n${persona3.toString()}")
    persona3.imc = persona3.calcularIMC(persona3.peso,persona3.altura)
    println("Persona 3 (con el IMC actualizado)\n${persona3.toString()}")
}