import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class q1_71456 {

    public int key = 0;
    static char ch;
    static String result = "";
    static int endKey;
    public static String message = "kyivv izexj wfi kyv vcmve-bzexj leuvi kyv jbp, jvmve wfi kyv unriwcfiuj ze kyvzi yrccj fw jkfev, ezev wfi dfikrc dve uffdvu kf uzv, fev wfi kyv urib cfiu fe yzj urib kyifev; ze kyv creu fw dfiufi nyviv kyv jyrufnj czv. fev izex kf ilcv kyvd rcc, fev izex kf wzeu kyvd, fev izex kf sizex kyvd rcc, reu ze kyv uribevjj szeu kyvd; ze kyv creu fw dfiufi nyviv kyv jyrufnj czv.";

    public static void main(String[] args) throws IOException {
        

        for (int k = 0 ; k < 26 ; k++) {
            String decrpytion = "";
            System.out.println(decrypt(message, k, decrpytion) + "\n");
            if (k == 17) {
                result = decrypt(message, k, decrpytion);
                endKey = k;
            }
        }

        FileWriter myWriter = new FileWriter("q1_71456.txt");
        myWriter.write(Integer.toString(endKey));
        myWriter.write("\n");;
        myWriter.write(result);
        myWriter.close();

        
    }

    public static String decrypt(String message, int key, String decryption) {
        for (int i = 0 ; i < message.length(); ++i) {
            ch = message.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch-key);

                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }
                decryption += ch;
            } else {
                decryption += ch;
            }
        }
        return decryption;

    }
    





}