package LeetCode;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] < target){
                start++;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,9};
        SearchInsertPosition solution = new SearchInsertPosition();
        System.out.println(solution.searchInsert(nums, 5));
    }
}
