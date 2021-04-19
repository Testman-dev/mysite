package lesson6;

//do～while文を使う
//whileとの違いはループ内を最低一度は実行すること
public class Sample6_6 {
  public static void main(String[] args){
    int i = 1;
    do{
      System.out.println(i + "番目の繰り返しです。");
      i++;
    }while(i <= 5);

      System.out.println("繰り返しが終わりました。");
  }
}
