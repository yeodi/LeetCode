public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0 ;
        int r = numbers.length - 1;
        while(l < r){
            int currentSum = numbers[l] + numbers[r];
            if(currentSum > target){
                r--;
            } else if(currentSum < target){
                l++;
            }else {
                return new int[]{l + 1,r + 1};
            }
        }
        return new int[]{};

    }
}
