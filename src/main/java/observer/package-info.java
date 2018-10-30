
/**
 *  liwenguang 2018-10-30 11:59:41
 *  Define a one-to-many dependency between objects so that when one object changes state,
 *  all its dependents are notified and updated automatically.
 *  定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。
 *  观察者和被观察者之间是抽象耦合，比如消息队列中的异步通知。
 */
package observer;