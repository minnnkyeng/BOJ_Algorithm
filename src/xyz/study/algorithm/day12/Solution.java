package xyz.study.algorithm.day12;

public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0 ;i<a.length;i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        int answer = sol.solution(a, b);
        System.out.println(answer);
    }
}