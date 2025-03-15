package basic.example;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class Jugyo13 {

  public  static  void main(String[] args) {
    List<Student> studentList = IntStream.range(0,10)
        .mapToObj(i -> new Student(UUID.randomUUID().toString(),"Saito" + i))
        .toList();
    StudentManager manager = new StudentManager(studentList);

    Student student = manager.search("Saito3");
    System.out.println(student.getName());

    // 課題
    // 今まで作ってきたものに対してデバッグを実践。
    // ステップオーバー、スッテプイン、ブレイクポイントを貼る。

  }

}
