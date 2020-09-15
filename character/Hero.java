package character;

import item.*;

public class Hero extends Character{

  // フィールド
  private int hp;
  private int maxhp;
  private int offensivePower;
  private int defensePower;
  private int experiencePoint;
  private int level;
  private int levelUpValue;
  private int money;
  private Sword sword;
  private boolean wearsword;

  // コンストラクト
  public Hero(String name,Sword sword){
    setName(name);
    this.hp = 100;
    this.maxhp = 100;
    this.offensivePower = 20;
    this.defensePower = 10;
    this.experiencePoint = 0;
    this.level = 0;
    this.levelUpValue = 30;
    this.money = 100;
    this.wearsword = false;
    this.sword = sword;
  }

  // メソッド
  // HPセット
  public void setHp(int damegeHp){
    this.hp = damegeHp;
  }

  // 経験値セット
  public void setExperiencePoint(int experiencePoint){
    this.experiencePoint += experiencePoint;
  }

  // お金セット
  public void setMoney(int setmoney){
    this.money += setmoney;
  }

  // レベルゲット
  public int getLevel(){
    return this.level;
  }

  // HPゲット
  public int getHP(){
    return this.hp;
  }

  // 最大HPゲット
  public int getMaxHP(){
    return this.maxhp;
  }

  // 攻撃力ゲット
  public int getOffensivePower(){
    return this.offensivePower;
  }

  // 防御力ゲット
  public int getDefensePower(){
    return this.defensePower;
  }

  // 経験値ゲット
  public int getExperiencePoint(){
    return this.experiencePoint;
  }

  // レベルアップ値ゲット
  public int getLevelUpValue(){
    return this.levelUpValue;
  }

  // お金ゲット
  public int getMoney(){
    return this.money;
  }

  // 武器ゲット
  public Sword getSword(){
      return this.sword;
  }

  // ステータス表示
  public void status(){
    System.out.println("");
    System.out.println("================================================================================================================================================");
    System.out.println("レベル： " + getLevel() + "  現在のHP： " + getHP() + "  最大HP： " + getMaxHP()
    + "  攻撃力： " + getOffensivePower() + "  防御力： " + getDefensePower() + "  現在の経験値： " + getExperiencePoint()
    + "  レベルアップ経験値： " + getLevelUpValue() + "  所持金： " + getMoney() + "  装備武器： "
    + (getSword()).getName());
    System.out.println("================================================================================================================================================");
    System.out.println("");
  }

  // 攻撃
  public void attack(Monster m){
    if(m.getDefensePower() >= this.offensivePower){
      System.out.println("");
      System.out.println("敵の防御力が勇者の攻撃力を上回っていた!!!!!");
      System.out.println("");
      System.out.println("敵が受けたダメージは0だ..勇者はショックを受けた..");
      System.out.println("");
    }else{
      int random = new java.util.Random().nextInt(5);
      int damege;
      int damegeHp;
      if(random == 3){
        damege = (this.offensivePower * 3) - m.getDefensePower();
        System.out.println("");
        System.out.println(getName() + "は敵に会心の一撃を与えた！！！");
        System.out.println("");
      }else{
        damege = this.offensivePower - m.getDefensePower();
        System.out.println("");
        System.out.println(getName() + "は敵に攻撃した！！！");
        System.out.println("");
      }
      System.out.println(damege);
      damegeHp = (m.getHP() - damege);
      System.out.println(damegeHp);
      m.setHP(damegeHp);
      System.out.println("敵に" + damegeHp + "のダメージを与えた!!!!");
      System.out.println("");
    }
  }

  // レベルアップ
  public void levelup(){
    this.hp += 50;
    this.maxhp += 50;
    this.offensivePower += 20;
    this.defensePower += 10;
    this.level += 1;
    this.levelUpValue *= 1.5;
    System.out.println(getName() + "は" + this.level + "にレベルアップしました！");
  }


  // 剣を身に着ける
  public void swordwear(Sword w){
    if(this.wearsword){
      System.out.println("");
      System.out.println("既に" + this.sword.getName() + "を装備しています。");
      System.out.println("");
      System.out.println("武器を変更する場合は、１を入力してください。装備しない場合は１意外を入力してください。");
      System.out.println("");
      int select = new java.util.Scanner(System.in).nextInt();
      if(select == 1){
        this.offensivePower -= this.sword.getOffensivePower();
        this.defensePower -= this.sword.getDefensePower();
        this.sword = w;
        System.out.println("");
        System.out.println(w.getName() + "を新たに装備します。");
        System.out.println("");
        this.money -= w.getPrice();
        this.offensivePower += w.getOffensivePower();
        this.defensePower += w.getDefensePower();
        System.out.println(getName() + "の攻撃力は" + this.offensivePower
         + " 防御力は" + this.defensePower + "に変化した！");
        System.out.println("");
      }
    }else{
      this.sword = w;
      this.wearsword = true;
      System.out.println("");
      System.out.println(w.getName() + "を装備しました!!!");
      System.out.println("");
      this.money -= w.getPrice();
      this.offensivePower += w.getOffensivePower();
      this.defensePower += w.getDefensePower();
      System.out.println(getName() + "の攻撃力は" + this.offensivePower
       + " 防御力は" + this.defensePower + "に変化した！");
      System.out.println("");
    }
  }

  // HP回復
  public void hpMoneyRecovery(int h){
    this.hp += h;
    if(this.maxhp < this.hp){
      this.hp = this.maxhp;
      System.out.println("HPは完全回復しました！");
      System.out.println("");
    }else{
      System.out.println("HPは回復しました！");
      System.out.println("");
    }
  }

}
