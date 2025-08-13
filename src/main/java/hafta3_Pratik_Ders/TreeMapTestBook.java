package hafta3_Pratik_Ders;

public class TreeMapTestBook {
    String title;

    String author;

    public TreeMapTestBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "TreeMapTestBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
