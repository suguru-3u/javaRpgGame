public class RequestForm{

  public void requestForm(){
    int count = 0 ;
    System.out.println("");
    System.out.println("");
    System.out.println("ようこそ,集会所へ");
    System.out.println("");
    System.out.println("");
    while(count == 0){
      System.out.println("現在ご紹介できるクエストはこちらです。");
      System.out.println("");
      System.out.println("No1:ゴブリン討伐");
      System.out.println("");
      System.out.println("No10:村に戻る");
      System.out.println("");
      System.out.println("");
      System.out.println("受けたいクエストがある場合はクエスト番号を入力してください！");
      int select = new java.util.Scanner(System.in).nextInt();
      switch(select){
        case 1:
        System.out.println("");
        System.out.println("");
        System.out.println("こちらのクエストはゴブリン一体の討伐クエストでございます。");
        System.out.println("No1:ゴブリン討伐のクエストでよろしいでしょうか？");
        System.out.println("よろしければ1を入力してください！");
        int number = new java.util.Scanner(System.in).nextInt();
        if(number == 1){
          System.out.println("クエストを始めます！");
          try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
          }
          GoblinBattle g = new GoblinBattle();
          g.monsterBattle();
        }else{
          System.out.println("集会所に戻ります");
        }
        break;
        case 10:
          System.out.println("");
          System.out.println("");
          System.out.println("村に戻ります！");
          System.out.println("");
          System.out.println("");
          count += 1;
        break;
      }
    }
  }
}
