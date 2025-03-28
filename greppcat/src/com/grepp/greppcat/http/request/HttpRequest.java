package com.grepp.d_greppcat.http.request;

import com.grepp.d_greppcat.http.HttpHeader;

public record HttpRequest(
    RequestStartLine startLine,
    HttpHeader header,
    RequestParameter param
) {

}
