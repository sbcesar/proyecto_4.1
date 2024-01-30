import kotlin.math.pow

/**
 * Clase que representa una Persona con sus atributos y métodos relacionados.
 *
 * @property peso El peso de la persona en kilogramos.
 * @property altura La altura de la persona en metros.
 * @property nombre El nombre de la persona.
 * @property imc El Índice de Masa Corporal (IMC) de la persona.
 */
class Persona(peso: Double, altura: Double) {
    var nombre: String = ""
    var peso: Double = 0.0
    var altura: Double = 0.0
    var imc: Double = 0.0

    /**
     * Constructor primario que inicializa las propiedades de la persona y calcula su IMC.
     *
     * @param peso El peso de la persona en kilogramos.
     * @param altura La altura de la persona en metros.
     */
    init {
        this.peso = peso
        this.altura = altura
        this.imc = calcularIMC(peso, altura)
    }

    /**
     * Constructor secundario que permite especificar el nombre y el IMC de la persona.
     *
     * @param nombre El nombre de la persona.
     * @param peso El peso de la persona en kilogramos.
     * @param altura La altura de la persona en metros.
     * @param imc El Índice de Masa Corporal (IMC) de la persona.
     */
    constructor(nombre: String,peso: Double,altura: Double,imc: Double): this(peso,altura) {
        this.nombre = nombre
        this.imc = imc
    }

    /**
     * Solicita al usuario que ingrese su nombre.
     *
     * @return El nombre ingresado por el usuario.
     */
    fun pedirNombre(): String {
        print("Introduce tu nombre: ")
        val nombre = readln()
        return nombre
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC) de la persona.
     *
     * @param peso El peso de la persona en kilogramos.
     * @param altura La altura de la persona en metros.
     * @return El IMC calculado.
     */
    fun calcularIMC(peso: Double, altura: Double): Double {
        return peso / (altura.pow(2))
    }

    /**
     * Modifica el nombre de la persona.
     */
    fun modificarNombre() {
        print("Introduzca su nuevo nombre: ")
        nombre = readln().toString()
    }

    /**
     * Devuelve una representación de cadena de la persona incluyendo su nombre, peso, altura e IMC.
     *
     * @return Representación de cadena de la persona.
     */
    override fun toString(): String {
        return "Nombre: ${this.nombre}\nPeso: ${this.peso}\nAltura: ${this.altura}\nIMC: ${this.imc}"
    }
}