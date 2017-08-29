package io.twincatstudio.tdd_daytwohomework;

class PotterShoppingCart {
    private static final int MAX_SERIES = 5;
    private int[] mBooks = new int[MAX_SERIES];

    public void addBooks(int series, int number) {
        mBooks[series-1] += number;
    }

    public int getTotalPrice() {
        int price = 0;
        int[] books = new int[MAX_SERIES];
        System.arraycopy(mBooks, 0, books, 0, mBooks.length);

        int countOfSeries;
        do {
            countOfSeries = 0;
            for (int i = 0 ; i < books.length ; i++) {
                if (books[i] > 0) {
                    countOfSeries++;
                    books[i]--;
                }
            }

            double discount = getDiscount(countOfSeries);
            price += countOfSeries * 100 * discount;
        } while (countOfSeries > 0);

        return price;
    }

    private double getDiscount(int countOfSeries) {
        switch (countOfSeries) {
            case 2:
                return 0.95;
            case 3:
                return 0.9;
            default:
                return 1.0;
        }
    }
}
