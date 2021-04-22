package lesson9;

//別のコンストラクタを呼び出す

//車クラス
class Car6{
  private int num;
  private double gas;

  public Car6(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
  public Car6(int n, double g){
    //引数のないコンストラクタの呼び出し
    this();
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }
  public void show(){
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

public class Sample9_6 {
  public static void main(String[] args){
    //引数がない=コンストラクタの呼び出し
    Car6 car1 = new Car6();
    car1.show();
    
    //引数がある=メソッドの呼び出し
    Car6 car2 = new Car6(1234, 20.5);
    car2.show();
  }
}
