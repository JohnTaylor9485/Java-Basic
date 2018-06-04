#继承

##方法覆盖
>在覆盖一个方法时，子类方法可见性不能低于超类方法可见性

##final关键词
>修饰的类不能被继承，final修饰的方法不能被重写

##抽象类
>不能被实例化

##对象的包装器与自动装箱
>两个包装器对象比较时使用equals

>在一个表达式里混合使用Integer 和Double，Integer会自动拆箱提升为double再装箱为double。

##参数数量可变的方法
'''
 public Static int findmax(int... max){
 
 int max=10;
 
 for(int i:max){
 
 if i>max
 
 max=i}
 
 return max;
 }
 '''