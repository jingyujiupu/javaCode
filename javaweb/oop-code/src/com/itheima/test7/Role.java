package com.itheima.test7;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(String[] boyfaces, String[] girlfaces) {
        this.boyfaces = boyfaces;
        this.girlfaces = girlfaces;
    }

    private char gender;
    private String face;
    String[] boyfaces={"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces={"美奂绝伦","沉鱼落雁","亭亭玉立","身材姣好","相貌平平","相貌简陋","惨不忍睹"};
    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }
    //定义一个方法用于攻击别人
    public void attack(Role role){
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        int remainBlood=role.getBlood()-hurt;
        remainBlood=remainBlood<0?0:remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName()+"打了"+role.getName()+"一下"+
                "造成了"+hurt+"点伤害"+role.getName()+"还剩下"+remainBlood+
                "点血"
        );
    }
}
