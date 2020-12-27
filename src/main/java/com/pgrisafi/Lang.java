package com.pgrisafi;

import org.springframework.lang.Nullable;
import org.apache.commons.lang.StringUtils;

public class Lang {

    public void stringIsEmpty(@Nullable String str) {
        if (StringUtils.isEmpty(str)) {
            System.out.println(str.charAt(0)); //detected
        } else {
            System.out.println(str.charAt(0)); //no error in new version
        }
    }

    public void stringIsNotEmpty(@Nullable String str) {
        if (!StringUtils.isNotEmpty(str)) {
            System.out.println(str.charAt(0)); //detected
        } else {
            System.out.println(str.charAt(0)); //no error in new version
        }
    }

    public void stringIsBlank(@Nullable String str) {
        if (!StringUtils.isBlank(str)) {
            System.out.println(str.charAt(0)); //no error in new version
        } else {
            System.out.println(str.charAt(0)); //detected
        }
    }

    public void stringIsNotBlank(@Nullable String str) {
        if (!StringUtils.isNotBlank(str)) {
            System.out.println(str.charAt(0)); //detected
        } else {
            System.out.println(str.charAt(0)); //no error in new version
        }
    }

}
