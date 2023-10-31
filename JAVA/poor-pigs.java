// This is an outstanding question that can be solved using binary search, dynamic programmingm and combinatorics.

//QUESTION:-  https://leetcode.com/problems/poor-pigs/description/(copy this link in your browser;

//Solution: 


class Solution {
      public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        while (Math.pow(minutesToTest / minutesToDie + 1, pigs) < buckets) {
            pigs += 1;
        }
        return pigs;
    }
}

