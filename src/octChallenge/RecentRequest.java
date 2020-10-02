package octChallenge;

import java.util.ArrayList;

public class RecentRequest {
        ArrayList<Integer> recentRequest;
        int counter;

        public RecentRequest() {
            recentRequest = new ArrayList<>();
            counter = 0;
        }

        public int ping(int t) {
            counter = 0;
            recentRequest.add(t);
            //count the number of requests
            for (Integer rR : recentRequest) {
                if (rR >= (t - 3000) && rR <= t)
                    counter++;
            }
            return counter;
        }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
