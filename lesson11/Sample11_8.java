package lesson11;

//equals()メソッドを使う

class Car8{
  protected int num;
  protected double gas;

  public Car8(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
} 

public class Sample11_8 {
  public static void main(String[] args){
    //car1とcar2は異なるオブジェクトをさす
    Car8 car1 = new Car8();
    Car8 car2 = new Car8();

    //car1とcar3は同じオブジェクトを指す
    Car8 car3;
    car3 = car1;

    //car1とcar2がさすオブジェクトが同じかどうか
    boolean bl1 = car1.equals(car2);
    //car1とcar3がさすオブジェクトが同じかどうか
    boolean bl2 = car1.equals(car3);

    System.out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。");
    System.out.println("car1とcar3が同じか調べたところ" + bl2 + "でした。");
  }
}
