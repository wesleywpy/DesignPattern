package com.wesley.decorator;

import com.wesley.decorator.mybatis.Cache;
import com.wesley.decorator.mybatis.decorators.SerializedCache;
import com.wesley.decorator.mybatis.decorators.SynchronizedCache;
import com.wesley.decorator.mybatis.impl.PerpetualCache;

/**
 * App
 *
 * @author WangPanYong
 * @since 2021/10/09 15:06
 */
public class App {

    public static void main(String[] args) {
        PerpetualCache cache = new PerpetualCache("mybatisCache");
        Cache cacheDecorator = new SerializedCache(new SynchronizedCache(cache));

        cacheDecorator.putObject("k1", "v1");
    }
}
