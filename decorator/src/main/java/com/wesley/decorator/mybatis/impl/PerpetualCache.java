package com.wesley.decorator.mybatis.impl;

import com.wesley.decorator.mybatis.Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * PerpetualCache
 *
 * @author WangPanYong
 * @since 2021/10/09 14:45
 */
public class PerpetualCache implements Cache {

    private final String id;

    private final Map<Object, Object> cache = new HashMap<>();

    public PerpetualCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void putObject(Object key, Object value) {
        System.out.println(" ====> putObject ... 加同步锁");
        cache.put(key, value);
    }

    @Override
    public Object getObject(Object key) {
        System.out.println(" ====> getObject ... 加同步锁");
        return cache.get(key);
    }

    @Override
    public Object removeObject(Object key) {
        System.out.println(" ====> removeObject ... 加同步锁");
        return cache.remove(key);
    }
}
