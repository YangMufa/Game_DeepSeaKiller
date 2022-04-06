package com.muyiafa.submarine;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Timer;//定时器模板
import java.util.TimerTask;//任务模板

import java.awt.event.KeyAdapter;//键盘侦听器
import java.awt.event.KeyEvent;//键盘事件


/**
 * 游戏窗口类：负责运行游戏
 *      存放项目相关的代码逻辑
 */
public class GameWorld extends JPanel {
    public static final int WIDTH = 641;//宽
    public static final int HEIGHT = 479;//高

    Battleship ship = new Battleship();//声明一个战舰类型的变量

    Bomb bombs[] = {};//声明一个深水炸弹类型的数组变量
    SeaObject[] submarines = {};//代表三种潜艇：侦查潜艇、鱼雷潜艇、水雷潜艇
    SeaObject[] thunders = {};//代表两种雷

    //生成潜艇的方法 返回值可以写各种潜艇的父类型
    public SeaObject createSubmarine() {
        //产生0~20的随机数
        int tepe = (int) (Math.random() * 20);
        if (tepe < 10) {//如果生成的随机数在0~9返回侦查潜艇
            return new ObserverSubmarine();
        } else if (tepe < 15) {//如果生成的随机数在10~15，返回鱼雷潜艇
            return new TorpedoSubmarine();
        } else {//else 返回水雷潜艇
            return new MineSubmarine();
        }
    }

    private int subEnterIndex = 0;//控制潜艇产生的速度
    private int thunderIndex = 0;//控制雷艇产生的速度

    //潜艇入场的方法，将随机参数的潜艇对象装到潜艇素组中
    public void submarineEnterAction() {//每10毫秒被调用一次run()
        subEnterIndex++;//自增 每10毫秒自增一次
        if (subEnterIndex % 40 == 0) {//每400毫秒走一次if
            //1、调用生成的潜艇的方法，返回一个随机潜艇对象 接收
            SeaObject obj = createSubmarine();
            //2、为前提数组在原有的基础上增加一个容量
            submarines = Arrays.copyOf(submarines, submarines.length + 1);
            //3、将对象赋值给数组中下标最后一个空间
            submarines[submarines.length - 1] = obj;
        }

    }

    //控制雷入场的方法-放到run中
    public void thunderEnterAction() {
        thunderIndex++;
        if (thunderIndex % 100 == 0) {//现在生成的速度，可参考 潜艇入场控制速度的代码,每1秒走一次if
            for (int i = 0; i < submarines.length; i++) {//for循环 遍历潜艇数组
                //在for循环体里面访问潜艇数组的每个对象并调用shootThunter方法，声明一个SeaObject类型接收
                SeaObject obj = submarines[i].shootThunder();//调用生成鱼雷的方法，返回一个随机鱼雷对象
                if (obj != null) {//如果当前对象不为空
                    thunders = Arrays.copyOf(thunders, thunders.length + 1);//为当前雷数组扩容
                    thunders[thunders.length - 1] = obj;//将接收的雷对象数组的最后一个元素中
                }
            }
        }
    }


