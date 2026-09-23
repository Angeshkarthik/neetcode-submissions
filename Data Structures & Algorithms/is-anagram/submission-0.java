class Solution {
    public static void mergesort(char arr[]){
        int n = arr.length;
        if(n<2){
            return;
        }
        int mid = n/2;
        char left[] = new char[mid];
        char right[] = new char[n-mid];
        for(int i=0;i<mid;i++){
            left[i] = arr[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid] = arr[i];
        }
        mergesort(left);
        mergesort(right);
        merge(arr,left,right);
    }
    public static void merge(char arr[],char left[],char right[]){
        int l = left.length;
        int r = right.length;
        int i=0,j=0,k=0;
        while(i<l && j<r){
            if(left[i]<right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<l){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<r){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public boolean isAnagram(String s, String t) {
        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();
        mergesort(str1);
        mergesort(str2);
        String ans1 = new String(str1);
        String ans2 = new String(str2);
        if(ans1.equals(ans2)){
            return true;
        }
        else{
            return false;
        }
    }
}
