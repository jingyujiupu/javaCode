package com.bjpowernode.template2;

public abstract class Person {
    public final void day(){
        qiChuang();
        xiShu();
        chiZaoCan();
        doSome();
        chiWanFan();
        shuiJiao();
    }
    public void qiChuang(){
        System.out.println("起床");
    }
    public void xiShu(){
        System.out.println("洗漱");
    }
    public void chiZaoCan(){
        System.out.println("吃早餐");
    }
    public abstract void doSome();
    public void chiWanFan(){
        System.out.println("吃晚饭");
    }
    public void shuiJiao(){
        System.out.println("睡觉");
    }
}
