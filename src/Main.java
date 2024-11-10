// Домашняя работа 11, Объекты и классы.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//
public class Main {
    public static void main(String[] args) {
        Author alTolstoy = new Author("Алексей", "Толстой");
        Author fDostoevsky = new Author("Федор", "Достоевский");


        Book buratino = new Book(alTolstoy, "Приключения Буратино", 1970);
        Book palata6 = new Book(fDostoevsky, "Палата №6", 1870);


        System.out.printf(buratino.getBookTitle() + " " + buratino.getYearOfPublication() + "\n");
        System.out.println(palata6.getBookTitle() + " " + palata6.getYearOfPublication());

        palata6.setYearOfPublication(1980);
        System.out.println(palata6.getBookTitle() + " " + palata6.getYearOfPublication());


    }
}
