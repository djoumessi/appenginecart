package com.appenginecart.controller;

import org.slim3.controller.Navigation;


public class SearchController extends AppController {

    @Override
    public Navigation run() throws Exception {
       
        
        return forward(themePage("search.jsp"));
    }
    
}
