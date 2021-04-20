package lesson7;

//配列の長さを知る
public class Sample7_7 {
  public static void main(String[] args){
    int[] test = {80,60,22,50,75};

    for(int i=0; i<5; i++){
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
    }

    //変数名.lengthで配列の長さ(数)を知ることができる。
    System.out.println("テストの受験者は" + test.length + "人です。");
  }
}
