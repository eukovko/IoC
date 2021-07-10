package com.kovko.cyclic;

public class AnotherService {

    private OneService oneService;

    public void setOneService(OneService oneService) {
        this.oneService = oneService;
    }

    @Override
    public String toString() {
        return "AnotherService{" +
                "oneService=" + oneService +
                '}';
    }
}
