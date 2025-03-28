package com.grepp.d_greppcat.servlet;

import com.grepp.d_greppcat.http.HttpHeader;
import com.grepp.d_greppcat.http.HttpMethod;
import com.grepp.d_greppcat.http.request.HttpRequest;
import com.grepp.d_greppcat.http.response.HttpResponse;
import com.grepp.d_greppcat.http.response.ResponseBody;
import com.grepp.d_greppcat.http.response.ResponseStartLine;
import com.grepp.d_greppcat.servlet.annotation.EndPoint;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class HandlerAdapter {

    public HttpResponse handle(HttpRequest request, Servlet servlet)
        throws InvocationTargetException, IllegalAccessException {

        HttpMethod requestMethod = request.startLine().method();
        Method[] methods = servlet.getClass().getMethods();
        List<Method> methodList = matchMethodWithUrl(methods, request);

        if (methodList.isEmpty())
            return new HttpResponse(
                ResponseStartLine.NOT_FOUND,
                new HttpHeader(),
                new ResponseBody()
            );

        for (Method method : methodList){
            if (method.getAnnotation(EndPoint.class).method().equals(requestMethod)){
                return (HttpResponse) method.invoke(servlet, request);
            }
        }

        return new HttpResponse(
            ResponseStartLine.METHOD_NOT_ALLOWED,
            new HttpHeader(),
            new ResponseBody()
        );
    }

    private List<Method> matchMethodWithUrl(Method[] methods, HttpRequest request) {

        List<Method> methodList = new ArrayList<Method>();

        for (Method method : methods) {
            // 메서드 중 EndPoint가 있는 것만 찾기
            if (!method.isAnnotationPresent(EndPoint.class)) continue;
            EndPoint endPoint = method.getAnnotation(EndPoint.class);

            String endPointurl = endPoint.url().replaceFirst("/", "");
            String requestUrl = generateRequestUrl(request);

            if (endPointurl.equals(requestUrl)){
                methodList.add(method);
            }
        }

        return methodList;
    }

    private String generateRequestUrl(HttpRequest request) {
        String url = request.startLine().url();
        int index = url.indexOf("/", 1);
        return index == -1 ? "" : url.substring(index + 1);
    }
}
