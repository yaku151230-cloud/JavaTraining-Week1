public class Janken {
    public static void main(String[] args) {
        System.out.println("じゃんけんをしましょう");
        System.out.println("0: グー, 1: チョキ, 2: パー");
        //playerの入力を受け取る
        int player = new java.util.Scanner(System.in).nextInt();
        //computerの手をランダムに決める
        int computer = new java.util.Random().nextInt(3);
        //0,1,2をそれぞれグー、チョキ、パーに変化
        String[] hands = {"グー", "チョキ", "パー"};
        System.out.println("あなた: " + hands[player] + "　コンピューター: " + hands[computer]);
        //勝利判定
        //あいこ
        if (player == computer) {
            System.out.println("あいこ！");
        //playerの勝ち
        } else if ((player == 0 && computer == 1) ||
                   (player == 1 && computer == 2) ||
                   (player == 2 && computer == 0)) {
            System.out.println("あなたの勝ち！");
        //computerの勝ち
        } else {
            System.out.println("コンピューターの勝ち！");
        }
    }
}

