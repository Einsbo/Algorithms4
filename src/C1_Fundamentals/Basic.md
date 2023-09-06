### 1.1.9.5 重定向与管道
**重定向输出**：可以将程序的标准输出**重定向**到另一个文件，文件的内容既可以永久保存也可以在之后作为另一个程序的输入：
```shell
# 该命令指明标准输出流不被打印到终端窗口而是被写入 data.txt 文件
# 每次调用 StdOut.print() 或 StdOut.println() 都会向该文件追加一段文本
% java RandomSeq 1000 100.0 200.0 > data.txt
```
**重定向输入**：类似，我们可以重定向标准输入以使 `StdIn` 从文件中读取数据：
```shell
# < 告诉操作系统读取文本文件 data.txt 作为输入流而不是在终端中等待用户输入
% java Average < data.txt
```
**管道**：将这两者结合起来，把一个程序到输出重定向为另一个程序的输入叫做**管道**：
```shell
# 将 RandomSeq 的标准输出和 Average 的标准输入指定为同一个流
# 它的效果好像是在 Average 运行时 RandomSeq 把它生成的数字输入了终端窗口
# 这种方法突破了输入输出流的长度限制。即使计算机没有足够的空间来存储 10 亿个数
# 我们仍然可以把例子中的 1000 换成 1 000 000 000
% java RandomSeq 1000 100.0 200.0 | java Average
```
> IDEA 配置：设置 `Configurations -> Application` 中的 `Working directory 为 .../Algorithms4/algs4-data`。