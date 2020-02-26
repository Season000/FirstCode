//package temp;
//
//public class _2changyongstring {
//}
//
//1.equals方法只比较字符串里面的内容
//
//        String st1=“haha”;
//        String st2=“haha”;
//        st2.equals(st1);//返回的是true类型
////!!! equals除了在Object类中比较内容和首地址
//        在其他类中比较的都是内容
//
//2.charAt方法根据索引返回char类型的字符
//        String s1=“abcd”;
//        s1.charAt(0);//可以得到a这个字母
//        用charAt这个方法基本会用for循环遍历一下
//3.concat方法就是连接字符串
//        String s3=“abc”;
//        s3.concat(“xyz”)
//
//4.contains方法 是否包含某个字符串
//        String s3=“abc”;
//        s3.contains(“ab”)
//        如果包含就返回true 不包含就返回false
//
//5.replace方法用新的字符串来代替旧的字符串
//        String s6=“我爱哈哈”;
//        s6.replace(“哈哈”, “你好”)//哈哈就被你好代替
//
//6.toCharArry就是将字符串转化为字符数组
//        String s8=“abcde”;
//        char[]c=s8.toCharArray();
////通过for循环遍历出来
//        for(int i=0;i<c.length;i++){
//        System.out.println(c[i]);
//        }
//
//7.trim方法 是去掉前后的空格
//        String s10=" a b n ";
//        s10.trim()
//
//8.valueOf将基本数据类型转化为String类型
//        String.valueOf(1.2)
//
//9.toUpperCase toLowerCase换大小写
//        String s9=“acaBBB”;
//        s9.toUpperCase()//全部转化为大写字母
//        s9.toLowerCase()//全部转化为小写字母
//10字符串截取
//        String s7=“今天中午吃什么”;
////截取字符串起始位置
//        System.out.println(s7.substring(2));//输出效果是 中午吃什么
////截取字符串包前不包后
//        System.out.println(s7.substring(2, 4));//输出效果是 中午
//
//11spilt 通过给定字符 拆分字符串
//        String birth=“1999-9-10”;
//        String []str=birth.split("-");
//        for(int i=0;i<str.length;i++){
//        System.out.println(str[i]);
//        }
//        输出效果是
//        1999
//        9
//        10
//
//
//
//
