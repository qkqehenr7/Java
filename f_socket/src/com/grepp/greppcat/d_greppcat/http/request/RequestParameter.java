package com.grepp.greppcat.d_greppcap.http.request;

import com.grepp.greppcat.d_greppcap.util.MultiValueMap;
import java.util.List;
import java.util.Optional;

public class RequestParameter extends MultiValueMap<String, String> {

    public void add(String paramTxt){
        String name = paramTxt.split("=")[0];
        String value = paramTxt.split("=")[1];
        super.add(name, value);
    }

    public Optional<List<String>> getParameter(String name){
        return Optional.ofNullable(super.get(name));
    }

    @Override
    public String toString() {
        return "RequestParameter{" +
            "data=" + data +
            '}';
    }
}
