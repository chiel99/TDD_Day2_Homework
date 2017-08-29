package io.twincatstudio.tdd_daytwohomework;

class PotterShoppingCart {
    private int[] mBooks = new int[5];

    public void addBooks(int series, int number) {
        mBooks[series-1] += number;
    }

    public int getTotalPrice() {
        int price = 0;
        double discount = 1.0;

        int[] books = new int[5];
        System.arraycopy(mBooks, 0, books, 0, mBooks.length);

        while (true) {
            int countOfSeries = 0;
            for (int i = 0 ; i < books.length ; i++) {
                if (books[i] > 0) {
                    countOfSeries++;
                    books[i]--;
                }
            }
            if (countOfSeries == 0) {
                // no books
                break;
            } else if (countOfSeries == 1) {
                discount = 1.0;
            } else if (countOfSeries == 2) {
                discount = 0.95;
            } else if (countOfSeries == 3) {
                discount = 0.9;
            }
            price += countOfSeries * 100 * discount;
        }

        return price;
    }
}
