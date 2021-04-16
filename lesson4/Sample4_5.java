package lesson4;

//前置(++a)と後置(a++)の違い
public class Sample4_5 {
  public static void main(String[] args){
    int a = 0;
    int b = 0;

    b = ++a;

    System.out.println("代入前にインクリメントしたのでbの値は" + b + "です。");
  }
}
