package lesson9;

//コンストラクタが呼び出される
//そのクラスのオブジェクトが作成されたときに、定義しておいたコンストラクタ内の処理が自動的に行われる
//オブジェクトのメンバに自動的に初期値を設定する

//車クラス
class Car4{
  private int num;
  private double gas;

  public Car4(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
  public void show(){
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}
public class Sample9_4 {
  public static void main(String[] args){
    Car4 car1 = new Car4();

    car1.show();
  }
}
