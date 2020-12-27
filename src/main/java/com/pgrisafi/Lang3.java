package com.pgrisafi;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;


public class Lang3 {
    public void objectIsEmpty(@Nullable String[] array) {
        if (!ObjectUtils.isEmpty(array)) {
            System.out.println(array[0]); //no error in new version
        } else {
            System.out.println(array[0]); //detected
        }
    }


    public void objectIsNotEmpty(@Nullable String[] array) {
        if (ObjectUtils.isNotEmpty(array)) {
            System.out.println(array[0]); //no error in new version
        } else {
            System.out.println(array[0]); //detected
        }
    }

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
            System.out.println(str.charAt(0));  //no error in new version
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
