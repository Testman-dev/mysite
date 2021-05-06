package lesson14;

//配列の数をこえて代入する(エラーが出る前提)

public class Sample14_1 {
  public static void main(String[] args){
    int[] test;
    test = new int[5];
    System.out.println("test[10]に値を代入します。");

    test[10] = 80;
    System.out.println("test[10]に80を代入しました。");
    System.out.println("無事終了しました。");
  }
}
