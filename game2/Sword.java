// package item;

public class Sword extends Weapon{
  // コンストラクト
  public Sword(String name,int price,int offensivePower,int defensePower){
    super(name,price);
    super.offensivePower = offensivePower;
    super.defensePower = defensePower;
  }
}
