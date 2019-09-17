import java.util.Scanner;
public class Store{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double BOOKS = 9.0;
        final double MOVIES = 13.97;
        final double NUTS_PER_POUND = 1.72;
        final double BOOK_SHIP = 0.95;
        final double NUT_SHIP_POUND = 0.30;
        final double MOVIE_SHIP = (MOVIES)*.04;
        final double TAX = (MOVIES + BOOKS)* 0.072;

        System.out.println ("Enter number of books ordered:");
        double totBook = scan.nextDouble();
        System.out.println ("Enter number of movies ordered:");
        double totMovie = scan.nextDouble();
        System.out.println("Enter amount of peanuts (pounds) ordered:");
        double totNutPound = scan.nextDouble();

        
      }
