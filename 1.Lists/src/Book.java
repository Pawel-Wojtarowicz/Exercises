import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Book implements Comparable<Book>  {

    String title;
    String author;
    int pages;
    LocalDate dateOfPrint;
    long numberOfDays;

    public Book(String title, String author, int pages, LocalDate dateOfPrint) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.dateOfPrint = dateOfPrint;
    }

    public long getNumberOfDays() {
        LocalDate today = LocalDate.now();
        numberOfDays = ChronoUnit.DAYS.between(getDateOfPrint(), today);
        return numberOfDays;
    }

    public LocalDate getDateOfPrint() {
        return dateOfPrint;
    }

    @Override
    public String toString() {
        return "Book " + title + " is " + getNumberOfDays() + " days old.";
    }

    @Override
    public int compareTo(Book o) {
        return (int) (this.getNumberOfDays() - o.getNumberOfDays());
    }

    public static void main(String[] args) {
        Book HarryPotter = new Book("Harry Potter", "J.K. Rowling", 356, LocalDate.of(1997, 7, 25));
        Book Godfather = new Book("GodFather", "Mario Puzo", 480, LocalDate.of(1968, 2, 17));
        Book Witcher = new Book("The Witcher", "Andrzej Sapkowski", 200, LocalDate.of(1990, 11, 2));
        Book TwentyThousandLeagues = new Book("Twenty Thousand Leagues Under the Sea", "Jules Verne", 420, LocalDate.of(1870, 4, 11));

        List<Book> bookList = new ArrayList<>();
        bookList.add(HarryPotter);
        bookList.add(Witcher);
        bookList.add(TwentyThousandLeagues);
        bookList.add(Godfather);

        for (Book book : bookList) {
            System.out.println(book.toString());
        }
        Collections.sort(bookList);
        Collections.reverse(bookList);
        for (int i = 0; i < 1; i++) {
            System.out.println("\nThe oldest book is: " + bookList.get(0).title + ".");
        }
    }

}