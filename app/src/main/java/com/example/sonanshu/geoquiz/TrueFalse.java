package com.example.sonanshu.geoquiz;

public class TrueFalse {

    //Adding Variables
    private int mQuestion;
    private boolean mTrueQuestion;

    //CONSTRUCTOR
    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    //Getters and Setters
    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    public int getQuestion() {

        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }
}
