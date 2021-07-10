package com.kovko.cyclic;

public class OneService {

    private YetAnotherService yetAnotherService;

    public void setYetAnotherService(YetAnotherService yetAnotherService) {
        this.yetAnotherService = yetAnotherService;
    }

    @Override
    public String toString() {
        return "OneService{" +
                "yetAnotherService=" + yetAnotherService +
                '}';
    }
}
