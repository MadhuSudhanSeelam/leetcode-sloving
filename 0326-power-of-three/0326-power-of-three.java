class Solution {
    public boolean isPowerOfThree(int n) {
          if(n==1) return true;
      for(long i=1;i*i<=n+1;i++){
            if(n==Math.pow(3,i))return true;
        }
        return false;
    }
}