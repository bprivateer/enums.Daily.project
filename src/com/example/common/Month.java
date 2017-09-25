package com.example.common;

public enum Month {
    JANURARY("Jan", 1),
    FEBURARY("feb", 2),
    MARCH("march", 3),
    APRIL("april", 4),
    MAY("may", 5),
    JUNE("june",6),
    JULY("July",7),
    AUGUST("Aug",8),
    SEPTEMBER("Sep",9),
    OCTOBER("Oct",10),
    NOVEMBER("Nov", 11),
    DECEMBER("December", 12),;

    private String englishName;
    private int numMonth;

    Month(String englishName, int numMonth) {
        this.numMonth = numMonth;
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }
}
