package com.appenginecart.controller.modules.payment;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class PaymateController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("paymate.jsp");
    }
}
