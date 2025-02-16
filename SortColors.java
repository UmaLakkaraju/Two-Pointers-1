public class SortColors {
    public void sortColors(int[] nums) {
        int low =0;
        int mid =0;
        int high = nums.length-1;

        while (mid <= high) {
            if(nums[mid] == 1) {
                mid++;
            }
            else if(nums[mid] == 0) {
                swap(nums, low++, mid++);
            }
            else {
                swap(nums, mid,  high--);
            }
        }
    }

    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortColors sortColors=new SortColors();
        int[] nums=new int[]{2,0,2,1,1,0};
        sortColors.sortColors(nums);
        for(int i:nums)
        System.out.println(i);
    }
}
