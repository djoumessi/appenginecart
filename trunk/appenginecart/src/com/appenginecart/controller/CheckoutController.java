package com.appenginecart.controller;

import org.slim3.controller.Navigation;

public class CheckoutController extends AppController {

    @Override
    public Navigation run() throws Exception {
        return forward("checkout.jsp");
    }
}
