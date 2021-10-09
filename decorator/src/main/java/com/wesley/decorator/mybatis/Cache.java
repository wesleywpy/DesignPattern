package com.wesley.decorator.mybatis;

/**
 * Cache
 *
 * @author WangPanYong
 * @since 2021/10/09 14:41
 */
public interface Cache {

    /**
     * @return 缓存的Id
     */
    String getId();

    void putObject(Object key, Object value);

    Object getObject(Object key);

    Object removeObject(Object key);
}
