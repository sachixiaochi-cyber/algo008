import java.util.Scanner;

class algo008{
    public static void main(String[] args){

        //初期処理
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        //各選手のカードの配列を作成
        int[] penalty = new int[n + 1];

        //結果をためるバッファを作成
        StringBuilder exit = new StringBuilder();

        //q回ループして各イベントを受け取る
        for (int i = 0; i < q; i++){
            int event = sc.nextInt();
            int player = sc.nextInt();

            if (event == 1){
                penalty[player] += 1;
            }else if(event == 2){
                penalty[player] += 2;
            }else if(event == 3){
                if (penalty[player] >= 2){
                    exit.append("Yes\n");
                }else{
                    exit.append("No\n");
                }
            }
        }      

        //結果ためて出力
            System.out.println(exit);
        
    }
}