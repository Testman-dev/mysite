package lesson7;

import java.io.*;

//配列を(降順)ソートする
public class Sample7_9 {
  public static void main(String[] args) throws IOException{
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    int[] test = new int[5];
    System.out.println(test.length + "人の点数を入力してください。");

    for(int i=0; i<test.length; i++){
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }

    //入力された配列の先頭の要素(test[0])から比較していく(test[0,1,2,3,4])
    for(int s=0; s<test.length-1; s++){
    //2番目に入力された要素から比較する(2,3,4,5番目)
      for(int t=s+1; t<test.length; t++){
        //test[s]よりtest[t]の値が大きければ(例:2番目の要素が1番目の要素より大きければ)
        if(test[t] > test[s]){
          //tmpに大きい方の値を代入する
          int tmp = test[t];
          //大きい方は確定させ、小さい方をtest[t]に代入する
          test[t] = test[s];
          //大きい方であることが確定したtest[t]の値をtest[s]に代入する
          test[s] = tmp;
        }
      }
    }

    for(int j=0; j<test.length; j++){
      System.out.println((j+1) + "番目の人の点数は" + test[j] + "です。");
    }
  }
}
