package C1_3_BagsQueuesAndStacks;


import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * <b>Dijkstra 的双栈算术表达式求值算法</b>
 * <p>接受一个输入字符串（表达式）并输出表达式的值，算术表达式可能是一个数，或者是一个由左括号、一个算术表达式、一个运算符、另一个算术表达式
 * 和一个右括号组成的表达式。简单起见，这里定义的是未省略括号的表达式。
 * <p>那么如何得到一个算数表达式的值呢？E.W.Dijkstra 发明了一个非常简单的算法，用两个栈（一个用于保存运算符，一个用于保存操作数）完成了这个
 * 任务，其实现过程为：
 * <ul>
 *     <li>将操作数压入操作数栈</li>
 *     <li>将运算符压入运算符栈</li>
 *     <li>忽略左括号</li>
 *     <li>在遇到右括号时，弹出一个运算符，弹出所需数量的操作数，并将运算符和操作数的运算结果压入操作数栈</li>
 * </ul>
 * 在处理完最后一个右括号之后，操作数栈上只会由一个值，它就是表达式的值。
 * <p><b>输入/输出：</b>
 * <pre>
 *     % java Evaluate
 *     ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) ctrl + D
 *     101.0
 *
 *     % java Evaluate
 *     ( ( 1 + sqrt ( 5.0 ) ) / 2.0 ) ctrl + D
 *     1.618033988749895
 * </pre>
 * 这段 Stack 的用例展示了一种重要的计算模型：将一个字符串解释为一段程序并执行该程序得到结果。
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if      (s.equals("("))                ;
            else if (s.equals("+"))     ops.push(s);
            else if (s.equals("-"))     ops.push(s);
            else if (s.equals("*"))     ops.push(s);
            else if (s.equals("/"))     ops.push(s);
            else if (s.equals("sqrt"))  ops.push(s);
            else if (s.equals(")")) {
                // 如果字符为 ) 弹出运算符和操作数，计算结果并压入栈
                String op = ops.pop();
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("*"))    v = vals.pop() * v;
                else if (op.equals("/"))    v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else { // 如果字符既不是运算符也不是括号，将它作为 double 值压入栈
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
