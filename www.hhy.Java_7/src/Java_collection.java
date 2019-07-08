/**
 * @Information:java�༯���(���ݽṹ-���߳�)
 * ��̬����(��Ԫ�ظ����ﵽ���ֵ��ʱ�򣬶�̬��������)
 * 1.java�༯��������JDK1.2
 * ��̬����:������鶨������
 *
 *Collection�ӿ� �������󱣴����㸸�ӿ�
 *
 *
 * Collection�ӿ��Լ����ӽӿ�
 * ��ÿ�ν������ݲ���ʱ��ֻ�ܶԵ���������д���
 *
 * ���ͱ���������ת�ͣ���jdk1.5������ר��Ϊ�༯���񣬶��༯��1.2����
 * Collection�̳���Iterator�ӿڣ���jdk1.5������Ϊ�˱������ϣ��ڲ�ֻ��һ������
 * Iterator<T>iterator(),ȡ�ü��ϵĵ�����
 *
 * Collection���ṩ�ĺ��ķ���:
 * add,remove,contains,toArray(��˫����������)
 * Collectionֻ�����˴洢���ݵı�׼�������޷����ִ洢���ͣ�Ҳ�޷����������Ƿ��ظ������������������ӽӿ�
 * �����ʵ��������ʹ�������ӽӿ�List(���������ظ�),Set(�����������ظ�)��һ�㲻ֱ��ʹ��Collection�ӿ�
 *
 *
 * 2.List(80%)--���������ظ�
 * �ڽ��е������ϵĴ���ʱ�����ȿ���List�ӿ�
 * ��List�ӿ��У���չ��������Ҫ����(List�ӿڶ���)
 * public E get(int index):���������±�ȥ������
 * public E Set(int index,E element):���������±��������
 * �����޸�ǰ������
 * List�ӿڵ���������:ArrayList(90%),LinkedList,Vector��С�����Զ�ת��
 * ArrayList:add,contains,size,remove(�����±꣬��0��ʼ),get(size-1),  set(size-1,�޸ĺ��ֵ)����ӡ�����
 * ���ص����޸�֮ǰ��ֵ��
 *
 *
 * list�ӿ�Ҫ�뱣���Զ�����Ķ���contains������remove��������������븲дequals()��ʹ��,
 * ��Ϊremove��contains����������Ҫ�õ�equals���Ƚ϶���
 * Ȼ��ϵͳ�����İ�װ��(Integer���)�Ѿ���д��equals�࣬Ҳ���������Զ�����һ�����¸�д
 * list.contains(new Person("name",age)),list.remove(new Person("name",age))
 * ��ô��дequals����:
 *     @Override
 *     public boolean equals(Object obj) {
 *     //Object�ൽ�Զ�������Ҫǿת
 *         if(obj == this){
 *             return true;
 *         }
 *         else if(obj == null){
 *             return false;
 *         }
 *         else if(!(obj instanceof  Class)){
 *             return false;
 *         }
 *         //Object����ת�ͻ�ԭΪPerson�����
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
����ArrayList,Vector,LinkedList������
 ArrayList,Vector������
 1.���ְ汾:
ArrayList(1.2),Vector(1.0),Collection(1.2)��Ҳ����˵Vector���ֵĸ���(�ϰ汾�Ķ�̬���飬��HashTableһ����jdk1.0)
 Vector:elementData,��ִ�й��췽��ʱ���ʼ����СΪ10
 ArrayList�������޲ι���(elementData),��ʼ����СΪ��

 2.��ʼ����������:
 Vector�ڵ����޲ι���ִ�к󽫶��������ʼ��Ϊ10
 ArrayList���������ز��ԣ��ڹ��췽���׶β�����ʼ���������飬�ڵ�һ�����Ԫ�ص�ʱ��ų�ʼ���������飨add������

 3.���ݲ��ԣ�
 ArrayList���ݵ�ʱ���������С��Ϊԭ�����С��1.5��
 Vector���ݵ�ʱ���������С��Ϊԭ�����2��

 4.�̰߳�ȫ��:
 ArrayList�����첽�����̲߳���ȫ��Ч�ʽϸ�
 Vector�����ڷ����ϼ������̰߳�ȫ��Ч�ʽϸߣ�����Ҫʹ���̰߳�ȫ��List��Ҳ��Ҫ��Vector��

 5.����:
 Vector֧�ֽ��ϵĵ�����Enumeration
 ArrayList��֧��



 ArrayList,Vector�Ĺ�ͬ�㣻
 �ײ��ʹ������ʵ��

 ArrayList��LinkedList��
 LinkedList�ײ����˫������ʵ�֣����Բ��������ݣ���ʼ�����⣬����add����û�м�������������ArrayListһ��ͬΪ�첽ʵ��
 ArrayList�ײ��������ʵ��

*/



