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

        int maxCount = 0;
        for (int count : books) {
            maxCount = Math.max(maxCount, count);
        }
        if (maxCount == 0) {
            return 0;
        }

        int[] countOfSeries = new int[maxCount+1];
        int round = 0;

        do {
            for (int i = 0 ; i < books.length ; i++) {
                if (books[i] > 0) {
                    countOfSeries[round]++;
                    books[i]--;
                }
            }

            double discount = getDiscount(countOfSeries[round]);
            price += countOfSeries[round] * 100 * discount;
        } while (countOfSeries[round++] > 0);

        // Handle Special case: 4+4 = 640 < 5+3 = 645
        int countFive = 0;
        int countThree = 0;
        for (int count : countOfSeries) {
            if (count == 5) {
                countFive++;
            } else if (count == 3) {
                countThree++;
            }
        }
        int numSpecialCases = Math.min(countFive, countThree);
        price -= 5 * numSpecialCases;

        return price;
    }

    private double getDiscount(int countOfSeries) {
        switch (countOfSeries) {
            case 2:
                return 0.95;
            case 3:
                return 0.9;
            case 4:
                return 0.8;
            case 5:
                return 0.75;
            default:
                return 1.0;
        }
    }
}
