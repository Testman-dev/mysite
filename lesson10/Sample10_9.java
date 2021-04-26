package lesson10;

//オブジェクトを配列で扱う

//車クラス
class Car4{
  private int num;
  private double gas;

  public Car4(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
  public void setCar(int n, double g){
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }
  public void show(){
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

public class Sample10_9 {
  public static void main(String[] args){
    Car4[] cars;
    cars = new Car4[3];

    for(int i=0; i<cars.length; i++){
      cars[i] = new Car4();
    }

    cars[0].setCar(1234,20.5);
    cars[1].setCar(2345,30.5);
    cars[2].setCar(3456,40.5);

    for(int i=0; i<cars.length; i++){
      cars[i].show();
    }
  }
}
