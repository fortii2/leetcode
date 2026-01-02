import java.util.ArrayList;

class RecentCounter {
    ArrayList<Integer> requestTime;

    public RecentCounter() {
        requestTime = new ArrayList<>();
    }

    public int ping(int t) {
        requestTime.add(t);
        int counter = 0;

        for (Integer time : requestTime) {
            if (time + 3000 >= t) {
                counter++;
            }
        }

        return counter;
    }
}
