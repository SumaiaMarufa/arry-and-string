import java.util.Scanner;

public class AnotheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner methode takes input from users

        System.out.println("Enter your First name");
        String firstname = sc.nextLine(); // nextLine() print or return whole sentence 

        System.out.println("Enter your last name");
        String lastname = sc.next(); // next() return just first word of the sentence

        System.out.println("Your full name:" + firstname+ " " +lastname); // here ( " " ) this empty cotetion is for a gape

    }
}
