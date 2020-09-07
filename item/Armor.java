package item;
import character.*;

public class Armor extends Weapon{
  // フィールド
   public int price;
   public int count;

  // コンストラクト
  public Sword(){
    super("皮の鎧",20,50);
    this.price = 50;
    this.count = 0;
  }

}
