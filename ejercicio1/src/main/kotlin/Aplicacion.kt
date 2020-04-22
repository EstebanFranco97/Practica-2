package ejercicio1


import org.uqbar.arena.Application
import org.uqbar.arena.windows.Window

class Aplicacion: Application() {
    override fun createMainWindow(): Window<*> {
        return VentanaLogIn(this,Login())
    }
}

fun main () = Aplicacion().start()