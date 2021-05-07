package lesson14;

//例外を送出する
//独自の例外クラスを宣言する
class CarException extends Exception{}

//車クラス
class Car{
  private int num;
  private double gas;

  public Car(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
  //事前に用意した例外クラスを使うかもしれないことを宣言する
  public void setCar(int n, double g) throws CarException{
    //gが0より小さければエラーを送出する
    if(g < 0){
      CarException e = new CarException();
      throw e;
    }
    else{
      num = n;
      gas = g;
      System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
  }
  public void show(){
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

public class Sample14_5 {
  public static void main(String[] args){
    Car car1 = new Car();
    try{
      car1.setCar(1234, -10.0);
    }
    catch(CarException e){
      System.out.println(e + "が送出されました。");
    }
    car1.show();
  }
}
