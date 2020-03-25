package com.silver;

public class InnerTestClass {
    private int val1 = 10;
    private static int val2 = 100;

    public Inner getInner() {
        return new Inner();
    }

    public StaticInner getStaticInner() {
        return new StaticInner();
    }

    public void CallInnerMethod() {
        new Inner().method1();
        new StaticInner().method1();
    }

    private class Inner {
        private void method1() {
            System.out.println(val1);
        }

        @Override
        public String toString() {
            return "hoge";
        }
    }

    abstract class AbstractInner {
        abstract void abstractMethod();

        void method1() {
            System.out.println("abstractですよ");
        }
    }

    private class Immple extends AbstractInner {
        @Override
        void abstractMethod() {
            System.out.println("実装しました");
        }
    }

    private static class StaticInner {
        private void method1() {
            System.out.println(val2);
        }

        private static void method2() {
            System.out.println("static:" + val2);
        }
    }
}

class CallClass {
    public static void main(String[] hoge) {
        var test = new InnerTestClass();
        test.CallInnerMethod();
        var inner = test.getInner();
        System.out.println(inner);
        var staticInner = test.getStaticInner();
        System.out.println(staticInner);
    }
}
