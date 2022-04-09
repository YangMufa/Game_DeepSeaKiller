package com.muyiafa.submarine;

/**
 * 加分的接口：主要提供加分的行为，供实现类去实现加分细节
 */
public interface EnemyScore {
    //返回值类型为 int 代表若实现类被打到可以提供对于的对象
    int getScore();
}
