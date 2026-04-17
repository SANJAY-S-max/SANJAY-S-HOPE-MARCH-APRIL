
import java.util.Scanner;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        int index = 0;
        for(int i : nums1) map[i]++;
        for(int i : nums2) {
            if(map[i]>0){
                nums1[index++] = i;
                map[i]--;
            }
        }
        int[] ans = new int[index];
        for(int i = 0 ; i < index ; i++){
            ans[i] = nums1[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for(int i = 0 ; i < n1 ; i++) nums1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for(int i = 0 ; i < n2 ; i++) nums2[i] = sc.nextInt();
        int[] ans = s.intersect(nums1, nums2);
        for(int i : ans) System.out.print(i + " ");
    }
}