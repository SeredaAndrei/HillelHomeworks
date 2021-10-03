package home_work_6.newinterface;

public class Work {
    public static void main(String[] args) {
        Book book1 = new Book("Nastia");
        Book book2 = new Book("Anastasia");
        Magazine magazine1 = new Magazine("3Dnews");
        Magazine magazine2 = new Magazine("4PDA");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        for (Printable printable : printables) {
            printable.print();
        }
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
