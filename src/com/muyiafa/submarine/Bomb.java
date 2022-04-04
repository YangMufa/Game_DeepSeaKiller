package com.muyiafa.submarine;

import javax.swing.*;

/**
 * 深水炸弹类
 *      是模板 放战舰对象所有公共的属性和行为
 */

public class Bomb extends SeaObject{
    Bomb(int x,int y){
        super(x,y,9,12,3);
    }

    @Override
    void step() {
        y +=speed;//深水炸弹 y 向下运动
    }
    
    @Override
    public ImageIcon getImage() {
        if (this.isLive()) {//如果当前对象是活着的
            return ImageResources.bomb;//返回深水炸弹图片
        }
        return null;//如果能执行到此处，说明当前对象是死亡状态，返回null
    }

    @Override
    public boolean isoutBunds(){
        return this.y >= GameWorld.WIDTH;//如果当前深水炸弹对象的y大于等于窗口的高
    }
}
