package org.example;

public class Greeting implements Speaking {

  public  String sayHello(String name) {
    return "Hello, " + name + "!";
  }

  public  String sayHelloJapanese(String name){
    return "oha " + name + "!";
  }

  @Override
  public String say(String message) {
    return message;
  }
}
