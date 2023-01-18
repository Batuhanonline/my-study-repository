public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicateNums = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            int dup = 1;
            if (isThere(nums[i], duplicateNums)){
                duplicateNums[index] = nums[i];
                index++;
                for (int j = 0; j < nums.length; j++){
                    if ((i != j) && (nums[i] == nums[j])){
                        dup++;
                    }
                }
            }
            if (dup > 1){
                System.out.println(nums[i] + " sayısı " + dup + " kere tekrar etti.");
            }
        }
    }

    static boolean isThere(int isNum, int[] nums){
        for (int num: nums){
            if (isNum == num) return false;
        }
        return true;
    }
}