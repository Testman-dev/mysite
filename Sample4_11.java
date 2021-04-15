public class Sample4_11 {
  public static void main(String[] args){
    int num1 = 5;
    int num2 = 4;

    //少なくともどちらか一方をキャスト演算子で変換する。
    double div = (double)num1 / num2;

    System.out.println("5/4は" + div + "です。");
  }
}
