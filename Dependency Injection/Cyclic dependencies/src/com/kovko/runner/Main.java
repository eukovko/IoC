package com.kovko.runner;

import com.kovko.cyclic.AnotherService;
import com.kovko.cyclic.OneService;
import com.kovko.cyclic.YetAnotherService;

public class Main {
   public static void main(String[] args) {
      OneService oneService = new OneService();
      AnotherService anotherService = new AnotherService();
      YetAnotherService yetAnotherService = new YetAnotherService();

      anotherService.setOneService(oneService);
      yetAnotherService.setAnotherService(anotherService);
      oneService.setYetAnotherService(yetAnotherService);

      System.out.println(oneService);
   }
}