package ejercicio1

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LogInTest {
    var sistema:Sistema = Sistema(mutableListOf())
    var user: User = User("lean","1234")
    var login: Login = Login()
    @Test

    fun sistemaContieneUser(){
        sistema.agregarUsuario(user)
        assertTrue((sistema.usuarios).contains(user))
    }

    @Test
    fun autenticarFunciona(){
        login.setearName("lean")
        login.setearPass("1234")
        sistema.agregarUsuario(user)
        assertTrue((login.sist).usuarios.contains(user))
    }


}