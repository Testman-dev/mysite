package lesson7;

//要素の値を変更する
public class Sample7_6 {
  public static void main(String[] args){
    int[] test1;
    test1 = new int[3];
    System.out.println("test1を宣言しました。");
    System.out.println("配列要素を確保しました。");

    test1[0] = 80;
    test1[1] = 60;
    test1[2] = 22;

    int[] test2;
    System.out.println("test2を宣言しました。");

    test2 = test1;
    System.out.println("test2にtest1を代入しました。");

    for(int i=0; i<3; i++){
      System.out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です。");
    }

    for(int i=0; i<3; i++){
      System.out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です。");
    }

    //test1のみ変更したが、test2も同時に変更されている。
    //よって、test1とtest2は異なる2つの配列ではなく同じ1つの配列を指している。
    test1[2] = 100;
    System.out.println("test1がさす3番目の人の点数を変更します。");

    for(int i=0; i<3; i++){
      System.out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です。");
    }

    for(int i=0; i<3; i++){
      System.out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です。");
    }
  }
}