/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
Set�ӿڣ������������ظ�(Set���ϵı�����map��Set�ӿھ���valueֵ��ͬ��Map����)
Set�ӿ�û�����䷽��

 Set�ӿڳ�������
 HashSet(����洢�������Ͼ���HashMap)������add null��ֻ�ܼ�һ��null 1.�ײ�ʹ�ù�ϣ��+�����. 2.������null������洢

 TreeSet(����洢�����մ�ŵ��Ⱥ󣬱����Ͼ���HashMap):Comparable��Comparator   1.�ײ�ʹ�ú������2.��������null������洢���Զ�����
 Ҫ�뱣�浽TreeSet�У�Ҫôʵ��Comparable�ӿڣ�Ҫô��TreeSet����Ƚ�����Comparator�ӿڣ���

 ��java��Ҫʵ���Զ�����ıȽϣ��ṩ�����������ӿڣ�

 java.lang.Comparable�ӿ�(�ڲ��Ƚ���)java.lang
 ��һ����ʵ����Comparable������ӿڣ��ӿڣ�����ζ�Ÿ���֧������
 ��Ÿ����Collection�����飬����ֱ��ͨ��Collection.sort()����Arrays.sort��������

 ʵ����Comparable�ӿڵ������ֱ�Ӵ����TreeSet����TreeMap��
 public int compareTo(T obj);
 ����ֵ���������:
 1.����:��ǰ�������Ŀ�����
 2.0
 3.����


 Comparator(1.2  java.util)�ⲿ�Ƚ���
 Comparator(�ⲿ����ӿ�):���ÿ���ĳ���Զ������˳������౾��֧������(��û��ʵ��Comparable�ӿ�)
 ���ǿ��Խ���һ�������"�Ƚ���"����������
 �Ƚ���ʵ��Comparator�ӿڼ���

 "�Ƚ���:"ʵ����Comparator�ӿڵ�����Ϊ�Ƚ�����ͨ���ñȽ����������������
 int compare(T o1,T o2)����ֵ��compareTo����ֵ��ȫһ��


Personl��ıȽ���(������������)
class AscAgeComparator implements Comparator<Person>{
@Override
public int compare(Person o1,Person o2){
return o1.getAge - o2.getAge;
   }
}

 psvm:Set<Person> set = new TreeSet<>(new AscAgeComparator())
 set.add(new Person(name,age))



 Comparable��Comparator��ȱȽϷ�ʽ�Ѿ����̶����������
 ʵ����Comparator�ӿڽ��е���������--����ģʽ���˷����������������ɸı�\

 Comparable������ӿڣ���һ����ʵ����Comparable�ӿڣ���ζ�Ÿ���֧��������һ���ڲ��Ƚ���(�Լ�ȥ�ͱ��˱�)
 Comparator�ӿ��ǱȽ����ӿڣ��౾��֧������ר�������ɸ��������ıȽ���(ʵ����Comparator�ӿڵ���)�������������
 ��һ���ⲿ�Ƚ���(����ģʽ)

 �ظ�Ԫ�ص��ж�
 TreeSet��TreeMap����Comparator��Comparable�ӿ��������ظ�Ԫ��

 �Զ�����Ҫ�뱣����TreeSet����TreeMap�У�
 1.Ҫô����ֱ��ʵ��Comparable�ӿڣ���дCompareTo����
 2.Ҫôʵ��һ���Ƚ�������TreeSet����TreeMap�������ⲿ�Ƚ�

 ��HashSet��HashMap���������ȽϽӿڡ���ʱҪ�������Զ���Ԫ���Ƿ��ظ�����Ҫͬʱ��дequals��hashCode�������ж�����Ԫ������
 �Ƿ����

 ��дequals����ԭ��:
 1.�Է���:�����κηǿ�����ֵx,x.equals��x��������true

 2.�Գ��ԣ������κηǿյ�x��y�����ҽ���x.equals��y������true��y.equals(x)
