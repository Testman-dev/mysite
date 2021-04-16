package lesson4;

//異なる型同士の演算
public class Sample4_10 {
  public static void main(String[] args){
    int d = 2;
    double pi = 3.14;

    System.out.println("直径が" + d + "センチの円の");
    //自動で大きなサイズの型に変換して演算を行う
    System.out.println("円周は" + (d*pi) + "センチです。");
  }
}
