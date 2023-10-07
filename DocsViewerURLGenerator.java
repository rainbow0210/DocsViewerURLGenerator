import java.util.Scanner;
import java.net.URLEncoder;
import java.io.IOException;

class DocsViewerURLGenerator {

    // 変換するための処理
    static String exchange(String url) throws IOException {
        String change_url = URLEncoder.encode(url, "UTF-8");

        return "https://docs.google.com/viewer?url=" + change_url + "&embedded=true";
    }

    //　メイン main
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);
        
        // 言語選択
        int select = 0;
        do{
            System.out.print("Language / 言語（1.日本語 2.English）:");
            select = stdIn.nextInt();
            
            switch(select){
                case 1:
                    System.out.println("日本語が選択されました。");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Select English.");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Error:Typing num check. / エラー；入力された数が違います。");
                    System.out.println("");
                    break;
            }

        }while(select <= 0 || select > 2);

        // 変換したいURLの入力
        String url = "";
        int jadge = 1;
        do{
            if(select == 1){
                System.out.print("Google Docs Viewerを使って表示させたいもののURLを入力してください：");
            }

            if(select == 2){
                System.out.print("Typing URL. Display Google Docs Viewer:");
            }

            url = stdIn.next();

            if(url.startsWith("https://") || url.startsWith("http://")){
                System.out.println();

                jadge = 1;
            }
            else{
                if(select == 1){
                    System.out.println("エラー：これはURLではありません！");
                    System.out.println("");
                }

                if(select == 2){
                    System.out.println("Error: No URL!");
                    System.out.println("");
                }

                jadge = 0;
            }
        
        }while(jadge == 0);

        // 変換したURLを表示させる
        if(select == 1){
            System.out.println("出力しました！こちらがURLです！");
            System.out.println(exchange(url));
        }
        
        if(select == 2){
            System.out.println("Output! Change URL!");
            System.out.println(exchange(url));
        }
    }
}