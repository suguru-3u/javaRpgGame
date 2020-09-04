// ゲームの説明
// 勇者の名前の入力
// 戦いのチュートリアル
// 村にいく
// 魔王城を目指す
// 敵と遭遇
// 魔王
// エンドロール
import character.*;
import item.*;

public class Main{
  public static void main(String[] args){

    // インスタンス作成
    Battle battle = new Battle();
    character.Monster m = new character.Monster("ガイコツ",20,10);
    character.Monster k = new character.Monster("近衛隊",300,50);
    character.Devil d = new character.Devil();
    character.Villagehead v = new character.Villagehead("村長");
    item.Sword sword = new item.Sword();

    // 物語
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println("                                                                                    ようこそ魔王フルボッコダンジョンへ！！！");
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println("このゲームは魔王に侵略されている世界を救う物語です！\nさあ、魔王をボコボコにして世界を救いましょう！");
    System.out.println("");
    System.out.println("あなたの名前を教えていただけませんか?");
    System.out.println("");
    String heroname = new java.util.Scanner(System.in).nextLine();
    character.Hero h = new character.Hero(heroname);
    System.out.println(h.name + "さん、こんにちわ！\nこの世界は魔王に侵略されています。魔王を倒し世界に平和を取り戻しましょう！");
    System.out.println("");
    System.out.println("");
    System.out.println("チュートリアルをやりますか？");
    System.out.println("");
    System.out.println("");
    System.out.println("行う場合は、１を入力し,行場合は1意外を入力してください");
    int l = new java.util.Scanner(System.in).nextInt();

    // チュートリアル
    if(l == 1){
      battle.tutorial(h,m);
    }

    // 始まりの村へ
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println("                                                                                                 ~~~始まりの村~~~");
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    Field land = new Field();
    land.villageOfBeginning(v,h,sword);

    // 近衛隊との戦い
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println("                                                                                             ~~~魔王城への道~~~");
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println(h.name + "は魔王城を目指し冒険を始めた！");
    System.out.println("そこにはなぜか、魔王城にいる近衛隊がいた.....理由はわからないが魔王が近くにいるかもしれない。\n近衛隊を倒して魔王の情報を聞き出そう！");
    System.out.println("");
    System.out.println("");
    System.out.println("近衛隊との戦いが始まる!");
    System.out.println("");
    System.out.println("");
    battle.guardbattle(h,k);
    System.out.println("近衛隊からなんと近くに魔王がいることが判明した！\nさあ、魔王を倒していこう！");

    // 魔王戦
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    System.out.println("                                                                                                 ~~魔王戦~~");
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    System.out.println("");
    System.out.println("");
    battle.devilbattle(h,d);

    // エンドロール
    d.talk(3);
    System.out.println("勇者の冒険は続く");
    System.out.println("");
    System.out.println("");
    System.out.println("作成者：GOD、一緒に勉強した人：KAME,SUKE,感想：オブジェクト思考楽しい");
    System.out.println("");
    System.out.println("");
  }
}
