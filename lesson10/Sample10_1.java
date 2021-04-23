package lesson10;

//文字列の長さと文字を取り出す

public class Sample10_1 {
  public static void main(String[] args){
    String str = "Hello";

    //変数strから1番目の文字を取り出す
    char ch1 = str.charAt(0);
    //変数strから2番目の文字を取り出す
    char ch2 = str.charAt(1);

    int len = str.length();

    System.out.println(str + "の1番目の文字は" + ch1 + "です。");
    System.out.println(str + "の2番目の文字は" + ch2 + "です。");
    System.out.println(str + "の長さは" + len + "です。");
  }
}
