public class perfectNumber{

    static class Solution {
        public boolean checkPerfectNumber(int num) {
            return num == 6 || num == 28 || num == 496
                || num == 8128 || num == 33550336;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int testNumber = 28; // change this value to test other numbers

        if (sol.checkPerfectNumber(testNumber)) {
            System.out.println(testNumber + " is a Perfect Number.");
        } else {
            System.out.println(testNumber + " is NOT a Perfect Number.");
        }
    }
}