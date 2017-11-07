package com.pack.base;

public class Application {

    public String browserType;
    private String appURL;
    private String username;
    private String password;

    public Application(){
    }

    //*****getter and setter for browserType*****
    public String getBrowserType() {
        return browserType;
    }
    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }
    //*****getter and setter for appURL*****
    public String getAppURL() {
        return appURL;
    }
    public void setAppURL(String appURL) {
        this.appURL = appURL;
    }
    //*****getter and setter for username*****
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    //*****getter and setter for password*****
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
