package lesson6;

//if文などと組み合わせる
public class Sample6_8 {
  public static void main(String[] args){
    boolean bl = false;
    for(int i=0; i<5; i++){
      for(int j=0; j<5; j++){
        if(bl == false){
          System.out.print("*");
          //blをtrueに上書き
          bl = true;
        }else{
          System.out.print("-");
          //blをfalseに上書き
          bl = false;
        }
      }
      System.out.print("\n");
    }
  }
}
