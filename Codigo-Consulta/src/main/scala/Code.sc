// Implementacion en Scala

// Funciones Anonimas

// Ejemplos

//  Sumatoria de dos numeros
val RTA = (a: Int, b: Int) => a + b
println(RTA(3,5))
//  Resta de dos numeros
val RTA1 = (a: Int, b: Int) => a - b
println(RTA1(10,5))
//  Multiplicacion de dos numeros
val RTA2 = (a: Int, b: Int) => a * b
println(RTA2(6,9))
//  Division de dos numeros
val RTA3 = (a: Double, b: Double) => a / b
println(RTA3(9,3))

// COMPARACIÓN FUNCIONES ANÓNIMAS CONTRAS FUNCIONES NOMBRADAS

// Producto de un numero
//  Funcion nombrada
def prod (a: Int) = (1 to a).product
val RTA4 = prod(5)
println(RTA4)
// funcion anonima
val RTA5 = (a: Int) => (1 to a).product
println(RTA5(5))

// Sumatoria de un numero
//  Funcion nombrada
def sum (a: Int) = (1 to a).sum
val RTA6 = sum(5)
println(RTA6)
// Funcion anonima
val RTA7 = (a: Int) => (1 to a).sum
println(RTA7(5))



