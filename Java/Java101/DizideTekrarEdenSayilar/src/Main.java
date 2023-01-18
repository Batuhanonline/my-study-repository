import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 10, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int[] duplicateEven = new int[list.length];
        int index = 0, indexEven = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if (list[i] % 2 == 0){
                        duplicateEven[indexEven] = list[i];
                        indexEven++;
                    }
                    duplicate[index] = list[i];
                    index++;
                    break;
                }
            }
        }
        System.out.println("Duplicate list: " +Arrays.toString(duplicate));
        System.out.println("Even duplicate list: " +Arrays.toString(duplicateEven));
    }
}