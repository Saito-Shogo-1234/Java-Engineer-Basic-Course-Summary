package basic.example;

import java.util.List;
import org.example.Greeting;


public class Jugyo11 {

  public static void main(String[] args) {

    System.out.println(creatStudentsList());

    int number1 = 3;
    int number2 = 5;
    int sum = number1 + number2;
    System.out.println(sum);

    Greeting greeting = new Greeting();
    greeting.sayHello("Saito");
  }

  private static List<String> creatStudentsList() {
    return List.of("N_Saito","N_Sait","N_Sai");
  }
}
