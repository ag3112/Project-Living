package com.dietnn.service.beans;

import org.hibernate.validator.constraints.Email;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * User bean for user related data.
 */
@Component
@Scope("session")
public class User implements BaseBean {

    private Integer userId;

    @NotNull
    @Size(min = 3, max = 255, message = "Name must have at least 3 characters !!")
    private String name;

    // Need to be populated from application at client end.
    @NotNull
    private Integer appId;

    @Email
    private String email;

    @Pattern(regexp = "[[a-z]*[A-Z]*[a-z]+[A-Z]+[0-9]+[a-z]*[A-Z]*]{8}", message = "Must be a combination of\nUppercase Alphabets \nLowercase Alphabets \nNumbers")
    private String password;

    @NotNull
    @Size(min = 15, max = 255, message = "Not a valid address !!")
    private String address;

    @NotNull
    private String city;

    @NotNull
    private Integer mobileNumber;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
