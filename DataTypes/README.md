#数据类型

##8种基础数据类型
>###4种整型：
>+ int(4)21亿左右
>+ short(2)
>+ long(8)
>+ byte(1)

>###2种浮点数：
>+ float4字节
>+ double8字节
>>* Double.Positive_infinity正无穷大
>>* Double.Negative_infinity负无穷大
>>* Double.NaN表示不是一个数字
>>* if(x==Double.NaN)永远不会为真
>>* if(Double.isNaN(x))判断x是否为数字

>###1种字符类型：char
>* 可能一位，可能两位表示一个字符
>* 字母'A'从U+0041开始
>* 'A'代表一个char字符，而“A”表示一个字符串包含A
>*可以用\u来转义16进制为一个char字符
>> 部分转义对照
>>>+ \b退格
>>>+ \t制表
>>>+ \n换行
>>>+ \r回车
>>>+ \u转义
>>>+ 注释中\u会产生语法错误

>###一种布尔值Boolean


##数值类型的转换
>两个不同类型的操作数
有一个double，都会转成double
否则有一个float，都会转成float
否则有一个long，都会转成long
否则都会转成int
> 合法转换：
>> byte->short->int->long
>> char->int
>> int->float->double
>> long->float->double

>强制转换：
>> double y=6.66;
>> int x=(int) y;