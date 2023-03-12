public class Main {
    public static void main(String[] args) {

        Autor tery = new Autor("Terence", "Pratchett");
        System.out.println("tery.firstName = " + tery.getFirstName());
        System.out.println("tery.lastName = " + tery.getLastName());
        Autor dmitriy = new Autor("Dmitriy", "Glyhovskiy");
        System.out.println("dmitriy.getFirstName() = " + dmitriy.getFirstName());
        System.out.println("dmitriy.getLastName() = " + dmitriy.getLastName());
        book Mort = new book("Mort", tery, 1987);
        System.out.println("Mort.getTitle() = " + Mort.getTitle());
        System.out.println("Mort.getPublicationYear() = " + Mort.getPublicationYear());
        Mort.setPublicationYear(1988);
        System.out.println("Mort.getPublicationYear() = " + Mort.getPublicationYear());
        book metro2033 = new book("Metro2033", dmitriy, 2005);
        System.out.println("metro2033.getTitle() = " + metro2033.getTitle());
        System.out.println("metro2033.getPublicationYear() = " + metro2033.getPublicationYear());
        metro2033.setPublicationYear(2007);
        System.out.println("metro2033.getPublicationYear() = " + metro2033.getPublicationYear());


    }
}