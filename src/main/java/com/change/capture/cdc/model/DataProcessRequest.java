package com.change.capture.cdc.model;

public class DataProcessRequest {

    private String processName;

    private String processIp;


    private String user;

    private String macAddress;


    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessIp() {
        return processIp;
    }

    public void setProcessIp(String processIp) {
        this.processIp = processIp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

}
