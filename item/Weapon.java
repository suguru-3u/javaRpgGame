package item;

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

  // 名前ゲット
  public String getName(){
    return super.name;
  }

  // 攻撃力ゲット
  public int getOffensiveValue(){
    return this.offensiveValue;
  }
  // 防御力ゲット
  public int getDefenseValue(){
    return this.defenseValue;
  }
}
