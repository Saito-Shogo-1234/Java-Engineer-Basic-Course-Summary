package basic.example;

import java.util.List;

public class Jugyo12 {

  public  static  void  main(String[] args) {
    // java 命名規則
    // 日本語、英語、アンダーバーとか色々な文字列が使える。
    // 先頭文字には数字は使えない。
    // 文字数宣言はない。
    // 大文字と小文字は区別される。

    // Pascal,Camel,Snake
    // 先頭大文字。一般的な英語の書き方と一緒。
    // Main,Greeting

    // Camel
    // 戦闘は小文字。言葉の区切りから大文字。
    // メソッド名や変数名に使われることが多い。
    // sayHello
    // numberSecond

    // フィールド名、変数名
    // 名刺
    // number,message,name,xxList

    // メソッド名
    // 動詞
    // say,great,print,printMessage
    // gerXXX,setXXX,countXXX

    // 定数
    // フィールドとの違いは固定値であること。絶対に変更しない
    // すべて大文字。Snakeケースを使う場合もある。
    // Full_NAME

    // 真偽値、booleanを使うときの名前
    // isXXX,hasXXX
    // isSNumber,isEmpty,isNull

    // 命名の仕方
    // 適当な名前を付けないこと。誰かに使われることを想定する。
    // 誰にも使われない。誰にも見せない。そういったものであれば適当でもいい。
    // 長くなってもいい。名前はコンパクトが一番。短く正確に伝わるものが理想。
    // これは難易度が高い。なので長くていい。正確であることが大事。短くするのは後。
    // a,b,c　こういう適当な名前はなるべく付けない。正確に。

    // 学習方法
    // 1つ1つ理解しながら進める　or　なんとなく理解した状態で次にどんどん進む
    // モチベーションの上げ方。
    // 前提　モチベーションに頼らない。
    // ご褒美、罰ゲーム、他人に委ねる。
    // 仕事の延長で学習。ルール化。ルーティン。

    // 課題
    // 図書管理システムを作る
    // 書籍（Book）を管理する情報を持つオブジェクト（クラス）を作って、そこに情報を格納してください。
    // 図書館（Library）みたいなものを作って、そこにBookをListで持つようなものを保持する。
    // mainメソッドからこのLibraryクラスに対して検索ができるようにする。Libraryクラスは書籍検索の機能をもつ。
    // タイトル検索、著者検索、番号検索メソッドをLibraryに持たせる。
    // それをmainメソッドから実行して、実行結果をコンソールに出力する。

    Book book1 = new Book("Lemon","Oreore",1);
    Book book2 = new Book("Imo","Iraira",2);
    Book book3 = new Book("Toriniku","Sabasaba",3);
    Book book4 = new Book("tamago","Mishimishi",4);
    Book book5 = new Book("Sashimi","NonNon",5);
    Book book6 = new Book("Mame","Tomitomi",6);
    Book book7 = new Book("Yakiniku","Sunasuna",7);
    Book book8 = new Book("Hakumai","Shimishimi",8);
    Book book9 = new Book("Udon","Ahaaha",9);
    System.out.println(book3.getTitle());

    List<Book> bookList = List.of(book1,book2,book3,book4,book5,book6,book7,book8,book9);
  }
}
