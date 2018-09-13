package com.zhonghao;

/**
 * Created by zhonghao.han on 9/13/2018.
 */
public class JNATest3 {
  public static void main(String[] args) {
    //调用
    int sum = JNATest2.Clibrary.INSTANTCE.add(5,3);
    int sub = JNATest2.Clibrary.INSTANTCE.substract(5,3);
    System.out.println("add(5,3) = "+sum);
    System.out.println("substract(5,3) = "+sub);
    JNATest2.Clibrary.INSTANTCE.printHello();
  }
}
