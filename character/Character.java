package character;


public abstract class Character{
  // フィールド
  private String name;

  // メソッド

  // Set name
  public void setName(String name){
    if(name == null){
      throw new IllegalArgumentException("名前を入力してください！");
    }
    this.name = name;
  }

  // Get name
  public String getName(){
    return this.name;
  }
}
