import character.*;

public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    int count = 0;

    System.out.println("");
    System.out.println("");
    System.out.println("ようこそ!!!");
    System.out.println("何をする?");
    System.out.println("");
    System.out.println("");
    while(count == 0){
      System.out.println("行動したいステータスを入力してください！");
      System.out.println("1,クエストの集会所に行く、2武器屋に行く、3商店に行く,4ステータスの確認、5:ゲームをやめる");
      int select = new java.util.Scanner(System.in).nextInt();
      switch(select){
        case 1:
          System.out.println("");
          System.out.println("");
          System.out.println("集会所にいきます");
          System.out.println("");
          System.out.println("");
          try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
          }
          RequestForm r = new RequestForm();
          r.requestForm(h);
        break;
        case 5:
          System.out.println("");
          System.out.println("");
          System.out.println("ゲームをやめます");
          System.exit(0);
        break;
      }
    }
  }
}
