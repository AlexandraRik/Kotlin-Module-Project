import java.util.Scanner

class NoteMenu(list: MutableList <Note>) : MenuInterface<Note>(list) {

    //метод для использования общего меню
    override fun menu(list: MutableList<Note>) {
        println("Добро пожаловать в меню заметок. Выбирете ваши действия")
        super.menu(list)
    }

    //метод для добавления названия заметки и самой заметки
    override fun addTo(list: MutableList<Note>) {
        println("Дайте название заметке")
        val name = sc.nextLine()
        println("Напишите заметку")
        val note = sc.nextLine()
        if (name.isNotBlank() && note.isNotBlank()) {
            val newNote = Note(name, note)
            list.add(newNote)
            println("Заметка $name успешно добавлена")

        } else {
            println("Попробуйте еще раз, вы оставили поле пустым")
        }
    }


    //Метод для просмотра заметки
    override fun show(list: MutableList<Note>) {
        if (list.isEmpty()) {
            println("Заметок пока нет")
        } else {
            println("Выберете заметку")
            for (i in list) {
                println("${list.indexOf(i) + 1}. ${i.name}")
            }
            val answer = sc.nextLine()
            if (answer.isNotEmpty() && answer.toIntOrNull() != null) {
                val selectedNote = list[answer.toInt() - 1]
                println("Заметка: ${selectedNote.note}")
            } else {
                println("Неправильный формат")
            }
        }
    }
}






