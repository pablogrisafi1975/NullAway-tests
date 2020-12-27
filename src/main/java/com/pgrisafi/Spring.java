package com.pgrisafi;
import org.springframework.lang.Nullable;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;

public class Spring {
    public void objectUtilsIsEmptyArray(@Nullable java.lang.String[] array) {
        if (!ObjectUtils.isEmpty(array)) {
            System.out.println(array[0]);//no error in new version
        } else {
            System.out.println(array[0]);//detected
        }

    }

    public void collectionUtilsIsEmpty(@Nullable List<java.lang.String> col) {

        if (!CollectionUtils.isEmpty(col)) {
            System.out.println(col.get(0));//no error in new version
        }else{
            System.out.println(col.get(0)); //detected
        }
    }

    public void stringUtilsIsEmpty(@Nullable java.lang.String str) {
        if (!StringUtils.isEmpty(str)) {
            System.out.println(str.charAt(0)); //no error in new version
        } else {
            System.out.println(str.charAt(0)); //detected
        }
    }

    public void stringUtilsHasLength(@Nullable java.lang.String str) {
        if (StringUtils.hasLength(str)) {
            System.out.println(str.charAt(0)); //no error in new version
        } else {
            System.out.println(str.charAt(0)); //detected
        }

    }
    public void stringUtilsHasText(@Nullable java.lang.String str) {
        if (StringUtils.hasText(str)) {
            System.out.println(str.charAt(0)); //no error in new version
        } else {
            System.out.println(str.charAt(0)); //detected
        }

    }
    public void objectUtilsIsEmpty(@Nullable java.lang.String str) {

        if(!ObjectUtils.isEmpty(str)){
            System.out.println(str.charAt(0)); //no error in new version
        } else {
            System.out.println(str.charAt(0)); //detected
        }
    }

}
