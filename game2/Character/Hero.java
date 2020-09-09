package character;

public class Hero extends Character{
  // フィールド
  int hp;
  int offensivePower;
  int defensePower;

  // コンストラクト
  public Hero(String name){
    super(name);
    this.hp = 100;
    this.offensivePower = 20;
    this.defensePower = 10;
  }

  // オーバーロード
  public Hero(){
    super('ダミー',100);
  }

}
