class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] person: accounts){
            int bal = 0;
            for (int accBal: person){
                bal = bal + accBal;
            }
            if(max < bal)
                max = bal;
        }
        return max;
    }
}