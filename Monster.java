public class Monster extends Character{
  // フィールド
  int hp;
  int offensivepower;

  // コンストラクト
  public Monster(String name,int hp,int offensivepower){
    this.name = name;
    this.hp = hp;
    this.offensivepower = offensivepower;
  }

  // メゾット
  public int getHp(){
    return this.hp;
  }

  public int attack(Hero h,int heroHp){
    System.out.println(this.name + "の攻撃！");
    System.out.println(this.name + "は" + this.offensivepower + "のダメージを与えた！");
    heroHp -= this.offensivepower;
    System.out.println(h.name + "の残りのHPは" + heroHp + "です！");
    return heroHp;
  }
}
