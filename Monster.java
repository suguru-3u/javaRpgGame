public class Monster extends Character{
  // フィールド
  int hp;
  int offensivepower;

  // コンストラクト
  public Monster(String name,int hp,int offensivepower){
    super.name = name;
    this.hp = hp;
    this.offensivepower = offensivepower;
  }

  // メゾット
  public int getHp(){
    return this.hp;
  }

  public int attack(Hero h,int heroHp){
    if(this.offensivepower < h.defensepower){
      System.out.println(h.name + "の防御力は" + this.name + "よりも高くダメージはなかった!");
    }else{
      int damege = this.offensivepower - h.defensepower;
      heroHp -= damege;
      System.out.println(this.name + "の攻撃！");
      System.out.println(this.name + "は" + damege + "のダメージを与えた！");
      System.out.println(h.name + "の残りのHPは" + heroHp + "です！");
    }
    return heroHp;
  }
}
