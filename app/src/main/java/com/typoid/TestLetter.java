package com.typoid;

public class TestLetter {
    private char mLetter;
    private Long mMeasure1;

    public TestLetter(char mLetter, Long mMeasure1) {
        this.mLetter = mLetter;
        this.mMeasure1 = mMeasure1;
    }

    public char getmLetter() {
        return mLetter;
    }

    public void setmLetter(char mLetter) {
        this.mLetter = mLetter;
    }

    public Long getmMeasure1() {
        return mMeasure1;
    }

    public void setmMeasure1(Long mMeasure1) {
        this.mMeasure1 = mMeasure1;
    }
}
