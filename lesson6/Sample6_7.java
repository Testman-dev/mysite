package lesson6;

//for文をネストする
public class Sample6_7 {
  public static void main(String[] args){
    //iは0から5未満まで、jは0から3未満までループする
    for(int i=0; i<5; i++){
      for(int j=0; j<3; j++){
        System.out.println("iは" + i + ":jは" + j);
      }
    }
  }
}
