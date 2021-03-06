package lesson12;

//instanceof演算子を使う

//のりものクラス
abstract class Vehicle2{
  protected int speed;
  public void setSpeed(int s){
    speed = s;
    System.out.println("速度を" + speed + "にしました。") ;
  }
  abstract void show();
  //処理内容が書かれていない
}

//車クラス
class Car2 extends Vehicle2{
  private int num;
  private double gas;

  public Car2(int n, double g){
    num = n;
    gas = g;
    System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
  }
  public void show(){
    System.out.println("車のナンバーは" + num + "です");
    System.out.println("ガソリン量は" + gas + "です。");
    System.out.println("速度は" + speed + "です。");
  }
}

//飛行機クラス
class Plane2 extends Vehicle2{
  private int flight;

  public Plane2(int f){
    flight = f;
    System.out.println("便" + flight + "の飛行機を作成しました。");
  }
  public void show(){
    System.out.println("飛行機の便は" + flight + "です。");
    System.out.println("速度は" + speed + "です。");
  }
}

public class Sample12_2 {
  public static void main(String[] args){
    Vehicle2[] vc;
    vc = new Vehicle2[2];

    vc[0] = new Car2(1234, 20.5);
    vc[1] = new Plane2(232);

    for(int i=0; i<vc.length; i++){
      //instanceof演算子によりオブジェクトのクラスを調べることができる
      if(vc[i] instanceof Car2)
        System.out.println((i+1) + "番目のオブジェクトはCarクラスです。");
      else
        System.out.println((i+1) + "番目のオブジェクトはCarクラスではありません。");
    }
  }
}
