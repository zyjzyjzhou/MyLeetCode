//11. 盛最多水的容器 2022年1月18日15:42:15

public class Solution11 {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                maxarea = Math.max(maxarea, Math.min(height[i], height[j] * (j - i)));
            }
        }
        return maxarea;
    }

    public int maxArea2(int[] height) {
        int maxarea = 0;
        int i = 0, j = height.length - 1;
        while (i <j) {
           maxarea=Math.max(maxarea,Math.min(height[i],height[j])*(j-i));
           if (height[i]<height[j]){
               i++;
           }else {
               j--;
           }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1};
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
