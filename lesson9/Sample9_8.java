package lesson9;

//クラス変数・クラスメソッドを記述する
//クラス変数・クラスメソッドにするにはstaticを付ける

//車クラス
class Car8{
  //クラス変数
  public static int sum = 0;

  private int num;
  private double gas;

  public Car8(){
    num = 0;
    gas = 0.0;
    sum++;
    System.out.println("車を作成しました。");
  }
  public void setCar(int n, double g){
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }
  //クラスメソッド
  public static void showSum(){
    //sumはクラス全体で何台の車(いくつのオブジェクト)が存在しているか
    System.out.println("車は全部で" + sum + "台あります。");
  }
  public void show(){
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

public class Sample9_8 {
  public static void main(String[] args){
    Car8.showSum();

    Car8 car1 = new Car8();
    car1.setCar(1234, 20.5);

    Car8.showSum();

    Car8 car2 = new Car8();
    car2.setCar(4567, 30.5);

    Car8.showSum();
  }
}
