package com.example.lewisjg.geoquiz;

/**
 * Created by lavelles on 1/20/2015.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }
}
