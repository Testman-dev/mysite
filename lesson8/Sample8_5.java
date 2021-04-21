package lesson8;

//複数の引数を持つメソッドを呼び出す

//車クラス
class Car5{
  int num;
  double gas;

  void setNumGas(int n, double g){
    num = n;
    gas = g;
    System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }
  void show(){
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}
public class Sample8_5 {
  public static void main(String[] args){
    Car5 car1 = new Car5();

    int number = 1234;
    double gasoline = 20.5;

    car1.setNumGas(number, gasoline);
    //引数のないメソッドも呼び出すことが可能
    car1.show();
  }
}
