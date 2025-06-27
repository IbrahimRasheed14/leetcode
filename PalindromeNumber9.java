class Solution{
public boolean isPalindrome(int x) {

        String strX = String.valueOf(x);
        int left = 0;
        int right = strX.length()-1;

        while (left < right){
            if (strX.charAt(left) != strX.charAt(right)) return false;
            left ++;
            right--;
        }
        return true;
}
}