import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }

        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        Solution217 solution217 = new Solution217();
        solution217.containsDuplicate(a);
    }
}
