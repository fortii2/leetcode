class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = numBottles;
        int empty = drinked;

        while (empty >= numExchange) {
            drinked += (int) (empty / numExchange);
            empty = (int) (empty / numExchange) + (empty % numExchange);
        }

        return drinked;
    }
}
