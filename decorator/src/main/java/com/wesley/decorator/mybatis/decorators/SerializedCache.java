package com.wesley.decorator.mybatis.decorators;

import com.wesley.decorator.mybatis.Cache;

import java.io.Serializable;

/**
 * SerializedCache
 *
 * @author WangPanYong
 * @since 2021/10/09 14:55
 */
public class SerializedCache implements Cache {

    private final Cache delegate;

    public SerializedCache(Cache delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getId() {
        return delegate.getId();
    }

    @Override
    public void putObject(Object key, Object value) {
        // 扩展的逻辑
        if (value == null || value instanceof Serializable) {
            // 调用被装饰对象方法
            delegate.putObject(key, serialize((Serializable) value));
        } else {
            System.out.println(" ====> 没有实现Serializable接口: "+ value);
        }
    }

    private Object serialize(Serializable value) {
        System.out.println(" ====> serialize ... 执行具体的SerializedCache行为");
        return value;
    }

    private Object deserialize(Object value) {
        System.out.println(" ====> deserialize ... 执行具体的SerializedCache行为");
        return value;
    }

    @Override
    public Object getObject(Object key) {
        Object object = delegate.getObject(key);
        return object == null ? null : deserialize(object);
    }

    @Override
    public Object removeObject(Object key) {
        return delegate.removeObject(key);
    }
}
