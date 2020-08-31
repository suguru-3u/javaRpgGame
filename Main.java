// ゲームの説明
// 勇者の名前の入力
// 戦いのチュートリアル
// 村にいく
// 魔王城を目指す
// 敵と遭遇
// 魔王
// エンドロール

public class Main{
  public static void main(String[] args){
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println("ようこそ魔王フルボッコダンジョンへ！！！");
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println("このゲームは魔王に侵略されている世界を救う物語です！\nさあ、魔王をボコボコにして世界を救いましょう！");
    System.out.println("");
    System.out.println("あなたの名前を教えていただけませんか?");
    System.out.println("");
    String heroname = new java.util.Scanner(System.in).nextLine();
    Hero h = new Hero(heroname);
    System.out.println(h.name + "さん、こんにちわ！\nこの世界は魔王に侵略されています。魔王を倒し世界に平和を取り戻しましょう！");
    System.out.println("");
    System.out.println("いきなり魔王軍の部下のガイコツが襲ってきた!!!!!!!");
    System.out.println("");
    System.out.println("いきなり、敵がきましたね,早速ですが戦い方を教えます!");
    System.out.println("");

    // チュートリアルの戦闘
    Monster m = new Monster("ガイコツ",20,10);
    int s = 0;
    int monsterHp = m.getHp();
    while(s == 0){
      System.out.println("敵の名前 " + m.name + " : HP " + monsterHp);
      System.out.println("");
      System.out.println("");
      System.out.println("敵との戦闘でアタックで敵にダメージを与えられて、敵のライフをゼロにすることができたら勝ちです！\nアタックを選択して敵を倒してください！");
      System.out.println("");
      System.out.println("");
      System.out.println("アタックする場合は半角の数字の1を入力してください!");
      System.out.println("行動を選択してください!");
      System.out.println("");
      System.out.println("");
      int selected = new java.util.Scanner(System.in).nextInt();
      switch(selected){
        case 1:
          monsterHp = h.attack(m,monsterHp);
          if(monsterHp <= 0){
            s += 1;
            System.out.println("");
            System.out.println("");
            System.out.println("戦闘に勝利しました！");
            System.out.println("");
            System.out.println("");
            break;
          }
          default:
          System.out.println("");
          System.out.println("");
          System.out.println("半角数字の1を入力してください！");
          System.out.println("");
          System.out.println("");
            break;
        }
    }
    System.out.println("戦いに勝利できましたね！\nこれからたくさんの戦いがあると思いますが,頑張って魔王を倒してください！");

    // 始まりの村へ
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println("~~~始まりの村~~~");
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    Villagehead v = new Villagehead("村長");
    v.talk();
    int b = 0;
    while(b == 0){
      System.out.println("行動を選択してください！");
      System.out.println("１：村を出発する、２：ステータスを確認する、３：修行");
      int selected = new java.util.Scanner(System.in).nextInt();
      switch(selected){
        case 1:
          System.out.println("");
          System.out.println("");
          System.out.println("村を出発します");
          System.out.println("");
          System.out.println("");
          b += 1;
          break;
        case 2:
          System.out.println("");
          System.out.println("");
          System.out.println("名前：" + h.getNmae() + " HP：" + h.getHp() + " 現在のレベル： " + h.getLevel() + " 合計経験値 ： " + h.getExperiencepoint() + " レベルアップまで ： " + h.getLevelUpValue() + " 攻撃力 ： " + h.getOffensivepower());
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
          }else if(levelpoint == 2){
            System.out.println("");
            System.out.println("");
            System.out.println("修行大成功！");
            System.out.println("");
            System.out.println("");
            h.setExperiencepoint(160);
          }
          if(h.getExperiencepoint() > h.getLevelUpValue()){
            h.levelUp();
          }
          System.out.println("");
          System.out.println("");
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

    // 近衛隊との戦い
    System.out.println(h.name + "は魔王城を目指し冒険を始めた！");
    System.out.println("そこにはなぜか、魔王城にいる近衛隊がいた.....理由はわからないが魔王が近くにいるかもしれない。\n近衛隊を倒して魔王の情報を聞き出そう！");
    System.out.println("");
    System.out.println("");
    System.out.println("近衛隊との戦いが始まる!");
    System.out.println("");
    System.out.println("");
    int t = 0;
    Monster k = new Monster("近衛隊",300,50);
    int monsterKHp = k.getHp();
    int heroHp = h.getHp();
    while(t == 0){
      System.out.println("");
      System.out.println("");
      System.out.println("敵の名前 " + k.name + " : HP " + monsterKHp);
      System.out.println("アタックする場合は半角の数字の1を入力してください!");
      System.out.println("行動を選択してください!");
      System.out.println("");
      System.out.println("");
      int selected = new java.util.Scanner(System.in).nextInt();
      switch(selected){
        case 1:
        monsterKHp = h.attack(k,monsterKHp);
        heroHp = k.attack(h,heroHp);
        if(heroHp <= 0){
          System.out.println("HPは0になりました...");
          System.out.println("GAME OVER");
          break;
        }
        if(monsterKHp <= 0){
          t += 1;
          System.out.println("");
          System.out.println("");
          System.out.println("戦闘に勝利しました！");
          System.out.println("");
          System.out.println("");
          break;
        }
        default:
        System.out.println("");
        System.out.println("");
        System.out.println("半角数字の1を入力してください！");
        System.out.println("");
        System.out.println("");
          break;
      }
    }


  }
}
