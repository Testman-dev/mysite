import java.io.*;

public class Sample3_4 {
  public static void main(String[] args) throws IOException{
    //キーボードからの入力を促すメッセージ
    System.out.println("文字列を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    //キーボードから入力した文字列をstrに読み込む("str"部分は変数名なので自由)
    String str = br.readLine();

    System.out.println(str + "が入力されました。");
  }
}
