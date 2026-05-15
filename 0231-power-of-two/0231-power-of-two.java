class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
      for(long i=0;i*i<=n+1;i++){
            if(n==Math.pow(2,i))return true;
        }
        return false;
    }
}