public class Book {
    private String title;
    private int releaseYear;
    private String author;
    private int pages;

    //Конструктор класса
    public Book(String title, int releaseYear, String author, int pages){
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    // Метод для определения, является ли книга большой
    public boolean isBig() {
        return pages > 500; // Возвращает true, если книга большая
    }

    // Метод для поиска слова в названии или имени автора
    public boolean matches(String word) {
        if (word == null) {
            return false;
        }
        return title.toLowerCase().contains(word.toLowerCase()) || author.toLowerCase().contains(word.toLowerCase());
    }

    // Метод для оценки стоимости книги
    public int estimatePrice() {
        int price = pages * 3; // Стоимость 3 рубля за страницу
        return Math.max(price, 250); // Не меньше 250 рублей
    }

    // Геттеры для отображения информации о книге
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}