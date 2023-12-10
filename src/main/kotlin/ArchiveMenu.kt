import java.util.Scanner


class ArchiveMenu(list: MutableList<Archive>): MenuInterface<Archive>(list){
    //Меню архива

    //Вызов общего меню
    override fun menu( list: MutableList<Archive>) {
       println("Добро пожаловать в меню архива. Выбирете ваши действия")
        super.menu(list)
    }

    //метод для добавления названия архива
    override fun addTo(list: MutableList<Archive>) {
        println("Дайте название архиву")
        val name = sc.nextLine()
        if(name.isNotEmpty()){
            val archive = Archive(name)
            list.add(archive)
            println("Архив $name успешно создан")
        }
        else{
            println("Попробуйте еще раз, вы оставили поле пустым")
        }

    }


    //метод, который позволяет выбрать архив в который переместиться
    override fun show(list: MutableList<Archive>) {
        println("Выберите архив")
        for (i in list) {
            println("${list.indexOf(i) + 1}. ${i.name}")
        }
        val answer = sc.nextLine()
        if (answer.isNotEmpty() && answer.toIntOrNull() != null) {
            val selectedArchive = list[answer.toInt() - 1]
            val noteMenu = NoteMenu(selectedArchive.notes)
            noteMenu.menu(selectedArchive.notes)

        } else {
            println("Неправильный формат")
        }
    }


}


