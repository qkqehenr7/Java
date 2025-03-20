package com.grepp.oop.h_lambda.domain;

import com.grepp.oop.h_lambda.function.Predicate;

public class Exam {

    private String subject;
    private String name;
    private int score;

    public Exam(String subject, String name, int score) {
        this.subject = subject;
        this.name = name;
        this.score = score;
    }

    public boolean isPass(Predicate<Exam> p){
        return p.test(this); // 자기자신을 매개변수로 넣음(Exam Class)
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Exam{" +
            "subject='" + subject + '\'' +
            ", name='" + name + '\'' +
            ", score=" + score +
            '}';
    }
}
