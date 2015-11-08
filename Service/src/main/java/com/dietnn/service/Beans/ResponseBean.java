package com.dietnn.service.beans;

import java.util.Map;

/*Response bean*/
public class ResponseBean<T extends BaseBean> {

    public ResponseBean(Map<String,String> errorMap , T response){
        this.errorMap = errorMap;
        this.response = response;
    }

    private Map<String,String> errorMap;

    private T response;

    public Map<String, String> getErrorMap() {
        return errorMap;
    }

    public void setErrorMap(Map<String, String> errorMap) {
        this.errorMap = errorMap;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
