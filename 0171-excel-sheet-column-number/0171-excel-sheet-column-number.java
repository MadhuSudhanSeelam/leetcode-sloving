class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        int power = 1;

        for(int i = s.length() - 1; i >= 0; i--) {
            int value = s.charAt(i) - 'A' + 1;
            result += value * power;
            power *= 26;
        }

        return result;
    }
}