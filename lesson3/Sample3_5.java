package lesson3;

import java.io.*;

public class Sample3_5 {
  public static void main(String[] args) throws IOException{
    //キーボードからの入力を促すメッセージ
    System.out.println("整数を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    //キーボードから入力した文字列をstrに読み込む("str"部分は変数名なので自由)
    String str = br.readLine();

    //str型として入ってきた整数をint型に変換(キーボードからの入力はデフォルトでstr型となっている)
    int num = Integer.parseInt(str);

    System.out.println(num + "が入力されました。");
  }
}