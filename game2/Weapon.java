// package item;

public abstract class Weapon extends Item{
  // フィールド
  int offensivePower;
  int defensePower;

  // コンストラクト
  public Weapon(String name,int price){
    super.name = name;
    super.price = price;
  }

  // メソッド
  // 攻撃力ゲット
  public int getOffensivePower(){
    return this.offensivePower;
  }

  // 防御力ゲット
  public int getDefensePower(){
    return this.defensePower;
  }
}
