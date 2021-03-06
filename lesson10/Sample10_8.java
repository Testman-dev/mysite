package lesson10;

//クラス型の変数に代入する

//車クラス
class Car3{
  private int num;
  private double gas;
  //クラス型の変数
  private String name;

  public Car3(){
    num = 0;
    gas = 0.0;
    name= "名無し";
    System.out.println("車を作成しました。");
  }
  public void setCar(int n, double g){
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
  }
  public void setName(String nm){
    name = nm;
    System.out.println("名前を" + name + "にしました。");
  }
  public void show(){
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
    System.out.println("名前は" + name + "です。");
  }
}

public class Sample10_8 {
  public static void main(String[] args){
    Car3 car1;
    car1 = new Car3();

    car1.show();

    int number = 1234;

    double gasoline = 20.5;
    //strに1号車という値を入れているが、出力する際にはnmに1号車が入っている
    //基本型は値渡し(呼び出し元と呼び出し先がさすオブジェクトは別)
    //クラス型は参照渡し(呼び出し元と呼び出し先がさすオブジェクトは同じ)
    String str = "1号車";

    car1.setCar(number, gasoline);
    car1.setName(str);

    car1.show();
  }
}
