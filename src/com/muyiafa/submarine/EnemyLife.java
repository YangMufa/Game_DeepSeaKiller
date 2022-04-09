package com.muyiafa.submarine;

/**
 * 加命的接口：主要提供加命的行为 供实现类去实现加命细节！
 */
public interface EnemyLife {
    //返回值为命数，具体实现类决定返回多少命
    int getLife();
}
