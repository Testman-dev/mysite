package lesson14;

//finallyブロックをつける

public class Sample14_3 {
  public static void main(String[] args){
    try{
      int[] test;
      test = new int[5];

      System.out.println("test[10]に値を代入します。");

      test[10] = 80;
      System.out.println("test[10]に80を代入しました。");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("配列の要素をこえています。");
    }
    finally{
      //例外の発生にかかわらず行う処理
      System.out.println("最後に必ずこの処理をします。");
    }
    System.out.println("無事終了しました。");
  }
}
