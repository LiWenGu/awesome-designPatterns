
/**
 *  liwenguang 2018-11-01 15:36:49
 *  Encapsulate a request as an object, there by letting you parameterize clients with different requests,
 *  queue or log requests,and support undoable operations.
 *  将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 *  可扩展性很高，子类扩展容易。
 *  容易子类膨胀，因此可以和组合模式一起。
 */
package command;