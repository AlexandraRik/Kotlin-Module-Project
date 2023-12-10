 data class Archive(val name: String, val notes: MutableList<Note>){
//Архив - хранение полей
     constructor(name: String) : this(name, mutableListOf()){
    }

}

