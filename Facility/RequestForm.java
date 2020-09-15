package facility;
import character.*;
import battle.*;

public class RequestForm extends Facility{
  // フィールド
  String quest1;
  String quest2;
  String quest3;
  String quest4;
  String quest5;

  // コンストラクト
  public RequestForm(){
    setName("集会所");
    this.quest1 = "No1:ゴブリン討伐";
    this.quest2 = "No2:ゴブリン軍団討伐";
    this.quest3 = "No3:スケルトン軍団討伐";
    this.quest4 = "No4:ゴブリンロード討伐";
    this.quest5 = "No5:ドラゴン討伐";
  }

  // メソッド
  public void requestForm(Hero h){
    int count = 0 ;

    System.out.println("");
    System.out.println("");
    System.out.println("ようこそ," + getName());
    System.out.println("");
    System.out.println("こちらではレベルにあったクエストをご紹介しています。\nレベルが上がればクエストが出現するかもしれませんよ...");
    while(count == 0){
      System.out.println("現在ご紹介できるクエストはこちらです。");
      System.out.println("");
      System.out.println("");
      System.out.println(this.quest1);
      System.out.println("");
      System.out.println(this.quest2);
      System.out.println("");
      if(h.getLevel() >= 5){
        System.out.println(this.quest3);
        System.out.println("");
        if(h.getLevel() >= 8){
          System.out.println(this.quest4);
          System.out.println("");
          if(h.getLevel() >= 10){
            System.out.println(this.quest5);
            System.out.println("");
          }
        }
      }
      System.out.println("No10:村に戻る");
      System.out.println("");
      System.out.println("");
      System.out.println("受けたいクエストがある場合はクエスト番号を入力してください！");
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
          System.out.println("");
          System.out.println("");
          System.out.println("こちらのクエストはゴブリン一体の討伐クエストでございます。");
          System.out.println("");
          System.out.println(this.quest1 + "でお間違いないでしょうか？");
          System.out.println("");
          System.out.println("よろしければ1を入力してください、戻る場合は一意外を入力してください。");
          int number1 = 0;
          try{
            number1 = new java.util.Scanner(System.in).nextInt();
          }catch(Exception e){
            System.out.println("");
            System.out.println(e);
            System.out.println("");
          }finally{
            if(number1 == 1){
              System.out.println("クエストを始めます！");
              try {
                Thread.sleep(1000);
              } catch (InterruptedException e) {
              }
              int game = GoblinBattle.monsterBattle(h);
              if(game == 1){
                System.out.println("クエストに成功しました！");
              }else{
                System.out.println("クエストに失敗しました！");
              }
            }else{
              System.out.println("集会所に戻ります");
            }
          }
          break;
          case 2:
          System.out.println("");
          System.out.println("");
          System.out.println("こちらのクエストは複数のゴブリン討伐クエストでございます。");
          System.out.println("");
          System.out.println(this.quest2 + "でお間違いないでしょうか？");
          System.out.println("");
          System.out.println("よろしければ1を入力してください、戻る場合は1意外を入力してください。");
          int number2 = 0;
          try{
            number2 = new java.util.Scanner(System.in).nextInt();
          }catch(Exception e){
            System.out.println("");
            System.out.println(e);
            System.out.println("");
          }finally{
            if(number2 == 1){
              System.out.println("クエストを始めます！");
              try {
                Thread.sleep(1000);
              } catch (InterruptedException e) {
              }
              int game = GoblinCorpsBattleQuest.monsterBattle(h);
              if(game == 1){
                System.out.println("クエストに成功しました！");
              }else{
                System.out.println("クエストに失敗しました！");
              }
            }else{
              System.out.println("集会所に戻ります");
            }
          }
          break;
          case 3:
          if(h.getLevel() < 5){
            System.out.println("");
            System.out.println("正しい番号を入力してください！");
            System.out.println("");
          }
          break;
          case 4:
          if(h.getLevel() < 8){
            System.out.println("");
            System.out.println("正しい番号を入力してください！");
            System.out.println("");
          }
          break;
          case 5:
          if(h.getLevel() < 10){
            System.out.println("");
            System.out.println("正しい番号を入力してください！");
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
