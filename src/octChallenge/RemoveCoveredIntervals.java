//https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3483/

package octChallenge;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals {
        public int removeCoveredIntervals(int[][] intervals) {
            Arrays.sort(intervals, new Comparator<int[]>() {

                public int compare(final int first[], final int second[]) {
                    if(first[0] == second[0]){
                        if(first[1] < second[1])
                            return 1;
                        else return -1;
                    }
                    if(first[0] > second[0])
                        return 1;
                    else
                        return -1;
                }
            });

            int maxEnd = 0;
            int leftIntervals = intervals.length;
            for(int i=0; i<intervals.length; i++) {
                int curEnd = intervals[i][1];
                if(curEnd <= maxEnd) {
                    leftIntervals--;
                }
                maxEnd = Math.max(curEnd, maxEnd);
            }
            return leftIntervals;
        }
}
