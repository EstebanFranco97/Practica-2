
class Calculator {
    var operator1: Int = 0
    var operator2: Int = 0
    var result: Int = 0
    var operation: Operation = Sumar()

    fun seleccionarOperacion(operacion: Operation){
        operation = operacion

    }
    fun realizarOperacion(){
        result = operation.doOperation(operator1,operator2)
    }
}