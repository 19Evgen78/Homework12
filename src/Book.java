public class Book {
    private String b00kName;
    private String authorName;
    private int publicationYear;

    public Book(String b00kName, String authorName, int publicationYear) {
        this.b00kName = b00kName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getB00kName() {
        return this.b00kName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
