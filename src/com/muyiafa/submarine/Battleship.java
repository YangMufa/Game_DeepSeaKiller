package com.muyiafa.submarine;

import javax.swing.*;

/**
 * 战舰类
 *      是模板 方战舰对象所有公共的属性和行为
 */

public class Battleship extends SeaObject{
    int life;//命数
    Battleship(){//无参构造方法
        super(270,124,66,26,20);
        life=5;//游戏开始五条命
    }

    //左移
    public void leftMove(){
        this.x -= speed;
    }
    //右移
    public void rightMove(){
        this.x += speed;
    }

    @Override
    void step() {
        System.out.println("战舰通过键盘左右移动...");
    }

    //该方法被对象调用
    @Override //战舰比较特殊不是一打就死 所以在这里返回图片就可以了
    public ImageIcon getImage() {
        return ImageResources.battleShip;//返回战舰图片
    }

    //当外部战舰对象调用发射深水炸弹这个方法时，返回一个深水炸弹对象
    public Bomb shoopBomb(){
        return new Bomb(this.x,this.y);
    }
}
