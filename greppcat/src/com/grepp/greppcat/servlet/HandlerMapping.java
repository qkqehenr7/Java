package com.grepp.d_greppcat.servlet;

import com.grepp.d_greppcat.http.request.HttpRequest;

public class HandlerMapping {

    public Servlet getHandler(HttpRequest request){
        ServletStorage storage = ServletStorage.getInstance();

        Servlet servlet = storage.getServlet(
            request.startLine().url().replaceFirst("/", ""));

        if (servlet == null) return new NotFoundServlet();
        return servlet;
    }
}
