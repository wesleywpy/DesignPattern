/**
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.wesley.decorator.mybatis.decorators;


import com.wesley.decorator.mybatis.Cache;

/**
 * SerializedCache
 *
 * @author WangPanYong
 * @since 2021/10/09 14:55
 */
public class SynchronizedCache implements Cache {

  private final Cache delegate;

  public SynchronizedCache(Cache delegate) {
    this.delegate = delegate;
  }

  @Override
  public String getId() {
    return delegate.getId();
  }

  @Override
  public synchronized void putObject(Object key, Object object) {
      delegate.putObject(key, object);
  }

  @Override
  public synchronized Object getObject(Object key) {
      return delegate.getObject(key);
  }

  @Override
  public synchronized Object removeObject(Object key) {
      return delegate.removeObject(key);
  }


}