Ҳ����true

 3.������:s�����κηǿյ�x,y,z,���x.equals(y)����true,y.equals(z)����true����true����ôx.equals(z)Ҳ����true

 4.һ����:�����κηǿյ�x��y����x��y������û�иı�,���ε���x.equals(y)ʼ�շ���true����false

 5.�ǿ���:�����κηǿ�����x,x.equals()nullһ������false



 �ȵ���hashCode���������hash�������ŵ�Ͱ
 ����ʹ��equals���Ƚ�Ԫ���Ƿ���ȣ�����ȣ����ٷ���Ԫ��;��equals����false,������ͬͰ֮��ʹ����������Ԫ��������

 Object�ṩ��hashcode����Ĭ��ʹ�ö���ĵ�ַ����hash


 ����������equals��������true�����ǵ�hashcode��ȻҪ���
 �������������������hashcode��ȣ�equals��һ�����

 ���ҽ���equals��hashcode����������true������Ϊ���������������


 ��ϣ������壺
 ΪʲôҪ��Ͱ�����Ԫ�أ�
 Ϊ���Ż����Ҵ���������ͨ��������֮��ͬ�Ĺ�ϣֵ���ڶ�Ӧ��Ͱ�����������������Ҫ��Ԫ��
*/


/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
��������������������Ϊ�˱������϶���
 Iterator��Scannerʵ����Iterator�ӿڣ�Iterator�ĺ��ķ���:
 boolean hasNext();�ж��Ƿ���Ԫ��
 E next();ȡ����һ��Ԫ��

forѭ���������ʣ��Ǹ������϶��е�����

Iterator ֻ�ܴ�ǰ������

����Collection���������Iterator����ȡ�����õĵ�������ʹ�����������ʽ(ֻ��set��list��)
 Iterator<String> iterator = list.iterator();
 while(iterator.hasNext()){System.out.println(iterator.next());}

˫����������ӿ�ListIterator
����hasNext��next������
hasPrevious():�ж��Ƿ�����һ��Ԫ��
previous:ȡ����һ��Ԫ��
 ListIterator<String> iterator = list.listIterator();
while(iterator.hasPrevious()){System.out.println(iterator.previous());}
 Ҫ��ʹ�ôӺ���ǰ����������������ٴ�ǰ������һ�βſ�ʹ��




 Enumerationö�����--Vector��֧��(1.0,���ϰ汾û���༯)
 hasMoreElements();�ж��Ƿ�����һ��Ԫ��
 nextElements();ȡ����һ��Ԫ��


 for-each���(�������඼����)
 �������ڸ��������඼�����˵�����



 List<String> list = new ArrayList<>();
 Collections.addAll��list,"A","B","C"��"D"��;
//modCount = 4,��0��ʼ
 Iterator<IteratorString> iterator = list.iterator();//ȡ�ü��ϵ�����(ȡ�õ�ǰ���ϵĸ���)��expectedModCount = 4
//��ȡ�ü��ϵ�������ʱ��(������list.iterator())��expectedModCount=modCount
 while(iterator.hasNext()){
   String str = iterator.next();//ÿ�ε���������ʱ��  �����checkForComodification()
//�Դ�����鸱���е�expectedModCount�Ƿ���ڼ����е�modCount,Ϊ�˰�ȫ����(��֤�������)
   if(str.equals("B")){
         //list.remove("B"); //modCount +1=5         ConcurrentModificationException
         iterator.remove;
         continue;
   }
}


