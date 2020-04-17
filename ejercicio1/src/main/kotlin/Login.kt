package  ejercicio1
import org.uqbar.commons.model.annotations.Observable
import java.lang.reflect.Array

@Observable

class Login () {
    var sist: Sistema = Sistema(arrayListOf(User("lean","1234")))
    var userName: String = ""
    var passWord: String = ""

    fun esUsuarioQueBusco(user :User) = (user.name == userName) && (user.passWord ==passWord)

    fun autenticar(): Boolean{
        var estaRegistrado: Boolean = (sist.usuarios).any{esUsuarioQueBusco(it)}

            return estaRegistrado
    }
}