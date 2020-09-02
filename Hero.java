public class Hero extends Character{

  // フィールド
  private int hp;
  private int maxhp;
  private int level;
  int offensivepower;
  int defensepower;
  private int experiencepoint;
  private int levelUpValue;
  String sword;
  int money;

  // コンストラクト
  public Hero(String name){
    this.name = name;
    this.hp = 100;
    this.maxhp = this.hp;
    this.level = 1;
    this.offensivepower = 20;
    this.defensepower = 10;
    this.experiencepoint = 0;
    this.levelUpValue = 50;
    this.money = 100;
  }

  // setメゾット
  // 経験値セット
  public void setExperiencepoint(int experiencepoint){
    this.experiencepoint += experiencepoint;
  }
  // 所持金セット
  public void setMoney(int money){
    this.money += money;
  }

  // getメゾット
  // 名前取得
  public String getNmae(){
    return this.name;
  }
  // HP取得
  public int getHp(){
    return this.hp;
  }
  // 最大HP取得
  public int getMaxhp(){
    return this.maxhp;
  }
  // レベル取得
  public int getLevel(){
    return this.level;
  }
  // 攻撃力取得
  public int getOffensivepower(){
    return this.offensivepower;
  }
  // 防御力取得
  public int getDefensepower(){
    return this.defensepower;
  }
  // 経験値取得
  public int getExperiencepoint(){
    return this.experiencepoint;
  }
  // レベルアップ値取得
  public int getLevelUpValue(){
    return this.levelUpValue;
  }
  // 装備取得
  public String getSword(){
    return this.sword;
  }
  // 所持金取得
  public int getMoney(){
    return this.money;
  }

  // 攻撃
  public int attack(Monster m,int monsterHp){
    System.out.println(this.name + "の攻撃！");
    System.out.println(m.name + "に" + this.offensivepower +"のダメージを与えた！");
    monsterHp -= this.offensivepower;
    System.out.println(m.name + "の残りのHPは" + monsterHp + "です！");
    return monsterHp;
  }

  // 回復
  public int recovery(int heroHp2){
    int recovery;
    int excessiveRecovery;
    recovery = heroHp2 / 4;
    heroHp2 += recovery;
    if(this.maxhp < heroHp2 ){
      heroHp2 = this.maxhp;
      System.out.println("");
      System.out.println("");
      System.out.println(this.name + "のHPは完全回復した！！");
      System.out.println("");
      System.out.println("");
    }else{
      System.out.println("");
      System.out.println("");
      System.out.println(this.name + "のHPは" + recovery + "回復した");
      System.out.println("");
      System.out.println("");
    }
    return heroHp2;
  }

  // 装備
  public void wear(Sword s){
    this.sword = s.name;
    System.out.println(this.name + "は" + s.name + "を入手した！");
    System.out.println("");
    System.out.println("");
  }

  // レベルアップ
  public void levelUp(){
      this.offensivepower += 20;
      this.level += 1;
      this.levelUpValue *= 1.5;
      this.hp += 50;
      this.maxhp += 50;
      this.defensepower += 10;
      System.out.println(this.name + "は" + this.level + "にレベルアップしました！");
  }


}
