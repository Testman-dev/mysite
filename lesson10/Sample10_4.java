package lesson10;

//文字列を追加する

import java.io.*;

public class Sample10_4 {
  public static void main(String[] args) throws IOException{
    System.out.println("文字列を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

      //追加される文字列を入力させる
      String str1 = br.readLine();

      System.out.println("追加する文字列を入力してください。");

      //追加する文字列を入力させる
      String str2 = br.readLine();

      StringBuffer sb = new StringBuffer(str1);
      sb.append(str2);

      System.out.println(str1 + "に" + str2 + "を追加すると" + sb + "です。");
  }
}
