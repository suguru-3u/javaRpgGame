package facility;
import character.*;

public class Church extends Facility{
  // コンストラクト
  public Church(){
    super.name = "教会";
  }

  // メソッド
  public void hpRecovery(Hero h){
    // 教会ループ変数
    int count = 0 ;

    System.out.println("");
    System.out.println("");
    System.out.println("ようこそ," + super.name);
    System.out.println("");
    System.out.println("");
    System.out.println("ここではHPを回復できます。ただし対価を支払って頂きますがね....");
    System.out.println("");
    while(count == 0){
      System.out.println("================================================");
      System.out.println("現在の所持金： " + h.getMoney() + "G " + " 現在のHP：" + h.getHP());
      System.out.println("================================================");
      System.out.println("");
      System.out.println("あなたは神を信じますか?");
      System.out.println("信じるのなら選択してください。村に戻るなら１０を選択しなさい");
      System.out.println("");
      System.out.println("１：10G納めてHPを50回復する");
      System.out.println("");
      System.out.println("２：50G納めてHPを100回復する");
      System.out.println("");
      System.out.println("３：100G納めてHPを200回復する");
      System.out.println("");
      int select = 0;
      try{
        select = new java.util.Scanner(System.in).nextInt();
      }catch(Exception e){
        System.out.println("");
        System.out.println(e);
        System.out.println("");
      }finally{
        switch(select){
          case 1:
          if(h.getMoney() <= 10){
            System.out.println("所持金がたりません.....");
            System.out.println("お金を増やしてから購入してください！");
            System.out.println("");
          }else{
            System.out.println("");
            System.out.println("10Gを支払いHPを回復します！");
            h.setMoney(h.getMoney() - 10);
            h.hpMoneyRecovery(50);
            System.out.println("");
          }
          break;
          case 2:
          if(h.getMoney() <= 50){
            System.out.println("所持金がたりません.....");
            System.out.println("お金を増やしてから購入してください！");
            System.out.println("");
          }else{
            System.out.println("");
            System.out.println("50Gを支払いHPを回復します！");
            h.setMoney(h.getMoney() - 50);
            h.hpMoneyRecovery(100);
            System.out.println("");
          }
          break;
          case 3:
          if(h.getMoney() <= 100){
            System.out.println("所持金がたりません.....");
            System.out.println("お金を増やしてから購入してください！");
            System.out.println("");
          }else{
            System.out.println("");
            System.out.println("100Gを支払いHPを回復します！");
            h.setMoney(h.getMoney() - 100);
            h.hpMoneyRecovery(200);
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
