package lesson14;

//ファイルから入力する

import java.io.*;

public class Sample14_8 {
  public static void main(String[] args){
    try{
      //test1.txtを読み込むことを宣言する
      BufferedReader br = new BufferedReader(new FileReader("test1.txt"));

      //1行ずつ読み込む
      String str1 = br.readLine();
      String str2 = br.readLine();

      System.out.println("ファイルに書き込まれている2つの文字列は");
      System.out.println(str1 + "です。");
      System.out.println(str2 + "です。");

      br.close();
    }
    catch(IOException e){
      System.out.println("入出力エラーです。");
    }
  }
}
