/**
 * Decouple and abstraction from its implementation so that the two can independently.
 * 将抽象和实现解耦，使得两者可以独立的变化。
 * 抽象角色引用实现角色，即抽象公司引用产品实现类。
 * 优点在于类之间的弱引用关系，比继承更加易扩展。缺点在于需要明确接口或实现类不会变化。
 */

package bridge;