package com.masha.myFirstTestProject.Classes;

public class TestO {
    int a, b;

    TestO(int i, int j) {
        a = i;
        b = j;
    }

    // передать объект
    void meth(TestO o) {
        o.a *= 2;
        o.b /= 2;
    }
}
            class PassObjRe {
                public static void main(String args[]) {
                    TestO ob = new TestO(15, 20);
                    System.out.println("ob.a и оЬ.Ь до вызова : " + ob.a + " " + ob.b);
                    ob.meth(ob);
                    System.out.println(" ob.a и оЬ.Ь после вызова : " + ob.a + " " + ob.b);
                }
            }

