class Solution {
    static int findPosition(int N , int M , int K) {
        // code here
        return (M + K -1 ) % N == 0? N:(M + K -1 ) % N;
    }
};
// https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1/