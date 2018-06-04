#反射

##定义
> 能够分析类的能力的程序被称为反射
>>+ 在运行时分析类的能力
>>+ 在运行时查看对象，例如，编写一个toString方法供所有类使用
>>+ 实现通用的数组操作代码
>>+ 利用method对象

##class类
>+ x.getClass().getName() 获得类的名字
>+ Class cl=Class.forName(className) 获得Class对象，className一定要是正确的类名或接口名
>+ Class cl=T.class 获取Class对象
>+ e.getClass().newInsatnce() 可以动态的创建一个类的实例，调用默认构造器

##检查类的结构
