class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        for(int i = 1;i <= gain.length;i++){
            altitude[i] = gain[i - 1] + altitude[i - 1];
        }
        int max = altitude[0];
        for(int i = 1;i < altitude.length;i++){
            if(max < altitude[i])
                max = altitude[i];
        }
        return max;
    }
}