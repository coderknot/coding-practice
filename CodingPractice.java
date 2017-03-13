import java.io.Console;

public class CodingPractice {
  public static void main(String[] args) {
    askHowMuchCoding("Yesterday");
    askHowMuchCoding("Two Days ago");
    askHowMuchCoding("Today");
  }

  public static void askHowMuchCoding(String day) {
    Console console = System.console();

    System.out.println("How much time did you code " + day + "?");
    Integer intTime = Integer.parseInt(console.readLine());

    System.out.println("You spent " + intTime + " hours " + day);
    System.out.println("");
  }
}
