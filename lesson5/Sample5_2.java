package lesson5;

//複数の文を処理するif文を使う
import java.io.*;

public class Sample5_2 {
  public static void main(String[] args) throws IOException{
    System.out.println("整数を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    //キーボードからの入力を変数resに格納
    int res =  Integer.parseInt(str);
    //複数の文を処理する場合はブロックにする必要あり
    if(res == 1){
      System.out.println("1が入力されました。");
      System.out.println("1が選択されました。");
    }

    System.out.println("処理を終了します。");
  }
}