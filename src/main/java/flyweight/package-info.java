/**
 * Use sharing to support large numbers of fine-grained objects efficiently.
 * 使用共享的对象可有效地支持大量的细粒度的对象。
 * 与对象池的区别：享元模式重对象的共享问题，如何建立多个可共享的细粒度对象，而池在于相同对象的复用。
 * 缺点 ** 在于并发高的情况，如果缓存池中的对象不够多会出现并发问题。 **
 * 并发的问题，在于 hashcode 的计算 key 与 equals 的问题，因此可以重写两个方法。同时也会提高创建对象的速度
 */

package flyweight;