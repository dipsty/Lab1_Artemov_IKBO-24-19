package LAB1;

public class BOOK {
//Переменные
    public String Book1;
    public String Book2;
    public String Book3;
//Конструкторы
    public BOOK(){
      Book1 = "The Godfather";
      Book2 = "The Last Don";
      Book3 = "The Sicilian";
    }

    public BOOK(String B1, String B2, String B3) {
        Book1 = B1;
        Book2 = B2;
        Book3 = B3;
    }
//Методы
    public String getBook1(){
        return Book1;
    }

    public String getBook2(){
        return Book2;
    }

    public String getBook3(){
        return Book3;
    }
}
