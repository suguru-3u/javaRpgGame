import character.*;

public class Battle{

  // チュートリアル
    public void tutorial(character.Hero h,character.Monster m){
      System.out.println("");
      System.out.println("いきなり魔王軍の部下のガイコツが襲ってきた!!!!!!!");
      System.out.println("");
      System.out.println("いきなり、敵がきましたね,早速ですが戦い方を教えます!");
      System.out.println("");
      // チュートリアルの戦闘
      int t = 0;
      int monsterHp = m.getHp();
      while(t == 0){
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
            t += 1;
            h.victory();
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
    }

  // モンスターとの戦い
  public void guardbattle(character.Hero h,character.Monster k){
    int heroHp = h.getHp();
    int monsterHp = k.getHp();
    int t = 0;
    while(t == 0){
      System.out.println("");
      System.out.println("");
      System.out.println("名前 " + h.name + " : HP " + heroHp);
      System.out.println("");
      System.out.println("");
      System.out.println("敵の名前 " + k.name + " : HP " + monsterHp);
      System.out.println("");
      System.out.println("");
      System.out.println("アタックする場合は半角の数字の1,HPを回復する場合は2を入力してください!");
      System.out.println("行動を選択してください!");
      System.out.println("");
      System.out.println("");
      int selected = new java.util.Scanner(System.in).nextInt();
      switch(selected){
        case 1:
        monsterHp = h.attack(k,monsterHp);
        System.out.println("");
        System.out.println("");
        heroHp = k.attack(h,heroHp);
        h.run(heroHp);
        if(monsterHp <= 0){
          t += 1;
          h.victory();
          break;
        }
        case 2:
          heroHp = h.recovery(heroHp);
          heroHp = k.attack(h,heroHp);
          h.run(heroHp);
          break;
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

  // 魔王との戦闘
  public void devilbattle(character.Hero h,character.Devil d){
    System.out.println("");
    System.out.println("");
    System.out.println("魔王を偶然、見つけた勇者はついに戦いを挑んだ！果たして勇者は魔王を倒せるのか？");
    System.out.println("");
    System.out.println("");
    int t = 0;
    int p = 0;
    int heroHp = h.getHp();
    int devilHp = d.getHp();
    d.talk(1);
    while(t == 0){
      System.out.println("");
      System.out.println("");
      System.out.println("名前 " + h.name + " : HP " + heroHp);
      System.out.println("");
      System.out.println("");
      System.out.println("敵の名前 " + d.name + " : HP " + devilHp);
      System.out.println("");
      System.out.println("");
      System.out.println("アタックする場合は半角の数字の1,HPを回復する場合は2を入力してください!");
      System.out.println("行動を選択してください!");
      System.out.println("");
      System.out.println("");
      int selected = new java.util.Scanner(System.in).nextInt();
      switch(selected){
        case 1:
          devilHp = h.attack(d,devilHp);
          System.out.println("");
          System.out.println("");
          heroHp = d.attack(h,heroHp);
          p +=1;
          if(heroHp < 0){
            h.run(heroHp);
          }
          if(devilHp < 0){
            t += 1;
            h.victory();
          }
          break;
        case 2:
          p +=1;
          heroHp = h.recovery(heroHp);
          System.out.println("");
          System.out.println("");
          heroHp = d.attack(h,heroHp);
          h.run(heroHp);
          break;
        default:
          p +=1;
          System.out.println("");
          System.out.println("");
          System.out.println("半角数字の1を入力してください！");
          System.out.println("");
          System.out.println("");
          break;
      }
      if(p % 3 == 0){
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        d.talk(2);
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        heroHp = d.blackcasket(h,heroHp);
        h.run(heroHp);
      }
    }
  }

}
