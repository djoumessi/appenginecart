package com.appenginecart.controller.modules.shipping;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class WeightController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("weight.jsp");
    }
}
