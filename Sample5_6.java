//switch文を文字で場合分けする
import java.io.*;

public class Sample5_6 {
  public static void main(String[] args) throws IOException{
    System.out.println("aかbを入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    //入力した文字の1文字目がresに格納される
    char res = str.charAt(0);

    switch(res){
      case 'a':
        System.out.println("aが入力されました。");
        break;
      case 'b':
        System.out.println("bが入力されました。");
        break;
      default:
        System.out.println("aかbを入力してください。");
        break;
    }
  }
}
