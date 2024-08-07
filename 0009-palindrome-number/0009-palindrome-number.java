class Solution {
    public boolean isPalindrome(int x) {
        int t=x,c=0,dig=0;
        while(x>0){
            dig=x%10;
            c=c*10+dig;
            x=x/10;
        }
        if (c==t)
        return true;
        else 
        return false;
    }
    }