package ejercicio1

class Sistema (var usuarios : MutableList<User>) {

    fun agregarUsuario(user: User)= this.usuarios.add(user)

}
