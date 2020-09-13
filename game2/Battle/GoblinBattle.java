package battle;
import character.*;

public class GoblinBattle extends Battle{
  // メソッド
  public int monsterBattle(Hero h){
    // 勝利判定の変数
    int game = 0;

    System.out.println("");
    System.out.println("");
    System.out.println("ゴブリン討伐クエスト開始！！！");
    System.out.println("");
    System.out.println("");
    System.out.println("ゴブリンが現れた！！！");
    System.out.println("ゴブリンとの戦闘開始");
    System.out.println("");
    System.out.println("");
    Goblin g = new Goblin("ゴブリン",0);
    int count = 0;
    while(count == 0){
      System.out.println("");
      System.out.println("================================================");
      System.out.println("勇者のレベル: " + h.getLevel() + " 勇者のHP: " + h.getHP() + " 経験値: " + h.getExperiencePoint());
      System.out.println("ゴブリンのHP: " + g.getHP());
      System.out.println("================================================");
      System.out.println("");
      System.out.println("戦闘コマンドを選択してください");
      System.out.println("1:闘う");
      int select = new java.util.Scanner(System.in).nextInt();
      switch(select){
        case 1:
          h.attack(g);
          g.attack(h);
          if(h.getHP() <= 0){
            System.out.println("");
            System.out.println("");
            System.out.println("負けました.....");
            System.out.println("");
            System.out.println("");
            count = 1;
          }
          if(g.getHP() <= 0){
            int experiencePoint = 10;
            int money = 10;
            System.out.println("");
            System.out.println("");
            System.out.println("ゴブリンに勝ちました！！！！！");
            System.out.println("");
            System.out.println("");
            System.out.println("経験値を" + experiencePoint + "ゲットした！");
            System.out.println("");
            System.out.println("");
            h.setExperiencePoint(experiencePoint);
            h.setMoney(money);
            if(h.getExperiencePoint() >= h.getLevelUpValue()){
              h.levelup();
            }
            game = 1;
            count = 1;
          }
        break;
        default:
          System.out.println("");
          System.out.println("正しい番号を入力してください！");
          System.out.println("");
        break;
      }
    }
    return game;
  }
}
