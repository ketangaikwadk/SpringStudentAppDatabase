package org.example.model;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address1")
@Scope("prototype")
public class Address {

    private String pinCode;
    private String city;

    public Address(String pinCode, String city) {
        this.pinCode = pinCode;
        this.city = city;
    }

    public Address() {
    }
    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
