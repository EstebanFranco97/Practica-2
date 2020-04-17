package ejercicio1


import org.uqbar.arena.Application
import org.uqbar.arena.windows.Window

class Aplicacion: Application() {
    override fun createMainWindow(): Window<*> {
         var login: Login = Login()
        return Ventana(this,login)
    }
}

fun main () = Aplicacion().start()