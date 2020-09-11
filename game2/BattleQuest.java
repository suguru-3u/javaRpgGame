public class BattleQuest{
  // フィールド
  String name;

  // コンストラクト
  public BattleQuest(String name){
    this.name = name
  }

  // メソッド
  public void battleQuest(){
    System.out.println("");
    System.out.println("");
    System.out.println("こちらのクエストは" + this.name + "の討伐クエストでございます。");
    System.out.println("");
    System.out.println(this.name + "の討伐のクエストで間違いないですか？");
    System.out.println("");
    System.out.println("よろしければ1を入力してください、戻る場合は一意外を入力してください。");
    int number = new java.util.Scanner(System.in).nextInt();
    if(number == 1){
      System.out.println("クエストを始めます！");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      GoblinBattle g = new GoblinBattle();
      int game = g.monsterBattle(h);
      if(game == 1){
        System.out.println("クエストに成功しました！");
      }else{
        System.out.println("クエストに失敗しました！");
      }
    }else{
      System.out.println("集会所に戻ります");
    }
  }
}
