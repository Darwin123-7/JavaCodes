import java.util.Scanner;
public class Vowel_or_Consonant {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a letter in Alphabet and the logic determines whether it's consonant or vowel: ");
        String input = s.next();
        char getLetter = input.toUpperCase().charAt(0);

        switch (getLetter) {

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It's a Vowel");
            break;
            default:
                System.out.println("It's a Consonant");
            break;
        }
s.close();
    }

}