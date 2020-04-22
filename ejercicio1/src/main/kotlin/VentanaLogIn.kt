package ejercicio1
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.widgets.*
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.lacar.ui.model.Action
import java.awt.Color

class VentanaLogIn: SimpleWindow<Login> {

    constructor(owner: WindowOwner,model: Login ): super (owner,model)

    override fun addActions(p0: Panel?) {
    }

    override fun createFormPanel(p0: Panel?) {
      title = "Insert your userName and password"
        Label(p0)with { text ="UserName"
        }
        TextBox(p0)with { bindTo("userName")
            width = 100
        }
        Label(p0)with { text ="PassWord"
        }
        PasswordField(p0)with {
            bindTo("passWord")
            width = 100
        }
        Button(p0)with {
            caption = "Autenticar"
            onClick(Action { autenticarU(p0)})
        }
    }
    private  fun autenticarU (p0: Panel?) {
        if (operacion()) {
            Label(p0) with {
                text = "True"
                bgColor = Color.GREEN
            }
        }
        else {
            Label(p0) with {    
                text = "False"
                bgColor = Color.RED
            }
        }
    }
    private  fun operacion(): Boolean {
        return modelObject.autenticar()
    }
}