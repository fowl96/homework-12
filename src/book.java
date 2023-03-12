public class book {
    private String title;
    Autor  name;
    private int publicationYear;


    public book(String title, Autor name, int publicationYear) {
        this.title = title;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }



    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;

    }
}