#反射

##定义
> 能够分析类的能力的程序被称为反射
>>+ 在运行时分析类的能力
>>+ 在运行时查看对象，例如，编写一个toString方法供所有类使用
>>+ 实现通用的数组操作代码
>>+ 利用method对象

##class类
>+ 在程序运行期间，Java运行时系统始终为所有的对象维护一个被称为运行时的类型标识
>+ x.getClass().getName() 获得类的名字
>+ Class cl=Class.forName(className) 获得Class对象，className一定要是正确的类名或接口名
>+ Class cl=T.class 获取Class对象
>+ e.getClass().newInsatnce() 可以动态的创建一个类的实例，调用默认构造器

##检查类的结构
> API
>>+ Field[] getField();返回一个类的或其超类的公有域
>>+ Filed[] getDeclaredFields();返回一个类的全部域，如若没有或是基本类型则返回长度零的数组
>>+ Method[] getMethod();返回所有的公有方法，包括继承自超类的。
>>+ Method[] getDeclarMethod();返回所有方法，不包含继承而来的。
>>+ Constructor[] getConstructor();返回公有构造器。
>>+ Constructor[] getDeclaredConstructor();返回所有构造器。
>>+ Class getDeclaringClass();返回一个用于描述类中定义的构造器、方法或域的Class对象
>>+ Class[] getExpectionzTypes() 返回一个描述方法抛出的异常类型的Class对象数组
>>+ int getModifiers() 返回一个描述构造器，方法或域的修饰符整数
    + String toString(int modifiers)
    + boolean isAbstract(int modifiers)   
    + boolean isFinal(int modifiers)
    + boolean isInterface(int modifiers)
    + boolean isNative(int modifiers)
    + boolean isPrivate(int modifiers)
    + boolean isProtected(int modifiers)
    + boolean isPublic(int modifiers)
    + boolean isStatic(int modifiers)
    + boolean isStrict(int modifiers)
    + boolean isSynchronized(int modifiers)
    + boolean isVolatile(int modifiers)

>>+ String getName(); 返回一个描述构造器，方法或域名的字符串
>>+ Class[] getParameterTypes(); 返回描述参数类型的Class对象数组
>>+ Class getReturnType() 返回描述返回类型的Class对象