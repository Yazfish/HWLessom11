// Домашняя работа 11-2, Методы объектов.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//
public class Main {
    public static void main(String[] args) {
        Author alTolstoy = new Author("Алексей", "Толстой");
        Author fDostoevsky = new Author("Федор", "Достоевский");


        Book buratino = new Book(alTolstoy, "Приключения Буратино", 1970);
        Book palata6 = new Book(fDostoevsky, "Палата №6", 1870);


        System.out.println(buratino);
        System.out.println(palata6);

        palata6.setYearOfPublication(1980);
        System.out.println(palata6);

        System.out.println("\n___________________ \n" + buratino.equals(palata6));
        System.out.println(palata6.hashCode());


    }
}
