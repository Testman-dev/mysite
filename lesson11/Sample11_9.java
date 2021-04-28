package lesson11;

//getClass()メソッドを使う

//車クラス
class Car9{
  protected int num;
  protected double gas;

  public Car9(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
}

//レーシングカークラス
//車クラスを拡張したレーシングカークラスを作る宣言
class RacingCar9 extends Car9{
  private int course;

  public RacingCar9(){
    course = 0;
    System.out.println("レーシングカーを作成しました。");
  }
}

public class Sample11_9 {
  public static void main(String[] args){
    //Car9をもとにしてcarsという配列を作る
    Car9[] cars;
    //carsに二つの入れ物を配置する
    cars = new Car9[2];

    //1番目のオブジェクトはCarクラス
    cars[0] = new Car9();
    //2番目のオブジェクトはRacingCarクラス
    cars[1] = new RacingCar9();

    for(int i=0; i<cars.length; i++){
      //何番目の配列に何クラスのオブジェクトが入っているか
      Class cl = cars[i].getClass();
      System.out.println((i+1) + "番目のオブジェクトのクラスは" + cl + "です。");
    }
  }
}
