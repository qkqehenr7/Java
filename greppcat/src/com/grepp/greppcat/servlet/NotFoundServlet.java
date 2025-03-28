package com.grepp.d_greppcat.servlet;

import com.grepp.d_greppcat.http.HttpHeader;
import com.grepp.d_greppcat.http.request.HttpRequest;
import com.grepp.d_greppcat.http.response.HttpResponse;
import com.grepp.d_greppcat.http.response.ResponseBody;
import com.grepp.d_greppcat.http.response.ResponseStartLine;

public class NotFoundServlet implements Servlet {

    public HttpResponse doGet(HttpRequest request) {
        return new HttpResponse(
            ResponseStartLine.NOT_FOUND,
            new HttpHeader(),
            new ResponseBody()
        );
    }

    public HttpResponse doPost(HttpRequest request) {
        return new HttpResponse(
            ResponseStartLine.NOT_FOUND,
            new HttpHeader(),
            new ResponseBody()
        );
    }
}
