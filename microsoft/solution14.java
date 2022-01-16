// https://practice.geeksforgeeks.org/problems/minimum-number-of-steps-to-reach-a-given-number5234/1/
class Solution{
    static int minSteps(int D){
        // code here
        int steps = 0;
        int sum = 0;
        int i = 1;
        while(sum < D|| (sum - D)%2 != 0){
            sum += i;
            steps++;
            i++;
        }
        return steps;
    }
}