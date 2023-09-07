/**
 * <b>Counter 类</b>
 * <p>
 * 它的值是一个名称和一个非负整数，它的操作有创建对象并初始化为 0、当前值加 1 和获取当前值。
 * <p>这个抽象对象在许多场景中都会用到。例如，这样一个数据类型可以用于电子计票软件，它能够保证投票者所能进行的唯一操作就是将他选择的候选人的
 * 计数器加一。也可以在分析算法性能时使用 {@code Counter} 来记录基本操作的调用次数。
 */

public class Counter {
    int counter;
    String counter_id;
    Counter(String id) {
        counter = 0;
        counter_id = id;
    }
    public void increment() {
        counter++;
    }

    public int tally() {
        return counter;
    }

    @Override
    public String toString() {
        return counter + " " + counter_id;
    }
}
