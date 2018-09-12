package com.zhonghao;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * Created by zhonghao.han on 9/12/2018.
 */
public class JnaTest {
  //继承Library，用于加载库文件
  public interface Clibrary extends Library{
    //加载libhello.so链接库
    Clibrary INSTANTCE = (Clibrary) Native.loadLibrary("helloworld", Clibrary.class);

    //此方法为链接库中的方法
    void test();
  }

  public static void main(String[] args) {
    //调用
    Clibrary.INSTANTCE.test();
  }
}
