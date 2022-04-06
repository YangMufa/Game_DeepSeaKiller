package com.muyiafa.submarine;

import javax.swing.*;

/**
 * 鱼雷类
 *      是模板 放战舰对象所有公共的属性和行为
 */
public class Torpedo extends SeaObject{

    Torpedo(int x,int y){
        super(x,y,5,18,2);
    }

    @Override
    void step() {
        y-=speed;//y向上运动
    }

    @Override
    public ImageIcon getImage() {
        if (this.isLive()) {//如果当前对象是活着的
            return ImageResources.torpedo;//返回鱼雷图片
        }
        return null;//如果能执行到此处，说明当前对象是死亡状态，返回null
    }

    @Override
    public boolean isoutBounds() {
        return this.y <= -this.height;//如果当前鱼雷对象的y小于等于负自身图片的高
    }
}
