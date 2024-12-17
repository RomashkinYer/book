public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры класса Book
        Book book1 = new Book("Война и мир", 1869, "Лев Толстой", 1225);
        Book book2 = new Book("Маленький принц", 1943, "Антуан де Сент-Экзюпери", 96);
        Book book3 = new Book("1984", 1949, "Джордж Оруэлл", 328);

        // Проверяем, является ли книга большой
        System.out.println(book1.getTitle() + " большая? " + (book1.isBig() ? "Да" : "Нет"));
        System.out.println(book2.getTitle() + " большая? " + (book2.isBig() ? "Да" : "Нет"));
        System.out.println(book3.getTitle() + " большая? " + (book2.isBig() ? "Да" : "Нет"));

        // Проверяем наличие слова в названии книги или Имени автора
        String searchWord1 = "Лев";
        System.out.println("Книга " + book1.getTitle() + " содержит слово " + searchWord1 + ": " + (book1.matches(searchWord1) ? "Да" : "Нет"));

        String searchWord2 = "принц";
        System.out.println("Книга " + book2.getTitle() + " содержит слово " + searchWord2 + ": " + (book2.matches(searchWord2) ? "Да" : "Нет"));

        String searchWord3 = "2010";
        System.out.println("Книга " + book3.getTitle() + " содержит слово " + searchWord3 + ": " + (book3.matches(searchWord3) ? "Да" : "Нет"));

        System.out.println("Оценочная стоимость книги " + book1.getTitle() + ": " + book1.estimatePrice() + "руб.");
        System.out.println("Оценочная стоимость книги " + book2.getTitle() + ": " + book2.estimatePrice() + "руб.");
        System.out.println("Оценочная стоимость книги " + book3.getTitle() + ": " + book3.estimatePrice() + "руб.");
    }
}