
/**
 * Without violating encapsulation,capture and externalize an object's internal state so that the
 * object can be restored to this state later.
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 * 例如事务的回滚就是通过备忘录模式。
 * 多备份就需要使用 hashmap 这样的容器进行保存。
 * 最佳实践：系统中使用内存存储某个时间点的快照，但其实好像可以用 json 存储？
 * liwenguang 2018-10-29 20:30:44
 */
package memento;