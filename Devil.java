public class Devil extends Monster{
  // フィールド
  private int magic;

  // コンストラクト
  public Devil(){
    super("魔王エリオン",5000,300);
    this.magic = 500;
  }

  // メゾット
  public int blackcasket(Hero h,int heroHp){
    System.out.println(this.name + "の波動の90、黒棺！");
    System.out.println(this.name + "は" + this.magic + "のダメージを与えた！");
    heroHp -= this.magic;
    System.out.println(h.name + "の残りのHPは" + heroHp + "です！");
    return heroHp;
  }

  public void talk(int tailk){
    switch(tailk){
      case 1:
        System.out.println("");
        System.out.println("");
        System.out.println("魔王「我に戦いを挑むとはいい度胸だな...チリにしてやる」");
        System.out.println("");
        System.out.println("");
        break;
      case 2:
        System.out.println("");
        System.out.println("");
        System.out.println("魔王「貴様と闘うのは飽きた...消えろ」");
        System.out.println("");
        System.out.println("");
        break;
      case 3:
        System.out.println("");
        System.out.println("");
        System.out.println("魔王「我を倒すとは....だが魔王はこの世界には後11人いる、貴様ごときでは全員の魔王を倒すことは不可能だ！」");
        System.out.println("");
        System.out.println("");
        break;
      default:
      System.out.println("");
      System.out.println("");
        break;
    }
  }
}
