package io.twincatstudio.tdd_daytwohomework;

class PotterShoppingCart {
    private static final int MAX_SERIES = 5;
    private int[] mBooks = new int[MAX_SERIES];

    private PriceCalculator mCalculator;

    public PotterShoppingCart() {
        mCalculator = new PriceCalculator();
    }

    public PotterShoppingCart(PriceCalculator calculator) {
        mCalculator = calculator;
    }

    public void addBooks(int series, int number) {
        mBooks[series-1] += number;
    }

    public int getTotalPrice() {
        int[] books = new int[MAX_SERIES];
        System.arraycopy(mBooks, 0, books, 0, mBooks.length);

        return mCalculator.calculatePrice(books);
    }

}
