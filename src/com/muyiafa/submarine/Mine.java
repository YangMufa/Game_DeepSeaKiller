package com.muyiafa.submarine;

import javax.swing.*;

/**
 * 水雷类
 *      是模板 放战舰对象所有公共的属性和行为
 */
public class Mine extends SeaObject {
    Mine(int x,int y){
        super(x,y,11,11,2);
    }

    @Override
    void step() {
        y-=speed;//水雷向上运动
    }

    @Override
    public ImageIcon getImage() {
        if (this.isLive()) {//如果当前对象是活着的
            return ImageResources.mine;//返回水雷图片
        }
        return null;//如果能执行到此处，说明当前对象是死亡状态，返回null
    }

    @Override
    public boolean isoutBounds() {
        return this.y<= 150- this.height;//如果水雷的高小于等于水平面水雷图的高
    }
}
