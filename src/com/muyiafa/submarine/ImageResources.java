package com.muyiafa.submarine;

import javax.swing.*;

/**
 * 图片资源加载类
 * 负责加载和初始化项目组所需要的图片
 */
public class ImageResources {
    //ImageIcon用来存照片资源的类型
    public static ImageIcon battleShip;//用来存战舰图片的变量
    public static ImageIcon bomb;//用来存深水炸弹图片的变量
    public static ImageIcon gameover;//用来存游戏结束时的图片变量
    public static ImageIcon mine;//用来存水雷图片的变量
    public static ImageIcon minesubm;//用来存水雷潜艇图片的变量
    public static ImageIcon obsersubm;//用来存侦查潜艇图片的变量
    public static ImageIcon sea;//用来存海洋背景始图片的变量
    public static ImageIcon start;//用来存游戏开始图片的变量
    public static ImageIcon torpedo;//用来存鱼雷图片的变量
    public static ImageIcon torpedosubm;//用来存鱼雷潜艇图片的变量

    static{//静态代码块 当类被加载时 执行代码块中的内容
        battleShip = new ImageIcon("img/battleship.png");
        bomb = new ImageIcon("img/bomb.png");
        gameover = new ImageIcon("img/gameover.png");
        mine = new ImageIcon("img/mine.png");
        minesubm = new ImageIcon("img/minesubm.png");
        obsersubm = new ImageIcon("img/obsersubm.png");
        sea = new ImageIcon("img/sea.png");
        start = new ImageIcon("img/start.png");
        torpedo = new ImageIcon("img/torpedo.png");
        torpedosubm = new ImageIcon("img/torpesubm.png");
    }

    public static void main(String[] args) {
        System.out.println(battleShip.getImageLoadStatus());
        System.out.println(bomb.getImageLoadStatus());
        System.out.println(gameover.getImageLoadStatus());
        System.out.println(mine.getImageLoadStatus());
        System.out.println(minesubm.getImageLoadStatus());
        System.out.println(obsersubm.getImageLoadStatus());
        System.out.println(sea.getImageLoadStatus());
        System.out.println(start.getImageLoadStatus());
        System.out.println(torpedo.getImageLoadStatus());
        System.out.println(torpedosubm.getImageLoadStatus());
    }
}
