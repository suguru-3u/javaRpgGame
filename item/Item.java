package item;

public abstract class Item{
  // フィールド
  String name;
  int price;

  // メソッド
  // 名前ゲット
  public String getName(){
    return this.name;
  }
  // 価格ゲット
  public int getPrice(){
    return this.price;
  }
}
