
import java.util.*;

public class CloudJumping {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int inputNumber = scanner.nextInt();
        if (inputNumber < 2 || inputNumber > 100) return;
        
        int numberArray[] = new int[inputNumber];
        for(int i=0; i < inputNumber; i++){
            numberArray[i] = scanner.nextInt();
            if (numberArray[0] != 0 || numberArray[inputNumber-1] != 0) return;
            if (numberArray[i] < 0 || numberArray[i] > 1) return;
        }
        
        int x = 0, jump = 0;
        while (x != inputNumber-1) {
            if (numberArray[x] == 0) {
                if (numberArray[x+1] == 0) {
                    if (x < inputNumber - 2 && numberArray[x+2] == 0) {
                        x += 2;
                    } else {
                        x += 1;
                    }
                } else {
                    x += 2;
                }
            } else {
                x += 1;
            }
            jump++;
        }
        
        System.out.println(jump);
        scanner.close();
    }

}
