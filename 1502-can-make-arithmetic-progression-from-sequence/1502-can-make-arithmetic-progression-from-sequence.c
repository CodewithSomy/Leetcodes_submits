int compare(const void* a, const void* b){
    return (*(int*)a - *(int*)b);
}
bool canMakeArithmeticProgression(int* arr, int arrSize) {
    qsort(arr,arrSize,sizeof(int),compare);
    int a=0,b=1,c=2;
    bool running=true;
    while(running){
        if (c>=arrSize)break;

        if (arr[b]-arr[a]==arr[c]-arr[b]) {
            a++;b++;c++;
            continue;
        }else running=false;
    }
    return running;
}
