package basic.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Jugyo10 {

  public static void main(String[] args) {
    List<String> manyNames = new ArrayList<>(List.of("Aoki",
      "aaa","AA1212","Itou","iii","Ii4578","Umino","uuu","UU786","Enokida","eee",
      "Ee265","Ooki","OOO","OO784", "Kaino","KKK","Kk7821124","Saito","SSS","Ss6598",
      "Tina","ttt","TT56","natuki","NNN","Nn78","Hayama","HHH","Hh789","リンクアカデミー"));

    List<String> numbersOnly = new ArrayList<>();

    for (String name : manyNames) {
      String numbers = name.replaceAll("[^0-9]", "");
      if (!numbers.isEmpty()) {
        numbersOnly.add(numbers);
      }
    }

    System.out.println("Numbers Only:");
    for (String number : numbersOnly) {
      System.out.println(number);
    }

    // 課題2
    // (1)Listから英数字の大文字だけを取り出す。
    // (2)日本語だけを取り出す。
    // (3)英語以外を取り出す。

    // (1)
    List<String> upperEngNum = manyNames.stream()
        .filter(name -> name.matches("[A-Z0-9]+"))
        .collect(Collectors.toList());

    System.out.println(upperEngNum);

    // (2)
    List<String> japaneseOnly = manyNames.stream()
        .filter(name -> name.matches(".*[\\u3040-\\u30FF\\u4E00-\\u9FFF]+.*"))
        .collect(Collectors.toList());

    System.out.println(japaneseOnly);

    // (3)
    List<String> nonEngNum = manyNames.stream()
        .filter(name -> !name.matches("[a-zA-Z0-9]+"))
        .collect(Collectors.toList());

    System.out.println(nonEngNum);
  }
}
