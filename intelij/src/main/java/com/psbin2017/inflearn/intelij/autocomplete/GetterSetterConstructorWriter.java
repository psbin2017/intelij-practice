package com.psbin2017.inflearn.intelij.autocomplete;

import java.util.List;
import java.util.Objects;

public class GetterSetterConstructorWriter {

    private String id;

    private int score;

    private List<String> emailAlias;

    // ALT + INSERT
    public GetterSetterConstructorWriter(int score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public List<String> getEmailAlias() {
        return emailAlias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetterSetterConstructorWriter that = (GetterSetterConstructorWriter) o;
        return score == that.score && Objects.equals(id, that.id) && Objects.equals(emailAlias, that.emailAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score, emailAlias);
    }

}
