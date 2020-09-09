package character;

public abstract class Monster extends Character{
  // フィールド
  int hp;
  int offensivePower;
  int defensePower;

  // コンストラクト
  public Hero(String name){
    super(name);
  }

  // 攻撃
  public abstract void attack(Hero h);

  // 負ける
  public abstract void run();
}
