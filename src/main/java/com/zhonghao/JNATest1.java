package com.zhonghao;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * Created by zhonghao.han on 9/12/2018.
 */
public class JNATest1 {
  //继承Library，用于加载库文件
  public interface Clibrary extends Library {
    //加载libhello.so链接库
    JNATest1.Clibrary INSTANTCE = (JNATest1.Clibrary) Native.loadLibrary((Platform.isWindows() ? "test" : "test1"), JNATest1.Clibrary.class);

    //此方法为链接库中的方法
     int add(int a,int b);
     int substract(int a,int b);
     void printHello();
  }

  public static void main(String[] args) {
    //调用
    int sum = JNATest1.Clibrary.INSTANTCE.add(5,3);
    int sub = JNATest1.Clibrary.INSTANTCE.substract(5,3);
    System.out.println("add(5,3) = "+sum);
    System.out.println("substract(5,3) = "+sub);
    JNATest1.Clibrary.INSTANTCE.printHello();

  }
}