fail-fast����
ConcurrentModificationException��Collection����ʹ�õ�����������ʱ��ʹ���˼������ṩ���޸ļ������ݷ�������
����ԭ��
final void checkForComodification() {
    if (modCount != expectedModCount)
    throw new ConcurrentModificationException();
}

collection�����е�modCount��ʾ��ǰ�����޸ĵĴ���(remove,add���õ�ʱ��modCount++)
�ڲ���ʹ�õĳ������������ֵ���޸ı�֤�û��������ǵ�ǰ���ϵ�����ֵ�������ᷢ�����
��ȡ�ü��ϵ�������ʱ��(������list.iterator())��expectedModCount=modCount
����֮�����������ǵ�ǰ���ϵ�һ������

����:����ʧ�ܲ��Ա�֤�������û��ڽ��е���������ʱ���õ�������һ�������µ�����(����'���'�Ĳ���)
��ִ��list.remove()��ʱ���ж�Ԫ�ص��±꣬ʹ��fastRemove,��ʱmodCount++�����ٵ���expectedModCount


 �����������Iterator�������ṩ��remove()������ִ˴��󣬱�������removeʱ��modCount���¸�ֵ��expectedModCount



 fail-safe:������ConcurrentModificationException�쳣
 juc�������е��̰߳�ȫ����(CopyOnWriteArrayList)


 �ܽ�:�Ժ��ڵ�����������ʱ�򣬲�Ҫ�޸ļ��ϵ�����
*/


/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
Map����
 Map�ӿ���java�б����Ԫż����(��ֵ��)�����ӿ�

 public interface Map<K,V>
keyֵΨһ��ͨ��һ��keyֵһ�������ҵ�һ��valueֵ

 Map�ӿڵĺ��ķ���

 public  V put(K key,V value):��map��������� ��keyֵ�ظ����ٴ�put��Ϊ��Ӧvalue�ĸ��²���
 public V get(K key):����ָ����keyֵȡ����Ӧ��valueֵ
 ��û�д�keyֵ������null
public Set<Map.Entry<K,V>> entrySet():��Map���ϱ�ΪSet����
Set<Integer> keySet = map.ketSet();
Iterator<Integer> iterator = keySet.iterator();
while(iteratot.hasNext()){
  System.out.println(iterator.next());
}

 public Set(K) keySet() :��������keyֵ���ϣ�key�����ظ�
 public Collection<V> values():��������valueֵ��value�����ظ�


Map�ӿڵ�ʹ��(Map���޵�����),
Map�ӿ��������ĸ���������:
HashMap(ʹ��Ƶ�����)��TreeMap��Hashtable��ConcurrentHashMap


** HashMap --���HashSet

 HashMap(jdk 1.2): 1.�汾��1.2    2.����key��valueΪnull����keyֵ���ҽ���һ��Ϊnull��value������������Ϊnull
3.�첽����Ч�ʲ��ߣ��̲߳���ȫ   4.�ײ��ϣ��+�����(jdk8)

 Hashtable(jdk 1.0)��1.�汾��1.0  2.key��value������Ϊnull��3.synchronized���Σ�ʹ�÷���������Ч�ʵͣ��̰߳�ȫ
4.�ײ��ϣ��


*/

/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:
 * �ȽϽӿ�  -TreeSet,TreeMap
Comparable(�ڲ�����)  int compareTo(Object obj);����ֵΪint��Ĭ����������
 Comparator(�ⲿ����) int compare(Object ob1,Object obj2);����ֵΪint���������

HashSet,HashMap��MapΪ���ӿڣ����κθ��ӿڣ�
 hashCode:���ϣ��
 equals

 equals��ȵ���������hashCodeһ����֤���
 hashCode��ͬ����������equals��һ�����
Collection�б������һ��һ���ľ������Map�������һ��һ����Entry(Map.Entry(key,value))����

 ****Map����ʹ�õ�����(Iterator--ֻ��Collection�ӿ��й�ϵ������Map�ӿ�û��ϵ)���
 * ��ôMap���ʹ�õ����������
 * Set<Map.Entry><K,V>>entrySet():��Map����תΪSet���ϣ�
 *


