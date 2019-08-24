import java.util.Scanner;
class Janken{
    public static void main(String args[]) {
      String a = "A";
      String b = "B";
      int num1 = Pon(a);
      int num2 = Pon(b);
      Judge(a,num1,b,num2);
    }
    static String GooChokiPa(int num){
      String DasitaTe ="";
      switch(num){
        case 1:
        DasitaTe ="グー";
        break;
        case 2:
        DasitaTe ="チョキ";
        break;
        case 3:
        DasitaTe ="パー";
        break;
      }
      return DasitaTe;
    }
    static void Judge(String a , int num1, String b,int num2){
      if(num1 == num2){
        System.out.println("あいこです");
      }else if( ((num1 ==1)&&(num2==2)) || ((num1 ==2)&&(num2==3)) || ((num1 ==3)&&(num2==1)) ){
        System.out.println(a + "さんの勝ちです");
      }else{
        System.out.println(b + "さんの勝ちです");
      }
    }
    static int Pon(String Person){
      System.out.println(Person + "さんの数字を入力してください。グーが1、チョキが2、パーが3です。");
      Scanner scan = new Scanner(System.in);
      int hand = scan.nextInt();
      while(hand !=1 && hand !=2 && hand !=3){
        System.out.println("もういちど入力してください");
        hand = scan.nextInt();
      }
      System.out.println(Person + "さんの出した手は" + GooChokiPa(hand) + "ですね");
      return hand;
    }
}
