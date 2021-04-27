package lesson11;

//super()を呼び出す

//車クラス
class Car2{
  private int num;
  private double gas;

  public Car2(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
  public Car2(int n, double g){
    num = n;
    gas = g;
    System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
  }
  public void show(){
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

//レーシングカークラス
class RacingCar2 extends Car2{
  private int course;

  public RacingCar2(){
    course = 0;
    System.out.println("レーシングカーを作成しました。");
  }
  public RacingCar2(int n, double g, int c){
    //super()と呼び出すことでスーパークラスの引数なしコンストラクタを使わない
    super(n, g);
    course = c;
    System.out.println("コース番号を" + course + "にしました。");
  }
}

public class Sample11_2 {
  public static void main(String[] args){
    RacingCar2 rccar1 = new RacingCar2(1234, 20.5, 5);
  }
}
