package com.example.toolapp.BIZ;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.toolapp.Enmu.AccountType;
import com.google.gson.Gson;

public class LoginBiz {
    private String warehouseCode;
    private String businessModuleCode;
    private AccountType accountType;
    private String username;
    private String password;
    private String warehouseCategoryCode;

    public LoginBiz() {
    }

    public LoginBiz(String warehouseCode, String businessModuleCode, AccountType accountType, String username, String password, String warehouseCategoryCode) {
        this.warehouseCode = warehouseCode;
        this.businessModuleCode = businessModuleCode;
        this.accountType = accountType;
        this.username = username;
        this.password = password;
        this.warehouseCategoryCode = warehouseCategoryCode;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getBusinessModuleCode() {
        return businessModuleCode;
    }

    public void setBusinessModuleCode(String businessModuleCode) {
        this.businessModuleCode = businessModuleCode;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWarehouseCategoryCode() {
        return warehouseCategoryCode;
    }

    public void setWarehouseCategoryCode(String warehouseCategoryCode) {
        this.warehouseCategoryCode = warehouseCategoryCode;
    }


}
