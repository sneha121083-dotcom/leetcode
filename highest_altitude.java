class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0; // Starts at 0 because the journey begins at altitude 0
        
        for (int altitudeGain : gain) {
            // Calculate the altitude of the next point
            currentAltitude += altitudeGain;
            
            // Keep track of the highest peak reached so far
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        
        return maxAltitude;
    }
}
