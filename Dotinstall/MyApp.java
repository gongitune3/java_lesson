import java.util.Scanner;

class MyApp {
  public static void main(String[] args) {
    System.out.print("Your guess? ");
    Integer guess = new Scanner(System.in).nextInt();
    
    System.out.println("Your guess: " + guess);
  }
}