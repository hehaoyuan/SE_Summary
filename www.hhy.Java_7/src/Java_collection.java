/**
 * @Information:java类集框架(数据结构-多线程)
 * 动态数组(当元素个数达到最大值的时候，动态容量增加)
 * 1.java类集产生——JDK1.2
 * 动态数组:解决数组定长问题
 *
 *Collection接口 单个对象保存的最顶层父接口
 *
 *
 * Collection接口以及其子接口
 * 在每次进行数据操作时候只能对单个对象进行处理
 *
 * 泛型避免了向下转型，再jdk1.5产生，专门为类集服务，而类集再1.2产生
 * Collection继承了Iterator接口，在jdk1.5产生，为了遍历集合，内部只有一个方法
 * Iterator<T>iterator(),取得集合的迭代器
 *
 * Collection中提供的核心方法:
 * add,remove,contains,toArray(与双向链表类似)
 * Collection只定义了存储数据的标准，但是无法区分存储类型，也无法区分数据是否，重复，所以派生了两个子接口
 * 因此在实际中往往使用两个子接口List(允许数据重复),Set(不允许数据重复)，一般不直接使用Collection接口
 *
 *
 * 2.List(80%)--允许数据重复
 * 在进行单个集合的处理时候，优先考虑List接口
 * 在List接口中，拓展了两个重要方法(List接口独有)
 * public E get(int index):根据索引下标去的数据
 * public E Set(int index,E element):跟据索引下标更新数据
 * 返回修改前的数据
 * List接口的三大子类:ArrayList(90%),LinkedList,Vector，小向上自动转型
 * ArrayList:add,contains,size,remove(索引下标，从0开始),get(size-1),  set(size-1,修改后的值)但打印结果后
 * 返回的是修改之前的值，
 *
 *
 * list接口要想保存自定义类的对象（contains方法，remove方法），该类必须覆写equals()来使用,
 * 因为remove，contains方法里面需要用到equals来比较对象
 * 然而系统给定的包装类(Integer类等)已经覆写了equals类，也就无需像自定义类一样重新覆写
 * list.contains(new Person("name",age)),list.remove(new Person("name",age))
 * 怎么覆写equals方法:
 *     @Override
 *     public boolean equals(Object obj) {
 *     //Object类到自定义类需要强转
 *         if(obj == this){
 *             return true;
 *         }
 *         else if(obj == null){
 *             return false;
 *         }
 *         else if(!(obj instanceof  Class)){
 *             return false;
 *         }
 *         //Object向下转型还原为Person类对象
 *         Person per = (Person) obj;
 *         return this.age.equals(per.age)&&this.name.equals(per.name);
 *     }
 * @Author: HeHaoYuan
 * @Date: Created at 9:31 on 2019/7/7
 */



/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
区分ArrayList,Vector,LinkedList的区别
 ArrayList,Vector的区别：
 1.出现版本:
ArrayList(1.2),Vector(1.0),Collection(1.2)，也就是说Vector出现的更早(老版本的动态数组，与HashTable一样在jdk1.0)
 Vector:elementData,当执行构造方法时候初始化大小为10
 ArrayList：调用无参构造(elementData),初始化大小为空

 2.初始化策略区别:
 Vector在调用无参构造执行后将对象数组初始化为10
 ArrayList采用懒加载策略，在构造方法阶段并不初始化对象数组，在第一次添加元素的时候才初始化对象数组（add方法）

 3.扩容策略：
 ArrayList扩容的时候，新数组大小变为原数组大小的1.5倍
 Vector扩容的时候，新数组大小变为原数组的2倍

 4.线程安全性:
 ArrayList采用异步处理，线程不安全，效率较高
 Vector采用在方法上加锁，线程安全，效率较高（即便要使用线程安全的List，也不要用Vector）

 5.遍历:
 Vector支持较老的迭代器Enumeration
 ArrayList不支持



 ArrayList,Vector的共同点；
 底层均使用数组实现

 ArrayList，LinkedList：
 LinkedList底层采用双向链表实现，所以不存在扩容，初始化问题，并且add方法没有加锁，所以它和ArrayList一样同为异步实现
 ArrayList底层采用数组实现

*/



