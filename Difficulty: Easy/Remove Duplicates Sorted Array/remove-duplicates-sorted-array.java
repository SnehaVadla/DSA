class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!= arr[i-1]){
                arr[j++]=arr[i];
            }
        }
        for(int i=0;i<j;i++ ){
            ans.add(arr[i]);
        }
        return ans;
    }
}
