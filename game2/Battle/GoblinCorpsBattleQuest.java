package battle;
import character.*;

public class GoblinCorpsBattleQuest extends Battle{

  // ゴブリン軍団討伐クエストメゾット
  public int monsterBattle(Hero h){
    // 勝利判定の変数
    int game = 0;
    // ゴブリン生成
    Goblin g[] = new Goblin[3];
    g[0] = new Goblin("ゴブリン:0",0);
    g[1] = new Goblin("ゴブリン:1",1);
    g[2] = new Goblin("ゴブリン:2",2);

    System.out.println("");
    System.out.println("");
    System.out.println("ゴブリン討伐クエスト開始！！！");
    System.out.println("");
    System.out.println("ゴブリン達が現れた！！！");
    System.out.println("ゴブリン達との戦闘開始");
    System.out.println("");
    int count = 0;
    while(count == 0){
      System.out.println("================================================");
      System.out.println("勇者のレベル: " + h.getLevel() + " 勇者のHP: " + h.getHP() + " 経験値: " + h.getExperiencePoint());
      System.out.println("");
      for(Goblin goblins : g){
        if(goblins.getHP() >= 0){
          System.out.println(goblins.getName() + "のHP: " + goblins.getHP());
        }
      }
      System.out.println("================================================");
      System.out.println("");
      System.out.println("戦闘コマンドを選択してください");
      System.out.println("1:闘う");
      System.out.println("");
      int select = new java.util.Scanner(System.in).nextInt();
      switch(select){
        case 1:
          System.out.println("");
          System.out.println("攻撃するモンスターの番号を入力してください！");
          System.out.println("");
          int monsterSelect = new java.util.Scanner(System.in).nextInt();
          h.attack(g[monsterSelect]);
          for(Goblin goblins : g){
            if(goblins.getHP() >= 0){
              goblins.attack(h);
            }
          }
          if(h.getHP() <= 0){
            System.out.println("");
            System.out.println("負けました.....");
            System.out.println("");
            count = 1;
          }
          for(Goblin goblins : g){
            if(goblins.getHP() <= 0){
              goblins.setSurvival();
              System.out.println("");
              System.out.println(goblins.getName() + "は勇者にやられました....");
              System.out.println("");
            }
          }
          int monsterSurvivalCount = 0;
          for(Goblin goblins : g){
            boolean survival = goblins.getSurvival();
            if(!survival){
              monsterSurvivalCount += 1;
              if(monsterSurvivalCount == 3){
                int experiencePoint = 30;
                int money = 30;
                System.out.println("");
                System.out.println("ゴブリン軍団に勝ちました！！！！！");
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
            }
          }
          monsterSurvivalCount = 0;
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
