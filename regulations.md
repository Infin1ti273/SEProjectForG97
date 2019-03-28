## 本项目的代码规范和一些规定，开工前请阅读
### 编译环境
1> 每次开工之前核对项目的时间线（先fetch再查看history）。如果自己要编码的文件已经更新了，请先pull最新的版本之后，再开始工作

2> 遇到项目无法编译，先去查看.project文件/project naturals，再去查看build path
### 代码
1> 类和成员的命名方法均采用驼峰命名法（camelCase）

2> 文件编码格式统一采用UTF-8

3> 所有数据类型的集合（如：所有用户信息，所有的dock station信息）统一使用ArrayList<>格式实现

4> 关于大括号的格式（如下所示
```java
class ClassName {
    private void someMethod(String argumentName) {        
        /*
        for(int i=1;i>0;i++) {
            //do something
        }
        */
    }
}
```
5> 每个方法的代码长度（不算括号）尽量不超过30行，分支数量（if-else/switch）尽量不超过4个。如果超过，尝试提取构造新的方法，或者将方法改造为对象。

6> 除了在循环内用于计数的变量，所有成员的命名必须具有语义（由单词组成），不要出现如
```
int a = 123;
public void cxye() {

}
```
这样的情况。不要怕命名过长，重要的是方便理解！

7> 设计新方法时应该考虑到该方法被调用的范围，不会被外界（其他package）访问的方法不要使用public修饰符，接口方法请使用静态类型

8> 测试方法统一写在test/FunctionTest.java内，要求在每个方法前写注释表明其功能。测试类在后期提交时会被删除