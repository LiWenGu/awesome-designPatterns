
/**
 *  liwenguang 2018-11-01 14:23:54
 *  Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
 *  Chain the receiving objects and pass the request along the chain until an object handles it.
 *  使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。
 *  将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。
 *  将请求和处理解耦，但是性能以及调试不方便，链过长。
 */
package base.chainofresponsibility;