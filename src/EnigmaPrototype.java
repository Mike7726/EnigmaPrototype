import java.util.Scanner;

public class EnigmaPrototype {

  int number;

  public static void main(String[] args) {
    EnigmaPrototype demo = new EnigmaPrototype();
    demo.LetterValues(0);
    demo.userInput();

  }

  public char LetterValues(int number) {
    if (number == 0) {
      return ' ';
    } else if (number == 1) {
      return 'A';
    } else if (number == 2) {
      return 'B';
    } else if (number == 3) {
      return 'C';
    } else if (number == 4) {
      return 'D';
    } else if (number == 5) {
      return 'E';
    } else if (number == 6) {
      return 'F';
    } else if (number == 7) {
      return 'G';
    } else if (number == 8) {
      return 'H';
    } else if (number == 9) {
      return 'I';
    } else if (number == 10) {
      return 'J';
    } else if (number == 11) {
      return 'K';
    } else if (number == 12) {
      return 'L';
    } else if (number == 13) {
      return 'M';
    } else if (number == 14) {
      return 'N';
    } else if (number == 15) {
      return 'O';
    } else if (number == 16) {
      return 'P';
    } else if (number == 17) {
      return 'Q';
    } else if (number == 18) {
      return 'R';
    } else if (number == 19) {
      return 'S';
    } else if (number == 20) {
      return 'T';
    } else if (number == 21) {
      return 'U';
    } else if (number == 22) {
      return 'V';
    } else if (number == 23) {
      return 'W';
    } else if (number == 24) {
      return 'X';
    } else if (number == 25) {
      return 'Y';
    } else if (number == 26) {
      return 'Z';
    } else if (number == 27) {
      return 'Æ';
    } else if (number == 28) {
      return 'Ø';
    } else if (number == 29) {
      return 'Å';
    } else
    return '?';
  }

  public void userInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number from 0-29: ");
    number = scanner.nextInt();
    System.out.print(LetterValues(number));

  }
}
