fun main() {
    val scanner = Scanner(System.`in`)
    var opcion: Int

    do {
        println("MENÚ")
        println("1. Sumar tres números")
        println("2. Ingresar nombre completo")
        println("3. Calcular tiempo vivido")
        println("4. Salir")
        print("Seleccione una opción: ")
        opcion = scanner.nextInt()
        scanner.nextLine()  

        when (opcion) {
            1 -> sumarNumeros()
            2 -> ingresarNombre()
            3 -> calcularTiempoVivido()
            4 -> println("Programa Finalizado.")
            else -> println("Opción inválida. Intente nuevamente.")
        }
    } while (opcion != 4)
}

fun sumarNumeros() {
    val scanner = Scanner(System.`in`)
    println("Ingrese el primer número:")
    val num1 = scanner.nextInt()
    println("Ingrese el segundo número:")
    val num2 = scanner.nextInt()
    println("Ingrese el tercer número:")
    val num3 = scanner.nextInt()

    val suma = num1 + num2 + num3
    println("La suma es: $suma")
}

fun ingresarNombre() {
    val scanner = Scanner(System.`in`)
    println("Ingrese su nombre completo:")
    val nombre = scanner.nextLine()
    println("Su nombre completo es: $nombre")
}


fun calcularTiempoVivido() {
    val scanner = Scanner(System.`in`)

    println("Ingrese su día de nacimiento:")
    val dia = scanner.nextInt()
    println("Ingrese su mes de nacimiento:")
    val mes = scanner.nextInt()
    println("Ingrese su año de nacimiento:")
    val anio = scanner.nextInt()
    val fechaNacimiento = LocalDate.of(anio, mes, dia)
    val ahora = LocalDateTime.now()
    val periodo = Period.between(fechaNacimiento, ahora.toLocalDate())
    val mesesTotales = periodo.years * 12 + periodo.months


    val inicioNacimiento = fechaNacimiento.atStartOfDay()
    val duracion = Duration.between(inicioNacimiento, ahora)
    val segundosTotales = duracion.seconds
    val minutosTotales = segundosTotales / 60
    val horasTotales = minutosTotales / 60
    val diasTotales = horasTotales / 24
    val semanasTotales = diasTotales / 7


    println("Has vivido:")
    println("$mesesTotales meses")
    println("$semanasTotales semanas")
    println("$diasTotales días")
    println("$horasTotales horas")
    println("$minutosTotales minutos")
    println("$segundosTotales segundos")
}
