package character;
public class Villagehead extends Character{
  // コンストラクト
  public Villagehead(String name){
    this.name = name;
  }

  // メゾット
  public void talk(){
    System.out.println("村長「ようこそ始まりの村へ」");
    System.out.println("");
    System.out.println("村長「ワシはこの村の村長、この村の先は魔王が支配する地域じゃ、準備を終えてから村を出発していくのじゃぞ....」");
    System.out.println("");
  }
}
