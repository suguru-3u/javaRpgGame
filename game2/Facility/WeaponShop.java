package facility;
import character.*;
import battle.*;

public class WeaponShop extends Facility{
  // コンストラクト
  public WeaponShop(){
    super.name = "武器屋";
  }

  // メソッド
  // 買い物
  public void weaponShopping(Hero h){
    // 武器屋変数
    int count = 0 ;
    // 武器生成
    item.Sword s = new item.Sword("普通の剣",100,20,10);
    item.Sword k = new item.Sword("高級の剣",300,60,30);

    System.out.println("");
    System.out.println("ようこそ" + this.name + "へ!!!");
    System.out.println("");
    while(count == 0){
      System.out.println("================================================");
      System.out.println("現在の所持金： " + h.getMoney() + "G" + " 装備している武器： " + (h.getSword()).getName() );
      System.out.println("================================================");
      System.out.println("");
      System.out.println("購入したい武器があれば番号を入力してくれ！。村に戻る場合は10を入力してくれ！");
      System.out.println("");
      System.out.println("１： " + s.getName() + " 価格： " + s.getPrice()
       + " 攻撃力： " + s.getOffensivePower() + " 防御力 " + s.getDefensePower());
      System.out.println("");
      System.out.println("２： " + k.getName() + " 価格： " + k.getPrice()
       + " 攻撃力： " + k.getOffensivePower() + " 防御力 " + k.getDefensePower());
      System.out.println("");
      int selectWeapon = 0;
      try{
        selectWeapon = new java.util.Scanner(System.in).nextInt();
      }catch(Exception e){
        System.out.println("");
        System.out.println(e);
        System.out.println("");
      }finally{
        switch(selectWeapon){
          case 1:
          System.out.println("");
          System.out.println("１： " + s.getName() + " 価格： " + s.getPrice()
          + " 攻撃力： " + s.getOffensivePower() + " 防御力 " + s.getDefensePower() + "を購入します。よろしいですか？");
          System.out.println("");
          System.out.println("よろしければ１を入力してください！買わない場合は１意外を入力してください！");
          System.out.println("");
          if(h.getMoney() < s.getPrice()){
            System.out.println("所持金がたりません.....");
            System.out.println("お金を増やしてから購入してください！");
            System.out.println("");
          }else{
            System.out.println("");
            System.out.println(s.getName() + "を購入し、装備します！");
            h.swordwear(s);
            System.out.println("");
          }
          break;
          case 2:
          System.out.println("");
          System.out.println("１： " + k.getName() + " 価格： " + k.getPrice()
          + " 攻撃力： " + k.getOffensivePower() + " 防御力 " + k.getDefensePower() + "を購入します。よろしいですか？");
          System.out.println("");
          System.out.println("よろしければ１を入力してください！買わない場合は１意外を入力してください！");
          System.out.println("");
          if(h.getMoney() < k.getPrice()){
            System.out.println("所持金がたりません.....");
            System.out.println("お金を増やしてから購入してください！");
            System.out.println("");
          }else{
            System.out.println("");
            System.out.println(k.getName() + "を購入し、装備します！");
            h.swordwear(k);
            System.out.println("");
          }
          break;
          case 10:
          System.out.println("");
          System.out.println("村に戻ります！");
          System.out.println("");
          count += 1;
          break;
          default:
          System.out.println("");
          System.out.println("正しい番号を入力してください！");
          System.out.println("");
          break;
        }
      }
    }
  }
}
