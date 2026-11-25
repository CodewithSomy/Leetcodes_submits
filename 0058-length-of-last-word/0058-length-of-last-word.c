int lengthOfLastWord(char* s) {
    int i = 0, count = 0, b = 0;
    while(s[i]!='\0'){
        if(s[i]==' '){
            b=1;
        }else{
            if(b){
                b=0;
                count=0;
            }
            count++;
        }
        i++;
    }
    return count;
}
