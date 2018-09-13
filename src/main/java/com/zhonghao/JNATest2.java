package com.zhonghao;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * Created by zhonghao.han on 9/13/2018.
 */
public class JNATest2 {
  //继承Library，用于加载库文件
  public interface Clibrary extends Library {
    //加载libhello.so链接库
    JNATest2.Clibrary INSTANTCE = (JNATest2.Clibrary) Native.loadLibrary("test", JNATest2.Clibrary.class);

    //此方法为链接库中的方法
    int add(int a,int b);
    int substract(int a,int b);
    void printHello();
  }

}
