import character.*;

public class GoblinBattle extends Battle{
  // メソッド
  public void monsterBattle(){
    System.out.println("");
    System.out.println("");
    System.out.println("ゴブリン討伐クエスト開始！！！");
    System.out.println("");
    System.out.println("");
    System.out.println("ゴブリンが現れた！！！");
    System.out.println("ゴブリンとの戦闘開始");
    System.out.println("");
    System.out.println("");
    Hero h = new Hero();
    Goblin g = new Goblin();
    int count = 0;
    while(count == 0){
      System.out.println("");
      System.out.println("");
      System.out.println("勇者のHP: " + h.getHP());
      System.out.println("ゴブリンのHP: " + g.getHP());
      System.out.println("");
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
            System.out.println("");
            System.out.println("");
            System.out.println("勝ちました！！！！！");
            System.out.println("");
            System.out.println("");
            count = 1;
          }
        break;
      }
    }
  }
}
