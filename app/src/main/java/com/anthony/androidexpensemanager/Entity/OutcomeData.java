package com.anthony.androidexpensemanager.Entity;

/**
 * Created by Anthony (1572010) on 3/15/2018.
 */

public class OutcomeData {
    private int status;
    private String message;
    private Outcome outcome;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }
}
