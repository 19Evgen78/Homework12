
public class Main {
    public static void main(String[] args) {
        Author writer = new Author("Лев", "Толстой");
        System.out.println("Имя - " + writer.getName());
        System.out.println("Фамилия - " + writer.getSurname());

        Author writer2 = new Author("Федор", "Достоевский");
        System.out.println("Имя - " + writer2.getName());
        System.out.println("Фамилия - " + writer2.getSurname());

        System.out.println("**************************************");

        Book warAndPeace = new Book("Война и мир", "Л.Н.Толстой",1867);
        System.out.println("Название - " + warAndPeace.getB00kName());
        System.out.println("Автор - " + warAndPeace.getAuthorName());
        System.out.println("Год - " + warAndPeace.getPublicationYear());
        warAndPeace.setPublicationYear(1900);
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());

        Book crimeAndPunishment = new Book("Преступление и наказание",
                "Ф.М.Достоевский", 1866);
        System.out.println("Название - " + crimeAndPunishment.getB00kName());
        System.out.println("Автор - " + crimeAndPunishment.getAuthorName());
        System.out.println("Год - " + crimeAndPunishment.getPublicationYear());
        warAndPeace.setPublicationYear(1901);
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());
    }
}