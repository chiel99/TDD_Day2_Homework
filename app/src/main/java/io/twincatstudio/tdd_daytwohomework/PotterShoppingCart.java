package io.twincatstudio.tdd_daytwohomework;


class PotterShoppingCart {
    private int[] mBooks = new int[5];

    public void addBooks(int series, int number) {
        mBooks[series-1] += number;
    }

    public int getTotalPrice() {
        int price = 0;

        for (int i = 0 ; i < mBooks.length ; i++) {
            price += mBooks[i] * 100;
        }
        return price;
    }
}
