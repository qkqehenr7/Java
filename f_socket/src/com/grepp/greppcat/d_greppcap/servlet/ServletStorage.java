package com.grepp.greppcat.d_greppcap.servlet;

import com.grepp.greppcat.d_greppcap.exception.ServletInitializeException;
import com.grepp.greppcat.d_greppcap.servlet.annotation.RequestMapping;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ServletStorage {

    private final Map<String, Servlet> servlets;

    private static ServletStorage instance;

    public static ServletStorage getInstance() {
        if (instance == null)
            throw new ServletInitializeException("ServletStorage not initialized");

        return instance;
    }

    public static ServletStorage init(List<Servlet> servlets) {
        if (instance == null) {
            instance = new ServletStorage(servlets);
        }

        return instance;
    }

    private ServletStorage(List<Servlet> servlets) {
        this.servlets = registServlet(servlets);
    }

    private Map<String, Servlet> registServlet(List<Servlet> servlets) {
        Map<String, Servlet> servletMap = new LinkedHashMap<>();
        for (Servlet servlet : servlets) {
            // servlet 객체에 어노테이션이 있는지 체크
            RequestMapping requestMapping = servlet.getClass().getAnnotation(RequestMapping.class);
            if (requestMapping == null)
                throw new ServletInitializeException(servlet.getClass().getCanonicalName()
                    + " is not annotated with @RequestMapping");

            String url = requestMapping.url().replaceFirst("/", "");

            if (servletMap.containsKey(requestMapping.url())) // servlet 에서 중복된 1 depth 경로를 지정하지 않게 체크
                throw new ServletInitializeException(servlet.getClass().getCanonicalName()
                    + " : " + requestMapping.url() + " is already registered");

            servletMap.put(url, servlet);
        }

        return servletMap;
    }

    public Servlet getServlet(String url) {
        return servlets.get(url.split("/")[0]);
    }

}
