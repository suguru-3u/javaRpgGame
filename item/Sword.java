package item;
import character.*;

public class Sword extends Weapon{
  // フィールド
   public int price;
   public int count;

  // コンストラクト
  public Sword(){
    super("皮の剣",50,20);
    this.price = 50;
    this.count = 0;
  }

}