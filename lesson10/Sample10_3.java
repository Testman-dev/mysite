package lesson10;

//文字を検索する

import java.io.*;

public class Sample10_3 {
  public static void main(String[] args) throws IOException{
    System.out.println("文字列を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    //検索される文字列を入力させる
    String str1 = br.readLine();

    System.out.println("検索文字を入力してください。");

    String str2 = br.readLine();
    char ch = str2.charAt(0);

    //indexOf()メソッドは文字列から文字を検索して、最初にあらわれる位置を返す
    int num = str1.indexOf(ch);

    if(num != -1)
      System.out.println(str1 + "の" + (num+1) + "番目に「" + ch + "」がみつかりました。");
    else
      System.out.println(str1 + "に「" + ch + "」はありません。");
  }
}