    //所有潜艇、雷的移动方法
    public void stepAction() {
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].step();//调用潜艇数组每个对象的移动方法
        }
        for (int i = 0; i < thunders.length; i++) {
            thunders[i].step();//调用鱼雷数组每个对象的移动方法
        }
        for (int i = 0; i < bombs.length; i++) {
            bombs[i].step();//调用深水炸弹数组每个对象的移动方法
        }
    }

    //深水炸弹入场的方法，放在当按下空额建的if内调用
    public void bombEnterAction() {
        //1、通过战舰对象调用 shootBomb方法并用深水炸弹类型来接收
        Bomb obj = ship.shoopBomb();
        //2、为bombs数组扩容
        bombs = Arrays.copyOf(bombs, bombs.length + 1);
        //3、将接收的对象赋值给bombs数组的最后一个元素
        bombs[bombs.length - 1] = obj;
    }

    //此方法用来判断并删除对象方法，放在run中
    public void outOfBounds() {
        //1、遍历潜艇数组并在循环里面判断当前潜艇数组的每个对象是否越界
        //2、若成立则将当前对象剔除出数组中
        //3、将数组最后一个元素赋值给当前越界的元素空间（替换）
        //4、
        for (int i = 0; i < submarines.length; i++) {
            if (submarines[i].isoutBounds()) {
                submarines[i] = submarines[submarines.length - 1];
                submarines = Arrays.copyOf(submarines, submarines.length - 1);
            }
        }
//        遍历雷的数组
        for (int i = 0; i < thunders.length; i++) {
            if (thunders[i].isoutBounds()) {
                thunders[i] = thunders[thunders.length - 1];
                thunders = Arrays.copyOf(thunders, thunders.length - 1);
            }
        }
//        遍历深水炸弹的数组
        for (int i = 0; i < bombs.length; i++) {
            if (bombs[i].isoutBounds()) {
                bombs[i] = bombs[bombs.length - 1];
                bombs = Arrays.copyOf(bombs, bombs.length - 1);
            }
        }
    }

    //用来测试的方法
    void action() {

        //实现键盘侦听事件相关逻辑代码
        KeyAdapter adapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//重写按下键盘的事件
                //通过KeyEvent类直接访问键盘的按键
                //通过参数e里面提供的一份方法getKeycode() 来获取用户当前按下的按键是什么
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {//判断用户按下的是不是空格键
                    bombEnterAction();//发射深水炸弹
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {//判断用户按下的键盘是不是左移动
                    ship.leftMove();//调用战舰对象左移动
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {//判断用户按下的键盘是不是右移动
                    ship.rightMove();//调用战舰对象右移动
                }
            }
        };
        this.addKeyListener(adapter);//将键盘侦听器添加到检测当中

        Timer timer = new Timer();//创建具体 定时器对象
        TimerTask task = new TimerTask() {
            @Override
            public void run() { //自定义的任务逻辑方法
                submarineEnterAction();//调用潜艇入场的方法
                thunderEnterAction();//调用雷入场的方法
                stepAction();//调用移动的方法
                outOfBounds();//调用删除优化对象的方法
                System.out.println(submarines.length + "当前潜艇在内存中的数量" + "，雷在内存中的数量" + thunders.length);
                repaint();//刷新绘制
            }
        };
        //1、具体执行的任务  2、延时多久开始第一次执行(毫秒) 3、执行第一次以后下次执行的间隔时间(毫秒)
        timer.schedule(task, 5000, 10);


    }

    void paintWorld() {
        //1、创建一个画框
        JFrame frame = new JFrame();
        this.setFocusable(true);
        frame.add(this);//将当前类添加到画框里
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时释放
        frame.setSize(WIDTH + 16, HEIGHT + 39);//画框的大小
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//设置窗口可见
    }

    @Override
    public void paint(Graphics g) {
////        JPanle 提供了绘制图片的方法
//        //1、对象的图片 2、需要X坐标 3、需要Y坐标
//        ImageIcon ship = ImageResources.battleShip;
//        // 1、填 null 2、填g 3、填x 4、填y
//        ship.paintIcon(null,g,270,124);
        // 填 null ，填 g ， 3.0 3.4
        ImageResources.sea.paintIcon(null,g,0,0);//海洋背景

        ship.paintImage(g);//绘制战舰
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].paintImage(g);//绘制潜艇数组中所有对象
        }

        for (int i = 0; i < thunders.length; i++) {
            thunders[i].paintImage(g);//绘制雷组中所有对象
        }

        for (int i = 0; i < bombs.length; i++) {
            bombs[i].paintImage(g);//绘制深水炸弹数组的所有对象
        }
    }

    public static void main(String[] args) {

        GameWorld gw= new GameWorld();
        gw.action();
        gw.paintWorld();

    }
}

