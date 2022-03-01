import java.util.Scanner;

public class EnigmaPrototype {

  int number;
  char c;

  public static void main(String[] args) {
    EnigmaPrototype demo = new EnigmaPrototype();
    demo.LetterValues1(0);
    demo.LetterValues2('A');
    demo.userInput();
  }

  //Figures the letter of the value
  public char LetterValues1(int number) {
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
  //Figures the value of the letter
  public int LetterValues2(char c) {
    if (c == ' ') {
      return 0;
    } else if (c == 'A') {
      return 1;
    } else if (c == 'B') {
      return 2;
    } else if (c == 'C') {
      return 3;
    } else if (c == 'D') {
      return 4;
    } else if (c == 'E') {
      return 5;
    } else if (c == 'F') {
      return 6;
    } else if (c == 'G') {
      return 7;
    } else if (c == 'H') {
      return 8;
    } else if (c == 'I') {
      return 9;
    } else if (c == 'J') {
      return 10;
    } else if (c == 'K') {
      return 11;
    } else if (c == 'L') {
      return 12;
    } else if (c == 'M') {
      return 13;
    } else if (c == 'N') {
      return 14;
    } else if (c == 'O') {
      return 15;
    } else if (c == 'P') {
      return 16;
    } else if (c == 'Q') {
      return 17;
    } else if (c == 'R') {
      return 18;
    } else if (c == 'S') {
      return 19;
    } else if (c == 'T') {
      return 20;
    } else if (c == 'U') {
      return 21;
    } else if (c == 'V') {
      return 22;
    } else if (c == 'W') {
      return 23;
    } else if (c == 'X') {
      return 24;
    } else if (c == 'Y') {
      return 25;
    } else if (c == 'Z') {
      return 26;
    } else if (c == 'Æ') {
      return 27;
    } else if (c == 'Ø') {
      return 28;
    } else if (c == 'Å') {
      return 29;
    } else
      return '?';

  }

  public void userInput() {
    Scanner scanner = new Scanner(System.in);
    //Prints the letter of the value
    System.out.print("Enter number from 0-29: ");
    number = scanner.nextInt();
    System.out.print(LetterValues1(number));
    scanner.nextLine();
    //Prints the value of the letter
    System.out.print("\nEnter a letter: ");
    c = scanner.nextLine().charAt(0);
    System.out.print(LetterValues2(c));
  }
}
