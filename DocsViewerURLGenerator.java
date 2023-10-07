import java.util.Scanner;
import java.net.URLEncoder;
import java.io.IOException;

class DocsViewerURLGenerator {

    // �ϊ����邽�߂̏���
    static String exchange(String url) throws IOException {
        String change_url = URLEncoder.encode(url, "UTF-8");

        return "https://docs.google.com/viewer?url=" + change_url + "&embedded=true";
    }

    //�@���C�� main
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);
        
        // ����I��
        int select = 0;
        do{
            System.out.print("Language / ����i1.���{�� 2.English�j:");
            select = stdIn.nextInt();
            
            switch(select){
                case 1:
                    System.out.println("���{�ꂪ�I������܂����B");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Select English.");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Error:Typing num check. / �G���[�G���͂��ꂽ�����Ⴂ�܂��B");
                    System.out.println("");
                    break;
            }

        }while(select <= 0 || select > 2);

        // �ϊ�������URL�̓���
        String url = "";
        int jadge = 1;
        do{
            if(select == 1){
                System.out.print("Google Docs Viewer���g���ĕ\�������������̂�URL����͂��Ă��������F");
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
                    System.out.println("�G���[�F�����URL�ł͂���܂���I");
                    System.out.println("");
                }

                if(select == 2){
                    System.out.println("Error: No URL!");
                    System.out.println("");
                }

                jadge = 0;
            }
        
        }while(jadge == 0);

        // �ϊ�����URL��\��������
        if(select == 1){
            System.out.println("�o�͂��܂����I�����炪URL�ł��I");
            System.out.println(exchange(url));
        }
        
        if(select == 2){
            System.out.println("Output! Change URL!");
            System.out.println(exchange(url));
        }
    }
}