/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
Set接口，不允许数据重复(Set集合的本质是map，Set接口就是value值相同的Map集合)
Set接口没有扩充方法

 Set接口常用子类
 HashSet(无序存储，本质上就是HashMap)，允许add null，只能加一个null 1.底层使用哈希表+红黑树. 2.允许存放null，无序存储

 TreeSet(有序存储，按照存放的先后，本质上就是HashMap):Comparable，Comparator   1.底层使用红黑树，2.不允许存放null，有序存储，自定义类
 要想保存到TreeSet中，要么实现Comparable接口，要么向TreeSet传入比较器（Comparator接口）、

 在java中要实现自定义类的比较，提供了以下两个接口：

 java.lang.Comparable接口(内部比较器)java.lang
 若一个类实现了Comparable（排序接口）接口，就意味着该类支持排序
 存放该类的Collection或数组，可以直接通过Collection.sort()或着Arrays.sort进行排序

 实现了Comparable接口的类可以直接存放在TreeSet或者TreeMap中
 public int compareTo(T obj);
 返回值的三种情况:
 1.正数:当前对象大于目标对象
 2.0
 3.符输


 Comparator(1.2  java.util)外部比较器
 Comparator(外部排序接口):若用控制某个自定义类的顺序而该类本身不支持排序(类没有实现Comparable接口)
 我们可以建立一个该类的"比较器"来进行排序
 比较器实现Comparator接口即可

 "比较器:"实现了Comparator接口的类作为比较器，通过该比较器来进行类的排序
 int compare(T o1,T o2)返回值与compareTo返回值完全一样


Personl类的比较器(按照年龄升序)
class AscAgeComparator implements Comparator<Person>{
@Override
public int compare(Person o1,Person o2){
return o1.getAge - o2.getAge;
   }
}

 psvm:Set<Person> set = new TreeSet<>(new AscAgeComparator())
 set.add(new Person(name,age))



 Comparable与Comparator相比比较方式已经个固定，不够灵活
 实现了Comparator接口进行第三方排序--策略模式，此方法更加灵活，可以轻松改变\

 Comparable是排序接口，若一个类实现了Comparable接口，意味着该类支持排序，是一个内部比较器(自己去和别人比)
 Comparator接口是比较器接口，类本身不支持排序，专门由若干个第三方的比较器(实现了Comparator接口的类)来进行类的排序，
 是一个外部比较器(策略模式)

 重复元素的判断
 TreeSet与TreeMap依靠Comparator或Comparable接口来区分重复元素

 自定义类要想保存在TreeSet或者TreeMap中：
 1.要么该类直接实现Comparable接口，覆写CompareTo方法
 2.要么实现一个比较器传入TreeSet或者TreeMap来进行外部比较

 而HashSet与HashMap并不依赖比较接口。此时要想区分自定义元素是否重复，需要同时覆写equals与hashCode方法来判定两个元素内容
 是否相等

 覆写equals方法原则:
 1.自反性:对于任何非空引用值x,x.equals（x）都返回true

 2.对称性：对于任何非空的x，y，当且仅当x.equals（y）返回true，y.equals(x)
也返回true

 3.传递性:s对于任何非空的x,y,z,如果x.equals(y)返回true,y.equals(z)返回true返回true，那么x.equals(z)也返回true

 4.一致性:对于任何非空的x，y，若x与y中属性没有改变,则多次调用x.equals(y)始终返回true或者false

 5.非空性:对于任何非空引用x,x.equals()null一定返回false



 先调用hashCode计算出对象hash码决定存放的桶
 而后使用equals来比较元素是否相等，若相等，则不再放置元素;若equals返回false,则在相同桶之后，使用链表将若干元素链起来

 Object提供的hashcode方法默认使用对象的地址进行hash


 若两个对象equals方法返回true，他们的hashcode必然要相等
 反过来，若两个对象的hashcode相等，equals不一定相等

 当且仅当equals与hashcode方法均返回true，才认为两个对象真正相等


 哈希表的意义：
 为什么要分桶来存放元素？
 为了优化查找次数而存在通过查找与之相同的哈希值，在对应的桶和链表里面查找所需要的元素
*/


/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
集合输出，迭代器输出，为了遍历集合而生
 Iterator，Scanner实现了Iterator接口，Iterator的核心方法:
 boolean hasNext();判断是否还有元素
 E next();取得下一个元素

