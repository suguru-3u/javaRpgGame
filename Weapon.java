public class Weapon extends Item{
  // フィールド
  int offensiveValue;
  int defenseValue;

  // コンストラクト
  public Weapon(String name,int offensiveValue,int defenseValue){
    super.name = name;
    this.offensiveValue = offensiveValue;
    this.defenseValue = defenseValue;
  }
}
