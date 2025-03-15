package org.example;

public class main {

  public static void main(String[] args) {
    Greeting greeting = new Greeting();
    String message = greeting.sayHello("Saito Shogo");

    Printer printer = new Printer();
    printer.printMessage(message);

    Speaking speaking = new Greeting();


    // 課題2
    // 実装したクラスを1つ継承して、メソッドを呼びだす。
    // メソッドの呼び出しは親子どちらとも

    Baseball baseball = new Baseball();
    baseball.play();
    baseball.practice();

    AdvancedBaseball advancedBaseball = new AdvancedBaseball();
    advancedBaseball.play();
    advancedBaseball.practice();
    advancedBaseball.strategy();

    Baseball polymorphicBaseball = new Baseball();
    polymorphicBaseball.play();
    polymorphicBaseball.practice();
  }
}








