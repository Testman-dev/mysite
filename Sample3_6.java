import java.io.*;

public class Sample3_6 {
  public static void main(String[] args) throws IOException{
    //キーボードからの入力を促すメッセージ
    System.out.println("整数を2つ入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    //キーボードから入力した文字列をstrに読み込む("str"部分は変数名なので自由)
    String str1 = br.readLine();
    String str2 = br.readLine();

    //str型として入ってきた整数をint型に変換(キーボードからの入力はデフォルトでstr型となっている)
    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    System.out.println("最初に" + num1 + "が入力されました。");
    System.out.println("次に" + num2 + "が入力されました。");
  }
}