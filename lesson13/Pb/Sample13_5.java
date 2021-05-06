package lesson13.Pb;

//異なるパッケージのクラスを利用する

public class Sample13_5 {
  public static void main(String[] args){
    lesson13.Pc.Car car1 = new lesson13.Pc.Car();
    car1.show();
  }
}
