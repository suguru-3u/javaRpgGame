import character.*;
import item.*;
import Facility.*;
import Battle.*;

public class Main{
  public static void main(String[] args){
    // 勇者召喚
    Hero h = new Hero();
    // 冒険のループ変数
    int count = 0;

    System.out.println("");
    System.out.println("");
    System.out.println("ようこそ!!!");
    System.out.println("何をする?");
    System.out.println("");
    System.out.println("");
    while(count == 0){
      System.out.println("行動したいステータスを入力してください！");
      System.out.println("1,クエストの集会所に行く、2武器屋に行く、3教会に行く,4ステータスの確認、5:ゲームをやめる");
      int select = new java.util.Scanner(System.in).nextInt();
      switch(select){
        case 1:
          System.out.println("");
          System.out.println("集会所にいきます~");
          System.out.println("");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
          }
          facility.RequestForm r = new facility.RequestForm();
          r.requestForm(h);
        break;
        case 2:
          System.out.println("");
          System.out.println("武器屋に行く~");
          System.out.println("");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
          }
          facility.WeaponShop d = new facility.WeaponShop();
          d.weaponShopping(h);
        break;
        case 3:
          System.out.println("");
          System.out.println("教会に行く!!!");
          System.out.println("");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
          }
          facility.Church c = new facility.Church();
          c.hpRecovery(h);
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
