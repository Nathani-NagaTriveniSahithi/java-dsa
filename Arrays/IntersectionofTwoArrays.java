class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer> answer = new ArrayList<>();
        for(int i = 0; i < nums1.length;i++){
            int flag = 1;
            for(int j = 0;j < nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    flag = 0;
                    break;
                }
            }
            int found = 1;
            int k;
            for(k = 0;k < answer.size();k++){
                if(answer.get(k) == nums1[i]){
                    found = 0;
                    break;
                }
            }
            if(found == 1 && flag == 0)
                answer.add(nums1[i]);
        }
        int[] arr = new int[answer.size()];
        for(int i = 0; i < answer.size();i++)
            arr[i] = answer.get(i);
        return arr;
    }
}