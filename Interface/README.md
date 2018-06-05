#接口

##定义
> 接口是对类一组需求额的描述

> 接口默认为public，不用特意声明，但在实现接口时，一定要声明为public

##特性
>+ 不可以实例化
>+ 可以声明接口变量
>+ 可以被继承
>+ 不可以包含实例域或静态方法，但是可以包含常量(java8 以后可以加入静态方法)
>+ 可以用default添加一个默认实现方法

##二义性
>+ 一个类继承两个不同接口提供的同名方法，需要程序员选择实现某一个。
>+ 一个类从另个一个类和一个接口分别继承了一个同名方法，则只实现类的方法。

##对象的克隆
>+ 确定默认的克隆是否满足要求
>+ 是否可以在可变的子对象上调用clone来修补默认的clone方法
>+ 是否不该使用clone

##ArrayList的一个remove方法
>+ list.removeIf(e ->e==null)

##lambda表达式
>+ object::instanceMethod System.out::println == x-> System.out.println(x)
>+ Class::staticMethod Math::pow == (x,y)->Math.pow(x,y)
>+ Class::instanceMethod String::compareToIgnoreCase == (x,y)->x.compareToIgnoreCase(y)
>+ lambda表达式中捕获的变量必须实际上是最终变量
>+ lambda表达式中不能有同名的局部变量

> lambda的重点是延迟执行，情况如下，除此之外并不需要
>>+ 在一个单独的线程中执行代码
>>+ 多次运行代码
>>+ 在算法适当位置运行
>>+ 发生某种情况时执行代码
>>+ 只有在必要时运行代码

