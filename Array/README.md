数字数组所有元素默认为0
布尔数组所有元素默认为false
数组长度为0不代表其为null
Arrays.fill(type[]a, type v)将数组左右元素负值为v
Arrays.equals(type[]a, type[]b)判断a和b是否相等
Arrays.binarySearch(type[] a, int start, int end, type v)
用二分法在范围内查找v,没有则返回负值，-r-1是v插入后可以使a保持有序的位置
double temp=double[i];
double[i]=double[i+1];
double[i+1]=temp;
用上述方法可以交换double数组中的任意两行
