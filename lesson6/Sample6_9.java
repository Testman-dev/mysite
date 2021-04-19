package lesson6;

import java.io.*;

//break文でブロックから抜ける
public class Sample6_9 {
  public static void main(String[] args) throws IOException{
    System.out.println("何番目でループを中止しますか？(1～10)");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
      
    String str = br.readLine();
    int res = Integer.parseInt(str);

    for(int i=1; i<=10; i++){
      System.out.println(i + "番目の処理です。");
      //入力した数字の周回まで来たら終わり
      if(i == res)
        break;
    }
  }
}
