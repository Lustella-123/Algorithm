class Solution {
    public long solution(int price, int money, int count) {
        long usedMoney = 0;
        for (int i = 1; i <= count; i++) {
            usedMoney += (long)price * i;
        }
        return money >= usedMoney ? 0 : usedMoney - money;
    }
}