//小さなサイズの型に代入
public class Sample4_9 {
  public static void main(String[] args){
    double dnum = 160.5;

    System.out.println("身長は" + dnum + "センチです。");

    System.out.println("int型の変数に代入します。");
    //先に変数をint型にしておく
    int inum = (int)dnum;
    //出力される値は小数点以下切り捨て
    System.out.println("身長は" + inum + "センチです。");
  }
}
