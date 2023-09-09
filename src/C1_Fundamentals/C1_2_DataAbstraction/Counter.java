package C1_2_DataAbstraction;

import edu.princeton.cs.algs4.StdOut;

/**
 * <b>Counter 类</b>
 * <p>
 * 它的值是一个名称和一个非负整数，它的操作有创建对象并初始化为 0、当前值加 1 和获取当前值。
 * <p>这个抽象对象在许多场景中都会用到。例如，这样一个数据类型可以用于电子计票软件，它能够保证投票者所能进行的唯一操作就是将他选择的候选人的
 * 计数器加一。也可以在分析算法性能时使用 {@code Counter} 来记录基本操作的调用次数。
 */

public class Counter { // 类名
    // 实例变量
    private final String name;
    private int count;

    // 构造函数
    public Counter(String id) {
        name = id;
    }

    // 实例方法
    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }

    // 测试用例
    public static void main(String[] args) {
        Counter heads = new Counter("heads"); // 触发构造函数
        Counter tails = new Counter("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        StdOut.println(heads + " " + tails); // 自动调用 toString()
        StdOut.println(heads.tally() + tails.tally());
    }
}
