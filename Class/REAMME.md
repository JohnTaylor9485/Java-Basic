#类

##对象三大特性
>* 行为：操作和方法
>* 状态：施加方法后的回馈
>* 标识：如何区别具有相同行为和状态的两个对象？

##可变数据域
>返回可变数据域的时候的调用.clone()来保证封装

##final实例域：
>* 一旦属性被创建，将不可再修改

##静态域：
>* 静态域属于类，即使没有对象也存在 private static ···

##静态常量：
>* public static final：不可变

##静态方法：
>* 静态方法不能操作对象，没有隐试参数（不可以调用this.），但是可以访问静态域，但是可以通过对象调用静态方法。

##方法参数：
>* 一个方法不能修改一个基本数据类型的参数；一个方法可以改变一个对象参数的状态；一个方法不能让对象参数引用一个新对象

##作用域：
>* public可以被任意类使用；
>* private只能被定义他们的类使用；默认下可以被同一个包下的所有方法使用;
>* protected对本包和所有子类可见