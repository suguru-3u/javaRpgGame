package character;

public class Hero extends Character{
  // フィールド
  int hp;
  int offensivePower;
  int defensePower;

  // コンストラクト
  public Hero(){
    super.name = "佐藤";
    this.hp = 100;
    this.offensivePower = 20;
    this.defensePower = 10;
  }

  // メソッド
  // HPセット
  public void setHp(int damegeHp){
    this.hp = damegeHp;
  }
  // HPゲット
  public int getHP(){
    return this.hp;
  }
  // 防御力ゲット
  public int getDefensePower(){
    return this.defensePower;
  }

  // 攻撃
  public void attack(Monster m){
    if(m.getDefensePower() >= this.offensivePower){
      System.out.println("");
      System.out.println("");
      System.out.println("敵の防御力が勇者の攻撃力を上回っていた!!!!!");
      System.out.println("");
      System.out.println("敵が受けたダメージは0だ..勇者はショックを受けた..");
      System.out.println("");
      System.out.println("");
    }else{
      int damege = this.offensivePower - m.getDefensePower();
      System.out.println(damege);
      int damegeHp = (m.getHP() - damege);
      System.out.println(damegeHp);
      m.setHP(damegeHp);
      System.out.println("");
      System.out.println("");
      System.out.println(this.name + "は敵に攻撃した！！！");
      System.out.println("");
      System.out.println("敵に" + damegeHp + "のダメージを与えた!!!!");
      System.out.println("");
      System.out.println("");
    }
  }

}
