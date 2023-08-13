package com.change.capture.cdc.data;


import javax.persistence.*;

@Table(name = "PROCESS_TABLE")
@Entity
public class ProcessTable {


    @Id
    @Column(name = "id")
    private int ID;

    @Column(name = "PROCESS_NAME")
    private String processName;

    @Column(name = "PROCESS_IP")
    private String processIP;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "MAC_ADDRESS")
    private String macAddress;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessIP() {
        return processIP;
    }

    public void setProcessIP(String processIP) {
        this.processIP = processIP;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }




}
