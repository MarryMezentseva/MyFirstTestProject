package com.masha.myFirstTestProject.p2;

import com.masha.myFirstTestProject.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("унаследованный конструктор другого пакета");

//  class or package only
//  System.out.println("n = " + n);

//  class only
//  System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