for循环遍历本质，是各个集合都有迭代器

Iterator 只能从前向后输出

调用Collection集合子类的Iterator方法取得内置的迭代器，使用以下输出格式(只有set和list有)
 Iterator<String> iterator = list.iterator();
 while(iterator.hasNext()){System.out.println(iterator.next());}

双向迭代器·接口ListIterator
除了hasNext与next方法外
hasPrevious():判断是否有上一个元素
previous:取得上一个元素
 ListIterator<String> iterator = list.listIterator();
while(iterator.hasPrevious()){System.out.println(iterator.previous());}
 要想使用从后向前遍历输出，首先至少从前向后遍历一次才可使用




 Enumeration枚举输出--Vector类支持(1.0,古老版本没有类集)
 hasMoreElements();判断是否有下一个元素
 nextElements();取得下一个元素


 for-each输出(所有子类都满足)
 本质在于各个集合类都内置了迭代器



 List<String> list = new ArrayList<>();
 Collections.addAll（list,"A","B","C"，"D"）;
//modCount = 4,从0开始
 Iterator<IteratorString> iterator = list.iterator();//取得集合迭代器(取得当前集合的副本)，expectedModCount = 4
//当取得集合迭代器的时候(及调用list.iterator())，expectedModCount=modCount
 while(iterator.hasNext()){
   String str = iterator.next();//每次调用这句代码时候  会调用checkForComodification()
//以此来检查副本中的expectedModCount是否等于集合中的modCount,为了安全考虑(保证不会脏读)
   if(str.equals("B")){
         //list.remove("B"); //modCount +1=5         ConcurrentModificationException
         iterator.remove;
         continue;
   }
}


fail-fast机制
ConcurrentModificationException，Collection集合使用迭代器遍历的时候，使用了集合类提供的修改集合内容方法报错
产生原因：
final void checkForComodification() {
    if (modCount != expectedModCount)
    throw new ConcurrentModificationException();
}

collection集合中的modCount表示当前集合修改的次数(remove,add调用的时候，modCount++)
在并发使用的场景中如果发生值的修改保证用户独到的是当前集合的最新值，而不会发生脏读
当取得集合迭代器的时候(及调用list.iterator())，expectedModCount=modCount
换言之，迭代器就是当前集合的一个副本

意义:快速失败策略保证了所有用户在进行迭代遍历的时候，拿到的数据一定是最新的数据(避免'脏读'的产生)
当执行list.remove()的时候，判断元素的下标，使用fastRemove,此时modCount++，不再等于expectedModCount


 而如果是有了Iterator迭代器提供的remove()不会出现此错误，本质上在remove时候将modCount重新赋值给expectedModCount



 fail-safe:不产生ConcurrentModificationException异常
 juc包下所有的线程安全集合(CopyOnWriteArrayList)


 总结:以后在迭代器遍历的时候，不要修改集合的内容
*/


/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
Map集合
 Map接口是java中保存二元偶对象(键值对)的最顶层接口

 public interface Map<K,V>
key值唯一，通过一个key值一定可以找到一个value值

 Map接口的核心方法

 public  V put(K key,V value):向map中添加数据 当key值重复，再次put变为相应value的更新操作
 public V get(K key):跟据指定的key值取得相应的value值
 若没有此key值，返回null
public Set<Map.Entry<K,V>> entrySet():将Map集合变为Set集合
Set<Integer> keySet = map.ketSet();
Iterator<Integer> iterator = keySet.iterator();
while(iteratot.hasNext()){
  System.out.println(iterator.next());
}

 public Set(K) keySet() :返回所有key值集合，key不能重复
 public Collection<V> values():返回所有value值，value可以重复


Map接口的使用(Map中无迭代器),
Map接口有如下四个常用子类:
HashMap(使用频率最高)，TreeMap，Hashtable，ConcurrentHashMap


** HashMap --类比HashSet

 HashMap(jdk 1.2): 1.版本号1.2    2.允许key和value为null，且key值有且仅有一个为null，value可以有任意多个为null
3.异步处理，效率不高，线程不安全   4.底层哈希表+红黑树(jdk8)

 Hashtable(jdk 1.0)：1.版本号1.0  2.key与value均不能为null，3.synchronized修饰，使用方法加锁，效率低，线程安全
