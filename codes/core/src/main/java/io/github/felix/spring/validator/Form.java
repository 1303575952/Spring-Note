package io.github.felix.spring.validator;

public class Form {
    @DateString
    private String current;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
}
