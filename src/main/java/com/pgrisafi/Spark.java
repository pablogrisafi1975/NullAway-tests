package com.pgrisafi;

import org.springframework.lang.Nullable;
import spark.utils.CollectionUtils;
import spark.utils.ObjectUtils;
import spark.utils.StringUtils;

import java.util.List;

public class Spark {
    public void objectIsEmpty(@Nullable java.lang.String[] array) {
        if (!ObjectUtils.isEmpty(array)) {
            System.out.println(array[0]); //no error in new version
        } else {
            System.out.println(array[0]); //detected
        }
    }

    public void collectionIsEmpty(@Nullable List<java.lang.String> col) {
        if (!CollectionUtils.isEmpty(col)) {
            System.out.println(col.get(0)); //no error in new version
        } else {
            System.out.println(col.get(0)); //detected
        }

    }

    public void collectionNotIsEmpty(@Nullable List<java.lang.String> col) {
        if (CollectionUtils.isNotEmpty(col)) {
            System.out.println(col.get(0)); //no error in new version
        } else {
            System.out.println(col.get(0)); //detected
        }
    }

    public void stringIsEmpty(@Nullable java.lang.String str) {
        if (StringUtils.isEmpty(str)) {
            System.out.println(str.charAt(0)); //detected
        } else {
            System.out.println(str.charAt(0)); //no error in new version
        }
    }

    public void stringIsNotEmpty(@Nullable java.lang.String str) {
        if (!StringUtils.isNotEmpty(str)) {
            System.out.println(str.charAt(0)); //detected
        } else {
            System.out.println(str.charAt(0)); //no error in new version
        }
    }

    public void stringHasLength(@Nullable java.lang.String str) {
        if (StringUtils.hasLength(str)) {
            System.out.println(str.charAt(0)); //no error in new version
        } else {
            System.out.println(str.charAt(0)); //detected
        }
    }

    public void stringIsBlank(@Nullable java.lang.String str) {
        if (!StringUtils.isBlank(str)) {
            System.out.println(str.charAt(0)); //no error in new version
        } else {
            System.out.println(str.charAt(0)); //detected
        }
    }

    public void stringIsNotBlank(@Nullable java.lang.String str) {
        if (!StringUtils.isNotBlank(str)) {
            System.out.println(str.charAt(0)); //detected
        } else {
            System.out.println(str.charAt(0)); //no error in new version
        }
    }

}
