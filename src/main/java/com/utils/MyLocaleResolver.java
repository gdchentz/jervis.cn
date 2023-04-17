package com.utils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

public class Locale implements LocaleResolver {

    @Override
    public java.util.Locale resolveLocale(HttpServletRequest request) {
        String lang= request.getParameter("lang");
        if (!StringUtils.hasText(lang)){
            String[] split = lang.split("_");
            return new java.util.Locale(split[0],split[1]);
        }
        return java.util.Locale.getDefault();
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, java.util.Locale locale) {



    }
}
