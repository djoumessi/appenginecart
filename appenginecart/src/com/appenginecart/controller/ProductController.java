package com.appenginecart.controller;

import org.slim3.controller.Navigation;

public class ProductController extends AppController {

    @Override
    public Navigation run() throws Exception {
        return forward("product.jsp");
    }
}
