package character;

public class Hero extends Character{
  // フィールド
  int hp;
  int offensivePower;
  int defensePower;
  int experiencePoint;
  int level;
  int levelUpValue;
  int money;

  // コンストラクト
  public Hero(){
    super.name = "佐藤";
    this.hp = 100;
    this.offensivePower = 20;
    this.defensePower = 10;
    this.experiencePoint = 0;
    this.level = 0;
    this.levelUpValue = 30;
    this.money = 100;
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

  // 攻撃
  public void attack(Monster m){
    if(m.getDefensePower() >= this.offensivePower){
      System.out.println("");
      System.out.println("");
      System.out.println("敵の防御力が勇者の攻撃力を上回っていた!!!!!");
      System.out.println("");
      System.out.println("敵が受けたダメージは0だ..勇者はショックを受けた..");
      System.out.println("");
      System.out.println("");
    }else{
      int damege = this.offensivePower - m.getDefensePower();
      System.out.println(damege);
      int damegeHp = (m.getHP() - damege);
      System.out.println(damegeHp);
      m.setHP(damegeHp);
      System.out.println("");
      System.out.println("");
      System.out.println(this.name + "は敵に攻撃した！！！");
      System.out.println("");
      System.out.println("敵に" + damegeHp + "のダメージを与えた!!!!");
      System.out.println("");
      System.out.println("");
    }
  }

  // レベルアップ
  public void levelup(){
    this.hp += 50;
    this.offensivePower += 20;
    this.defensePower += 10;
    this.level += 1;
    this.levelUpValue *= 1.5;
    System.out.println(super.name + "は" + this.level + "にレベルアップしました！");
  }

}
