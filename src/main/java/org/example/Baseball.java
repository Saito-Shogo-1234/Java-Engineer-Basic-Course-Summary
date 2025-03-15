package org.example;

public class Baseball implements Sports {

  @Override
  public void play() {
    System.out.println("Let's play Baseball");
  }

  public void practice() {
    System.out.println("Practicing Baseball");
  }
}