4.底层哈希表


*/

/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
 * 比较接口  -TreeSet,TreeMap
Comparable(内部排序)  int compareTo(Object obj);返回值为int，默认升序排序
 Comparator(外部排序) int compare(Object ob1,Object obj2);返回值为int，排序灵活

HashSet,HashMap（Map为最顶层接口，无任何父接口）
 hashCode:求哈希码
 equals

 equals相等的两个对象，hashCode一定保证相等
 hashCode相同的两个对象，equals不一定相等
Collection中保存的是一个一个的具体对象，Map保存的是一个一个的Entry(Map.Entry(key,value))对象

 ****Map集合使用迭代器(Iterator--只与Collection接口有关系，而与Map接口没关系)输出
 * 那么Map如何使用迭代器输出？
 * Set<Map.Entry><K,V>>entrySet():将Map集合转为Set集合：
 *


*/


/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:栈与队列
 * 栈：先入后出
 * 函数栈帧 浏览器标签页的后退,编辑器撤销
 * 在面试题中:Stack类已经存在(jdk1.0,是Vector的子类，也是一个动态数组)
 * Stack类:
 * 入栈:push()
 * 出栈:pop() 当栈为空的时候，会抛出栈为空的异常
 * 返回栈顶元素但不出栈:peek()
 * size()
 *
 * 自己实现一个html识别器
 * <html>
 *    <head></head>
 *    <body></body>
 * </html>
 *
 *
 *
 * 队列FIFO:选入先出
 * 队列场景:买票，吃海底捞，消息队列(kafka)
 *
 * Queue接口 -LinkedList
 * Queue<Integer> queue = new LinkedList<>();
 * 入队列:add()
 * 出队列:poll()
 * 返回队列头元素，不出队:peek()

*/



/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:集合排序 Collection.sort(集合名称)  集合反转 Collections.reverse(集合名称)
Stream流(jdk8新增):Collection接口
 核心方法:取得Stream流
 Stream<E> Stream()
 常用方法:forEach:集合输出

*/

/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:HashMap源码解析
 * 什么时候是一个链表?什么时候是一个树?
 * 桶的默认初始化容量2^4,16，    最大2^30,   默认负载因子为0.75
 * 链表长度是8时，可能会树化
 * 当树的节点数由大于等于8变为6时候，会非树化(变为链表)
 * int hash 与桶放的位置有关,每put后会hash出来int的值(key==null的时候hash值为0)，
 * 将值赋给h，再把h向右移动16位，赋值完成后位32位，再向右移动16位，//--高16位为0，再和原来的值异或，
 * 0和任何值取异或为0，所以高16位不参与运算--//，得到hash 的int值，新容量为16
 * 新与值为16*0.75=12
 *
 * hash计算方法为了桶的均匀分布
 *
 * 当通过key与value的值计算出来的hash一样时候，就会放到相应的桶下形成一个链表
 *
 * entrySet 帮我们缓存所有的节点 其中 int size  int modcount 并发修改 ,final float loadFactor
 * final修饰，其默认值并不为0，需要通过构造方法或构造块进行初始化，具体值并不知道
 * 此时hashmap实例化对象完成，size为0，与值为0， table数组为null， 负载因子为0.75
 * table数组为0，说明new 完后桶并没有创建好，第一次添加元素的时候才会创建桶(put())


*/

import java.util.*;

//Map集合的迭代器输出，先将Map集合变为Set集合，再使用Iterator迭代器
public class Java_collection {
 public static void main(String[] args) {
  Map<Integer, String> map = new HashMap<>();
  map.put(1, "张三");
  map.put(2, "李四");
  map.put(3, "王五");
  //输出Map集合
  //1.Map -> Set
  Set<Map.Entry<Integer, String>> set = map.entrySet();

  //2.取得Set接口迭代器
  Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

  //3.迭代输出
  while (iterator.hasNext()) {
   Map.Entry<Integer, String> entry = iterator.next();
   System.out.println(entry.getKey() + "=" + entry.getValue());
  }


  List<Integer> list = new ArrayList<>();
  Collections.addAll(list,1,3,5,4,7,6,9);

 }
}


