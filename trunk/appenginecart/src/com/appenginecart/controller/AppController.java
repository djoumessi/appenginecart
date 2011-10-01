package com.appenginecart.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import com.appenginecart.system.AppConfig;

public class AppController extends Controller {
    
    private AppConfig appConfig = null;
    private String theme = "default";
    private String themePath = "";
    
    
    @Override
    protected Navigation setUp() {
        try {
            loadConfig();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public Navigation run() throws Exception {
        return null; 
    }
    
    protected void loadConfig() throws Exception{
        appConfig = new AppConfig("appenginecart.properties");
        setTheme(appConfig.getValue("appenginecart.config.theme"));
        setThemePath(String.format("theme/%s/pages/", getTheme()));
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getThemePath() {
        return themePath;
    }

    public void setThemePath(String themePath) {
        this.themePath = themePath;
    }

    public String themePage(String page) {
        return String.format("%s%s", getThemePath(), page);
    }
    
}
