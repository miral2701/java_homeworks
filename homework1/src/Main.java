
//Напишіть Java-клас з методом main, який містить
//1. створення нового списку масиву (ArrayList), додавання кількох кольорів (рядків) і виведення колекції
//2. ітерація по всіх елементах списку масиву
//3. вставка елемента у список масиву на першу позицію
//4. отримання елемента (за заданим індексом) зі списку масиву
//5. оновлення конкретного елемента списку заданим елементом
//6. видалення третього елемента зі списку масиву
//7. пошук елемента у списку масиву
//8. сортування заданого списку масиву (https://www.w3schools.com/java/java_sort_list.asp)
//        9. копіювання одного списку масиву в інший (
//
//        https://www.w3schools.com/java/ref_arraylist_clone.asp  )
//        10. реверсування елементів у списку масиву (метод reverse() класу Collections)
//        11. порівняння двох списків масиву (метод equals)
//12. очищення списку масиву (метод isEmpty)
//13. перевірка, чи список масиву є порожнім
//14. збільшення розміру списку масиву
//15. обрізання місткості списку масиву до поточного розміру (метод trimToSize)


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//1
        ArrayList<String> list = new ArrayList<String>();
        list.add("red");
        list.add("green");
        list.add("blue");
//2
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }

        list.set(0,"black");
        String color=list.get(1);
        System.out.println(color);
        list.remove(2);
    }
}