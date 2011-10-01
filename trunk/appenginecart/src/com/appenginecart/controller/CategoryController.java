package com.appenginecart.controller;

import org.slim3.controller.Navigation;

public class CategoryController extends AppController {

  

    @Override
    public Navigation run() throws Exception {
        return forward("category.jsp");
    }
}
