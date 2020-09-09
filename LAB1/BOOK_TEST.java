package LAB1;

public class BOOK_TEST {
    public static void main(String [] args) {
        BOOK BookName = new BOOK("The Godfather", "Harry Potter Anthology", "The Sicilian");
            System.out.println(
              "The book " + BookName.Book1 + " is available for buying." +
              " The book " + BookName.Book2 + " is available for buying. " +
                      "The book " + BookName.Book3 + "is available for buying. "
            );
    }
}
