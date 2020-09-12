package facility;
import character.*;
import battle.*;

public class RequestForm extends Facility{
  // コンストラクト
  public RequestForm(){
    super.name = "集会所";
  }

  // メソッド
  public void requestForm(Hero h){
    int count = 0 ;

    System.out.println("");
    System.out.println("");
    System.out.println("ようこそ," + super.name);
    System.out.println("");
    System.out.println("");
    while(count == 0){
      System.out.println("現在ご紹介できるクエストはこちらです。");
      System.out.println("");
      System.out.println("");
      System.out.println("No1:ゴブリン討伐");
      System.out.println("");
      System.out.println("No2:ゴブリン軍団討伐");
      System.out.println("");
      System.out.println("No10:村に戻る");
      System.out.println("");
      System.out.println("");
      System.out.println("受けたいクエストがある場合はクエスト番号を入力してください！");
      int select = new java.util.Scanner(System.in).nextInt();
      switch(select){
        case 1:
          System.out.println("");
          System.out.println("");
          System.out.println("こちらのクエストはゴブリン一体の討伐クエストでございます。");
          System.out.println("");
          System.out.println("No1:ゴブリン討伐のクエストでよろしいでしょうか？");
          System.out.println("");
          System.out.println("よろしければ1を入力してください、戻る場合は一意外を入力してください。");
          int number1 = new java.util.Scanner(System.in).nextInt();
          if(number1 == 1){
            System.out.println("クエストを始めます！");
            try {
              Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            battle.GoblinBattle goblin = new battle.GoblinBattle();
            int game = goblin.monsterBattle(h);
            if(game == 1){
              System.out.println("クエストに成功しました！");
            }else{
              System.out.println("クエストに失敗しました！");
            }
          }else{
            System.out.println("集会所に戻ります");
          }
        break;
        case 2:
        System.out.println("");
        System.out.println("");
        System.out.println("こちらのクエストは複数のゴブリン討伐クエストでございます。");
        System.out.println("");
        System.out.println("No2:ゴブリン軍団討伐のクエストでよろしいでしょうか？");
        System.out.println("");
        System.out.println("よろしければ1を入力してください、戻る場合は1意外を入力してください。");
        int number2 = new java.util.Scanner(System.in).nextInt();
        if(number2 == 1){
          System.out.println("クエストを始めます！");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
          }
          battle.GoblinCorpsBattleQuest goblins = new battle.GoblinCorpsBattleQuest();
          int game = goblins.monsterBattle(h);
          if(game == 1){
            System.out.println("クエストに成功しました！");
          }else{
            System.out.println("クエストに失敗しました！");
          }
        }else{
          System.out.println("集会所に戻ります");
        }
        break;
        case 10:
          System.out.println("");
          System.out.println("村に戻ります！");
          System.out.println("");
          count += 1;
        break;
      }
    }
  }
}
