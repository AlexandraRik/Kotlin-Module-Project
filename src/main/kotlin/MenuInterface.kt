import java.util.Scanner

open class  MenuInterface<T : Any>(val list: MutableList<T>) {
    //Общий класс(Родитель) для отображения меню и хранения общих методов, которым требуется переопределение у наследников меню Заметки и Архива

    val sc = Scanner(System.`in`)
    //Меню для переиспользования для меню Архива или заметок
    open fun menu( list: MutableList<T>){
            while(true) {
                println("Выберете действие:\n 1. Добавить\n 2. Выбрать  \n 3. Назад");
                val answer = sc.nextLine()
                if (answer.isNotEmpty() && answer.toIntOrNull() != null) {
                    when (answer) {
                        "1" -> addTo(list)
                        "2" -> show(list)
                        "3" -> break

                        else -> println("Такого варианта нет. Попробуйте еще раз")
                    }
                }
                else if(answer.isEmpty()){
                    println("Ошибка. Поле пустое")
                }
                else{
                    println("Введите число")
                }
            }



    }

    //Метод для добавления заметки или архива
    open fun addTo(list: MutableList<T>){

    }
    //Метод для выбора определенной заметки или архива
    open fun show(list: MutableList<T>){

    }


}


