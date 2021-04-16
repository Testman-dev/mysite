package lesson5;

//条件演算子(?)を使う
import java.io.*;

public class Sample5_8 {
  public static void main(String[] args) throws IOException{
    System.out.println("何番目のコースにしますか？");
    System.out.println("整数を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);
    //入力された数字が1ならA、それ以外ならBという処理
    char ans = (res == 1) ? 'A' : 'B';

    System.out.println(ans + "コースを選択しました。");
  }
}
