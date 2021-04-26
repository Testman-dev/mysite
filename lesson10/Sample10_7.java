package lesson10;

//オブジェクトを変更する

//車クラス
class Car2{
  private int num;
  private double gas;

  public Car2(){
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

public class Sample10_7 {
  public static void main(String[] args){
    Car2 car1;
    System.out.println("car1を宣言しました。");
    car1 = new Car2();
    car1.setCar(1234, 20.5);

    Car2 car2;
    System.out.println("car2を宣言しました。");

    car2 = car1;
    System.out.println("car2にcar1を代入しました。");

    System.out.print("car1がさす");
    car1.show();
    System.out.print("car2がさす");
    car2.show();

    System.out.println("car1がさす車に変更を加えます。");
    car1.setCar(2345, 30.5);

    //car1のみ変更しているにもかかわらずcar2もcar1と同じ出力結果になる
    //よって、car1とcar2は同じ1つのオブジェクトをさしている
    System.out.print("car1がさす");
    car1.show();
    System.out.print("car2がさす");
    car2.show();
  }
}
