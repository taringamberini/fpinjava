package com.fpinjava.makingjavafunctional.exercise03_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionUtilities {

  public static <T> List<T > list() {
    return Arrays.asList();
  }

  public static <T> List<T > list(T t) {
    return Arrays.asList(t);
  }
  public static <T> List<T > list(List<T> ts) {
    return new ArrayList<>(ts);
  }

  @SafeVarargs
  public static <T> List<T > list(T... t) {
    return Arrays.asList(t);
  }
  
  public static <T> T head(List<T> list) {
    if (list.size() == 0) {
      throw new IllegalStateException("head of empty list");
    }
    return list.get(0);
  }

  private static <T> List<T > copy(List<T> ts) {
    return new ArrayList<>(ts);
  }

  public static <T> List<T> tail(List<T> list) {
    if (list.size() == 0) {
      throw new IllegalStateException("tail of empty list");
    }
    List<T> workList = copy(list);
    workList.remove(0);
    return workList;
  }
}
