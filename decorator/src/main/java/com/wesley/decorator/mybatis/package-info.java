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

/**
 * 在mybatis中，缓存的功能由根接口 Cache（org.apache.ibatis.cache.Cache）定义。
 * 整个体系采用装饰器设计模式，
 * 数据存储和缓存的基本功能由 PerpetualCache（org.apache.ibatis.cache.impl.PerpetualCache）永久缓存实现，
 * 然后通过一系列的装饰器来对PerpetualCache永久缓存进行缓存策略等方便的控制。
 */
package com.wesley.decorator.mybatis;


