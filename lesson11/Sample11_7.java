package lesson11;

//toString()メソッドをオーバーライドする

//車クラス
class Car7{
  protected int num;
  protected double gas;

  public Car7(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
  public void setCar(int n, double g){
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }
  //オブジェクトを文字列であらわしたものを戻り値として返す
  public String toString(){
    String str = "ナンバー:" + num + "ガソリン量:" + gas;
    return str;
  }
}

public class Sample11_7 {
  public static void main(String[] args){
    Car7 car1 = new Car7();
    car1.setCar(1234, 20.5);

    System.out.println(car1);
  }
}
