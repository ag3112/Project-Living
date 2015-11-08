package com.dietnn.service.controllers;

import com.dietnn.service.beans.ResponseBean;
import com.dietnn.service.beans.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController{

    private Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/newUserRegistration", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean createNewUser(@RequestBody @Valid User user, Errors errors) {
        Map<String,String> errorMap = new HashMap<String,String>();
        if (errors.hasErrors()) {
            for (FieldError error : errors.getFieldErrors()) {
                errorMap.put(error.getField(),error.getDefaultMessage());
            }
        }
        ResponseBean<User> response = new ResponseBean<User>(errorMap,user);
        return response;
    }

    @RequestMapping(value = "/forgotPassword", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void forgotPassword(String email) {

        // Validate the email at client end.
        // We will check only the existence of email in database.
    }

    @RequestMapping(value = "/updateProfile", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean updateProfile(@RequestBody @Valid User user, Errors errors) {
        Map<String,String> errorMap = new HashMap<String,String>();
        if (errors.hasErrors()) {
            for (FieldError error : errors.getFieldErrors()) {
                errorMap.put(error.getField(),error.getDefaultMessage());
            }
        }
        ResponseBean<User> response = new ResponseBean<User>(errorMap,user);
        return response;
    }
}
