package com.kovko.cyclic;

public class YetAnotherService {

    private AnotherService anotherService;

    public void setAnotherService(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    @Override
    public String toString() {
        return "YetAnotherService{" +
                "anotherService=" + anotherService +
                '}';
    }
}
