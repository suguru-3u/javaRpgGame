package character;

public class Goblin extends Monster{
  // コンストラクト
  public Goblin(){
    super("ゴブリン");
    super.hp = 10;
    super.offensivePower = 15;
    super.defensePower = 5;
  }

  // メソッド

  // 攻撃
  public void attack(Hero h){
    if(h.getDefensePower() >= super.offensivePower){
      System.out.println("");
      System.out.println("");
      System.out.println("勇者の防御力がゴブリンの攻撃力を上回っていた!!!!!");
      System.out.println("");
      System.out.println("勇者が受けたダメージは0だ..ゴブリンはショックを受けた..");
      System.out.println("");
      System.out.println("");
    }else{
      int damege = super.getOffensivePower() - h.getDefensePower();
      int damegeHp = (h.getHP() - damege);
      System.out.println(damegeHp);
      h.setHp(damegeHp);
      System.out.println("");
      System.out.println("");
      System.out.println(super.name + "は勇者に攻撃した！！！");
      System.out.println("");
      System.out.println("勇者に" + damege + "のダメージを受けた!!!!");
      System.out.println("");
      System.out.println("");
    }
  }

  // 負ける
  public void run(){
    System.out.println("");
    System.out.println("");
    System.out.println("勇者にやられました....");
    System.out.println("");
    System.out.println("");
  }
}
