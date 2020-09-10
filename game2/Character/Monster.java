package character;

public abstract class Monster extends Character{
  // フィールド
  int hp;
  int offensivePower;
  int defensePower;

  // コンストラクト
  public Monster(String name){
    super.name = name ;
  }

  // HPのセット
  public void setHP(int damegeHp){
    this.hp = damegeHp;
  }

  // HPの取得
  public int getHP(){
    return this.hp;
  }

  // 攻撃力の取得
  public int getOffensivePower(){
    return this.offensivePower;
  }

  // 防御力取得
  public int getDefensePower(){
    return this.defensePower;
  }

  // 攻撃
  public abstract void attack(Hero h);

  // 負ける
  public abstract void run();
}
