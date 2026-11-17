bool isPalindrome(int x){
    if (x<0||(x%10==0&&x!=0))return false;
    
    int rHalf = 0;
    while (x>rHalf) {
        rHalf=rHalf*10+x%10;
        x/=10;
    }
    return x==rHalf||x==rHalf/10;
}
