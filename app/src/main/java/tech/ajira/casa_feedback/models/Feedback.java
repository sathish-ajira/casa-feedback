package tech.ajira.casa_feedback.models;

public class Feedback {

    public String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Feedback(String question) {
        this.question = question;
    }
}