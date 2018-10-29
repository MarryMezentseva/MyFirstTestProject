package com.masha.myFirstTestProject.p2;



class OtherPackage {
    OtherPackage() {
        com.masha.myFirstTestProject.p1.Protection p = new com.masha.myFirstTestProject.p1.Protection();
        System.out.println("конструктор другого пакета");
// доступно только для данного класса или пакета
// System.out.println("n = " + p.n) ;
// доступно только для данного класса
// System.out.println("n_pri = " + p.n_pri);
// доступно только для данного класса, подкласса или
// System.out.println("n_prо = " + р .n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
