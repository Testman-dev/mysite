package lesson7;

//繰り返し条件に配列の長さを指定する
public class Sample7_8 {
  public static void main(String[] args){
    int[] test = {80,60,22,50,75};

    //受験者人数を書き換える必要がなくなる
    for(int i=0; i<test.length; i++){
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
    }

    System.out.println("テストの受験者は" + test.length + "人です。");
  }
}
