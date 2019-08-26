import java.util.Scanner;
class Janken{
    public static void main(String args[]) {
      String a = "A";
      String b = "B";
      int num1 = pon(a);
      int num2 = pon(b);
      judge(a,num1,b,num2);
    }
    static void judge(String a , int num1, String b,int num2){
      if(num1 == num2){
        System.out.println("あいこです");
      }else if( ((num1 ==0)&&(num2==1)) || ((num1 ==1)&&(num2==2)) || ((num1 ==2)&&(num2==0)) ){
        System.out.println(a + "さんの勝ちです");
      }else{
        System.out.println(b + "さんの勝ちです");
      }
    }
    static int pon(String person){
      System.out.println(person + "さんの数字を入力してください。グーが0、チョキが1、パーが2です。");
      Scanner scan = new Scanner(System.in);
      int hand = scan.nextInt();
      while(hand !=0 && hand !=1 && hand !=2){
        System.out.println("もういちど入力してください");
        hand = scan.nextInt();
      }
      String[] HandMark = {"グー","チョキ","パー"};
      System.out.println(person + "さんの出した手は" + HandMark[hand] + "ですね");
      return hand;
    }
}
