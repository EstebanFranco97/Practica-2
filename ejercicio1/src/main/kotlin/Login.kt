package  ejercicio1
import org.uqbar.commons.model.annotations.Observable

@Observable

class Login {
    var sist: Sistema = Sistema(mutableListOf(User("lean","1234")))
    var userName: String = ""
    var passWord: String = ""


    fun esUsuarioQueBusco(user :User) = (user.name == userName) && (user.passWord ==passWord)

    fun setearName (usrName : String){
        userName = usrName
    }
    fun setearPass (usrPass : String){
        passWord = usrPass
    }

    fun autenticar(): Boolean{

        return (sist.usuarios).any { esUsuarioQueBusco(it) }
    }
}