package com.cyc.common;

import org.springframework.http.HttpHeaders;

public class HttpHeader {

    public HttpHeaders headers;

    public HttpHeader(){
        headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "http://localhost:3000");
    }

}
