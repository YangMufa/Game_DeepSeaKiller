package com.muyiafa.submarine;

import javax.swing.*;
import java.awt.*;

/**
 * 海洋类对象
 * 所有海洋类对象的父类
 */

public abstract class SeaObject implements EnemyLife{

    @Override
    public int getLife() {
        return 1;
    }

    public static  final int LIVE=0;//活着的状态
    public static  final int DEAD=1;//死亡的状态

    public int currentState=LIVE;//默认初始化对象都是活着的状态


    //抽象类不能创建对象
//    SeaObject s = SeaObject();
    //抽象类可以创建数组的对象
    SeaObject[] ss = new SeaObject[5];

    int x,y,width,height,speed;//共有的属性

    SeaObject(){}

    /**
     * 此构造方法是专门为三种潜艇提供的构造方法4因为具体潜艇的高不同，
     * 所以宽高不能写死，做成形式参数，由子类调用传入他的宽高数据
     *  x y speed 初始化的数据都是一样的 则写死即可
     */
    SeaObject(int width,int height){//构造方法
        this.width=width;
        this.height=height;
        x=-width;//x坐标负一个图片的宽度，表示在屏幕的左侧外面
        y=(int)(Math.random()*(GameWorld.HEIGHT-height-150)+150);//随机Y坐标
        speed=(int)(Math.random()*(3-1)+1);//随机速度1~3
    }

    /**
     * 因为赋值的过程重复
     * 此构造方法是专门为战舰、渗水炸弹、鱼雷和水雷提供的构造方法，
     * 所因为这4个类的具体数据不同，所以做成形式参数，具体有当前类使用时提供
     */
    SeaObject(int x,int y,int width,int height,int speed){

        this.x=x;
        this.y=y;
        this.width=width;//图片的宽
        this.height=height;//图片的搞
        this.speed=speed;//每次移动多少
    }

    //判断调用方法的对象 是否为死亡状态
    public boolean isDead(){
        return  currentState == DEAD;
    }
    //判断调用方法的对象 是否为活着状态
    public boolean isLive(){
        return  currentState == LIVE;
    }


    //共有的行为
    //抽象方法需要放在抽象类里面才可以
    abstract void step();

    /**
     * 因为每个子类都需要进行获取图片,那么就将获取图片的行为提取到父类中
     * 因为每个子类获取图片的逻辑是不一样的 所以做一个抽象方法
     * 返回值是 图片类型
     * 获取图片的抽象方法  供具体子类重写实现返回对应的图片
     */
    public abstract ImageIcon getImage();

    /**
     * 因为每个子类都需要进行绘制，那么就将绘制的行为提取到父类中
     * 因为每逢个子类绘制的逻辑都是一样的，所以做成一个普通方法
     * 参数需要一个画笔，通过外部调用方法是传递一个画笔
     */
    public void paintImage(Graphics g){
        if (this.getImage() != null) {//如果当前对象是活着的
            ImageIcon icon = this.getImage();//获取当前对象的图片
            //1、填null 2、g 3、x坐标 4、坐标
            icon.paintIcon(null,g,this.x+100,this.y);//paintIcon(null,g,this.x+100,this.y) +100是为了能看到潜艇，后续删除
        }
    }

    /**
     * 生成雷的方法，
     * @return
     */
    public SeaObject shootThunder() {
        //创建雷对象之前，要先将鱼雷对象的 x 、 y 坐标算出来
        int x = this.x + this.width;
        int y = this.y - 5;
        //instaceof 关键字的作用：判断 是否是某个类型 的语法
        if (this instanceof MineSubmarine) {
            return new Mine(x, y);//返回水雷
        }else if (this instanceof  TorpedoSubmarine){
            return new Torpedo(x,y);//返回鱼雷
        }else {
            return null;//如果能走到这一行，说明侦查潜艇调用了发射雷的方法 那么返回null
        }
    }

    //判断潜艇、雷是否越界的方法
    //三种潜艇的判断是否越界的标准是一样的，可以复用
    //其他三个类，深水炸弹，鱼雷 不一样 则自行重写即可
    public boolean isoutBounds(){
        return this.x >= GameWorld.WIDTH;//判断潜艇是否超出屏幕的宽
    }

    public boolean isHit(SeaObject other){
        //this
        //other
        int x1 = this.x - other.width;
        int x2 = this.x + this.width;
        int y1 = this.y - other.height;
        int y2 = this.y + this.height;
        int x = other.x;
        int y = other.y;
        //如果传入对象的x在x1和x2之间，y在y1和y2之间，则返回true即代表撞上了
        return (x>=x1 && x<= x2)&&(y>=y1 && y<=y2);
    }

    //那个对象打点去掉这个方法就把那个对象设置为死亡状态
    public void goDead(){
        this.currentState = DEAD;//设置状态为死亡状态
    }

}
