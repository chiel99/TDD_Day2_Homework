package io.twincatstudio.tdd_daytwohomework;


class PotterShoppingCart {
    private int[] mBooks = new int[5];

    public void addBooks(int series, int number) {
        mBooks[series-1] += number;
    }

    public int getTotalPrice() {
        int price;
        double discount = 1.0;

        price = mBooks[0] * 100;
        for (int i = 1 ; i < mBooks.length ; i++) {
            price += mBooks[i] * 100;
            if (mBooks[i] > 0 && mBooks[i-1] > 0) {
                discount = 0.95;
            }
        }
        return (int)(price * discount);
    }
}
