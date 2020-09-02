public class Sword extends Weapon{
  // フィールド
   int price;

  // コンストラクト
  public Sword(){
    super("普通の剣",50,20);
    this.price = 50;
  }

  public void wear(Hero h){
    h.offensivepower += super.offensiveValue;
    h.defensepower += super.defenseValue;
    System.out.println(h.name + "の攻撃力は" + h.offensivepower + "  ： " + "防御力は" + h.defensepower + "になりました！");
    System.out.println("");
    System.out.println("");
  }

  public void takeOff(Hero h){
    h.offensivepower -= super.offensiveValue;
    h.defensepower -= super.defenseValue;
  }
}
