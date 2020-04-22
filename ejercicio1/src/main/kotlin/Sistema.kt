package ejercicio1

data class Sistema (var usuarios : MutableList<User>) {

    fun agregarUsuario(user: User)= this.usuarios.add(user)

}
