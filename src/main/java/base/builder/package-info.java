
/**
 *  liwenguang 2018-11-05 11:49:15
 *  Separate the construction of a complex object from its representation so that the same
 *  construction process can create different representations.
 *  将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *  在于封装和过程细化，适用于相同的方法，不同的执行顺序，产生不同的事件结果的场景。
 *  建造者关注于零件类型和顺序。工厂模式在于创建零件，不关注顺序！
 */
package base.builder;