public class Field{

  // 始まりの村
  public void villageOfBeginning(Villagehead v,Hero h,Sword sword){
    v.talk();
    int t = 0;
    while(t == 0){
      System.out.println("行動を選択してください！");
      System.out.println("１：村を出発する、２：ステータスを確認する、３：修行、４：買い物、５持ち物");
      int selected = new java.util.Scanner(System.in).nextInt();
      switch(selected){
        case 1:
          System.out.println("");
          System.out.println("");
          System.out.println("村を出発します");
          System.out.println("");
          System.out.println("");
          t += 1;
          break;
        case 2:
          System.out.println("");
          System.out.println("");
          System.out.println("名前：" + h.getNmae() + "     HP：" + h.getHp() + "     現在のレベル： " + h.getLevel() + "     合計経験値 ： " + h.getExperiencepoint() + "     レベルアップまで ： " + h.getLevelUpValue() + "     攻撃力 ： " + h.getOffensivepower() + "  防御力 : " + h.getDefensepower() + "  所持金 : " + h.getMoney());
          System.out.println("");
          System.out.println("");
          break;
        case 3:
          System.out.println("");
          System.out.println("");
          System.out.println("レベル上がるかな?");
          int levelpoint = new java.util.Random().nextInt(3);
          if(levelpoint == 1){
            System.out.println("");
            System.out.println("");
            System.out.println("修行成功！");
            System.out.println("");
            System.out.println("");
            h.setExperiencepoint(80);
            h.setMoney(10);
          }else if(levelpoint == 2){
            System.out.println("");
            System.out.println("");
            System.out.println("修行大成功！");
            System.out.println("");
            System.out.println("");
            h.setExperiencepoint(160);
            h.setMoney(50);
          }
          if(h.getExperiencepoint() > h.getLevelUpValue()){
            h.levelUp();
          }
          System.out.println("");
          System.out.println("");
          break;
        case 4:
          System.out.println("");
          System.out.println("");
          System.out.println("村人A「ようこそ村の市場へ!\n本日は何をお買い物されますか？」");
          System.out.println("");
          System.out.println("");
          System.out.println("所持金を確認し、買いたいものがあれば番号を入力してください。");
          System.out.println("");
          System.out.println("");
          System.out.println("現在の所持金" + h.getMoney());
          System.out.println("");
          System.out.println("");
          System.out.println("１：普通の剣 10G");
          System.out.println("");
          System.out.println("");
          int select = new java.util.Scanner(System.in).nextInt();
          if(select == 1){
            if(h.money > sword.price && h.sword == null){
              h.wear(sword);
            }else{
              System.out.println("お金がたりません....\n修行してお金を稼ぎましょう！");
            }
          }
          break;
        case 5:
          System.out.println("");
          System.out.println("");
          System.out.println("現在持っているアイテムはこちらです。");
          System.out.println("");
          System.out.println("");
          if(h.getSword() != null){
            System.out.println(h.getSword());
          }else{
            System.out.println("持っているアイテムはありません");
          }
          System.out.println("");
          System.out.println("");
          System.out.println("装備する場合は1を入力してください。");
          int selec = new java.util.Scanner(System.in).nextInt();
          if(selec == 1){
            System.out.println("");
            System.out.println("");
            sword.wear(h);
            System.out.println("");
            System.out.println("");
          }
          break;
        default:
          System.out.println("");
          System.out.println("");
          System.out.println("半角数字を入力してください！");
          System.out.println("");
          System.out.println("");
            break;
      }
    }
  }
}
