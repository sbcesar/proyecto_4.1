import kotlin.math.pow

class Persona(peso: Double, altura: Double) {
    var nombre: String = ""
    var peso: Double = 0.0
    var altura: Double = 0.0
    var imc: Double = 0.0

    init {
        this.peso = peso
        this.altura = altura
        this.imc = calcularIMC(peso, altura)
    }

    constructor(nombre: String,peso: Double,altura: Double,imc: Double): this(peso,altura) {
        this.nombre = nombre
        this.imc = imc
    }

    fun pedirNombre(): String {
        print("Introduce tu nombre: ")
        val nombre = readln()
        return nombre
    }

    fun calcularIMC(peso: Double, altura: Double): Double {
        return peso / (altura.pow(2))
    }

    fun modificarNombre() {
        print("Introduzca su nuevo nombre: ")
        nombre = readln().toString()
    }

    override fun toString(): String {
        return "Nombre: ${this.nombre}\nPeso: ${this.peso}\nAltura: ${this.altura}\nIMC: ${this.imc}"
    }
}