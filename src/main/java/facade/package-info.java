
/**
 *  liwenguang 2018-10-30 10:58:26
 *  Provide a unified interface to a set of interfaces in a subsystem.Facade defines a higher-level
 *  interface that makes the subsystem easier to use.
 *  要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。
 *  约束成员的代码质量，你只能通过我的门面来访问真正的方法。即外界对子系统的访问是黑箱操作。
 *  门面不参与业务逻辑！
 *  缺点在于，如果类有变动，需要修改门面代码，会影响这整个门面。
 */

package facade;