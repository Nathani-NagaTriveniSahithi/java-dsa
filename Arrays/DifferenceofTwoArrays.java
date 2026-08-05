class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0;i < 2;i++){
            answer.add(new ArrayList<>());
        }
        for(int  i = 0;i < nums1.length;i++){
            int found = 1;
            for(int j = 0;j < nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    found = 0 ;
                    break;
                }
            }
            if(!answer.get(0).contains(nums1[i]) && found == 1)
                answer.get(0).add(nums1[i]);
        }
        for(int i = 0;i < nums2.length;i++){
            int flag = 1;
            for(int j = 0;j < nums1.length;j++){
                if(nums2[i] == nums1[j]){
                    flag = 0;
                    break;
                }
            }
            if(!answer.get(1).contains(nums2[i]) && flag == 1)
                answer.get(1).add(nums2[i]);
        }
        return answer;
    }
}