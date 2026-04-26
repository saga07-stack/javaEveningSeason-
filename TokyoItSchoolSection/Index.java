package TokyoItSchoolSection;
import java.io.*;
public class Index {
    public static void main (String [] args) throws IOException{
        BufferedReader src = new BufferedReader (new InputStreamReader(System.in));
        String [] info = {"知恵は","万代の","宝"};
        
        int num = src.read()-'0';
        for(int i=0; i< num; i++){
            System.out.println(info[i]);
        }
        System.out.println(info[0]+info[1]+info[2]);
    
    }
    
}
