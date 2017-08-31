package io.twincatstudio.tdd_daytwohomework;


class PriceCalculator {

    public int calculatePrice(int[] books) {
        int price = 0;

        int maxCount = getBooksMaxCount(books);
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
        int numSpecialCases = getNumSpecialCases(countOfSeries);
        price -= 5 * numSpecialCases;

        return price;
    }

    private int getNumSpecialCases(int[] countOfSeries) {
        int countFive = 0;
        int countThree = 0;
        for (int count : countOfSeries) {
            if (count == 5) {
                countFive++;
            } else if (count == 3) {
                countThree++;
            }
        }
        return Math.min(countFive, countThree);
    }

    private int getBooksMaxCount(int[] books) {
        int maxCount = 0;
        for (int count : books) {
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
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