*/


/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:ջ�����
 * ջ��������
 * ����ջ֡ �������ǩҳ�ĺ���,�༭������
 * ����������:Stack���Ѿ�����(jdk1.0,��Vector�����࣬Ҳ��һ����̬����)
 * Stack��:
 * ��ջ:push()
 * ��ջ:pop() ��ջΪ�յ�ʱ�򣬻��׳�ջΪ�յ��쳣
 * ����ջ��Ԫ�ص�����ջ:peek()
 * size()
 *
 * �Լ�ʵ��һ��htmlʶ����
 * <html>
 *    <head></head>
 *    <body></body>
 * </html>
 *
 *
 *
 * ����FIFO:ѡ���ȳ�
 * ���г���:��Ʊ���Ժ����̣���Ϣ����(kafka)
 *
 * Queue�ӿ� -LinkedList
 * Queue<Integer> queue = new LinkedList<>();
 * �����:add()
 * ������:poll()
 * ���ض���ͷԪ�أ�������:peek()

*/



/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:�������� Collection.sort(��������)  ���Ϸ�ת Collections.reverse(��������)
Stream��(jdk8����):Collection�ӿ�
 ���ķ���:ȡ��Stream��
 Stream<E> Stream()
 ���÷���:forEach:�������

*/

/**
* @Author: HeHaoYuan
* @Date: 2019/7/7
* @Description:HashMapԴ�����
 * ʲôʱ����һ������?ʲôʱ����һ����?
 * Ͱ��Ĭ�ϳ�ʼ������2^4,16��    ���2^30,   Ĭ�ϸ�������Ϊ0.75
 * ��������8ʱ�����ܻ�����
 * �����Ľڵ����ɴ��ڵ���8��Ϊ6ʱ�򣬻������(��Ϊ����)
 * int hash ��Ͱ�ŵ�λ���й�,ÿput���hash����int��ֵ(key==null��ʱ��hashֵΪ0)��
 * ��ֵ����h���ٰ�h�����ƶ�16λ����ֵ��ɺ�λ32λ���������ƶ�16λ��//--��16λΪ0���ٺ�ԭ����ֵ���
 * 0���κ�ֵȡ���Ϊ0�����Ը�16λ����������--//���õ�hash ��intֵ��������Ϊ16
 * ����ֵΪ16*0.75=12
 *
 * hash���㷽��Ϊ��Ͱ�ľ��ȷֲ�
 *
 * ��ͨ��key��value��ֵ���������hashһ��ʱ�򣬾ͻ�ŵ���Ӧ��Ͱ���γ�һ������
 *
 * entrySet �����ǻ������еĽڵ� ���� int size  int modcount �����޸� ,final float loadFactor
 * final���Σ���Ĭ��ֵ����Ϊ0����Ҫͨ�����췽���������г�ʼ��������ֵ����֪��
 * ��ʱhashmapʵ����������ɣ�sizeΪ0����ֵΪ0�� table����Ϊnull�� ��������Ϊ0.75
 * table����Ϊ0��˵��new ���Ͱ��û�д����ã���һ�����Ԫ�ص�ʱ��Żᴴ��Ͱ(put())


*/

import java.util.*;

//Map���ϵĵ�����������Ƚ�Map���ϱ�ΪSet���ϣ���ʹ��Iterator������
public class Java_collection {
 public static void main(String[] args) {
  Map<Integer, String> map = new HashMap<>();
  map.put(1, "����");
  map.put(2, "����");
  map.put(3, "����");
  //���Map����
  //1.Map -> Set
  Set<Map.Entry<Integer, String>> set = map.entrySet();

  //2.ȡ��Set�ӿڵ�����
  Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

  //3.�������
  while (iterator.hasNext()) {
   Map.Entry<Integer, String> entry = iterator.next();
   System.out.println(entry.getKey() + "=" + entry.getValue());
  }


  List<Integer> list = new ArrayList<>();
  Collections.addAll(list,1,3,5,4,7,6,9);

 }
}


