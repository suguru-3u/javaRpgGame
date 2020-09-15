package character;

public class Goblin extends Monster{
  // フィールド
  private int identificationNumber;
  private boolean survival;

  // コンストラクト
  public Goblin(String name,int identificationNumber){
    super(name,10,15,5);
    this.identificationNumber = identificationNumber;
    this.survival = true;
  }

  // メソッド
  // 生存判定セット
  public void setSurvival(){
    this.survival = false;
  }

  // 識別番号ゲット
  public int getIdentificationNumber(){
    return this.identificationNumber;
  }
  // 生存判定ゲット
  public boolean getSurvival(){
    return this.survival;
  }


  // 攻撃
  public void attack(Hero h){
    if(h.getDefensePower() >= getOffensivePower()){
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
      System.out.println(getName() + "は勇者に攻撃した！！！");
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
