package com.muyiafa.submarine;

import javax.swing.*;

/**
 * 水雷潜艇类
 *      是模板 放战舰对象所有公共的属性和行为
 */
public class MineSubmarine extends SeaObject implements EnemyLife{
    MineSubmarine(){
        super(63,19);//调用父类的构造方法，传递当前潜艇的宽高
    }

    @Override
    void step() {
        x+=speed;//x向右运动
    }

    @Override
    public ImageIcon getImage() {
        if (this.isLive()) {//如果当前对象是活着的
            return ImageResources.minesubm;//返回水雷潜艇图片
        }
        return null;//如果能执行到此处，说明当前对象是死亡状态，返回null
    }

    @Override
    public int getLife() {
        return 1;
    }
}
