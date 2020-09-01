public class Hero extends Character{
  // フィールド
  private int hp;
  private int level;
  private int offensivepower;
  private int experiencepoint;
  private int levelUpValue;

  // コンストラクト
  public Hero(String name){
    this.name = name;
    this.hp = 1000;
    this.level = 1;
    this.offensivepower = 10000;
    this.experiencepoint = 0;
    this.levelUpValue = 50;
  }

  // setメゾット
  // 経験値セット
  public void setExperiencepoint(int experiencepoint){
    this.experiencepoint += experiencepoint;
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
  // レベル取得
  public int getLevel(){
    return this.level;
  }
  // 攻撃力取得
  public int getOffensivepower(){
    return this.offensivepower;
  }
  // 経験値取得
  public int getExperiencepoint(){
    return this.experiencepoint;
  }
  // レベルアップ値取得
  public int getLevelUpValue(){
    return this.levelUpValue;
  }

  // 攻撃
  public int attack(Monster m,int monsterHp){
    System.out.println(this.name + "の攻撃！");
    System.out.println(m.name + "に" + this.offensivepower +"のダメージを与えた！");
    monsterHp -= this.offensivepower;
    System.out.println(m.name + "の残りのHPは" + monsterHp + "です！");
    return monsterHp;
  }

  // レベルアップ
  public void levelUp(){
      this.offensivepower += 10;
      this.level += 1;
      this.levelUpValue *= 1.5;
      this.hp += 50;
      System.out.println(this.name + "は" + this.level + "にレベルアップしました！");
  }

}
