#内部类

##为什么使用内部类
>+ 可以访问该类定义所在作用域的数据，包括私有类
>+ 内部类可以对同一个包中的其他类隐藏起来
>+ 可以更快捷的定义回调函数

##特殊语法规则
>外围引用：OuterClass.this
>内部对象构造器：outerObject.new InnerClass(construction parameters)
>引用内部类：OuterClass.InnerClass
>内部类声明的所有静态域都必须是final，即不可变，
>内部类不可以有静态方法

##代理

