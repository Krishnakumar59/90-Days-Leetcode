import java.util.Arrays;

public class leetcode88_Merge_Sorted_Array {

    public static void main(String[] args) {
        System.out.println("Merged array");

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));


    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n;
        int j=0;
        for (int i = m; i <len ;j++, i++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);

    }
}

