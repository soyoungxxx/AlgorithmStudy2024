import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합_11720번 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split("");
        int result = 0;

        for(int i = 0 ; i < number; i++) {
            int temp = Integer.parseInt(inputs[i]);
            result += temp;
        }

        System.out.println(result);
    }
}
