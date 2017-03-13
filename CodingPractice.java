import java.io.Console;

public class CodingPractice {
  public static void main(String[] args) {
    Integer total = new Integer(0);

    total += askHowMuchCoding("Yesterday");
    total += askHowMuchCoding("Two Days ago");
    total += askHowMuchCoding("Today");

    System.out.println("total: " + total);

    if(total >= 6) {
      System.out.println("Great job!");
    } else if(total >= 3 && total < 6) {
      System.out.println("Good job!");
    } else {
      System.out.println("Code more!");
    }
  }

  public static Integer askHowMuchCoding(String day) {
    Console console = System.console();

    System.out.println("How much time did you code " + day + "?");
    Integer intTime = Integer.parseInt(console.readLine());

    System.out.println("You spent " + intTime + " hours " + day);
    System.out.println("");

    return intTime;
  }
}
