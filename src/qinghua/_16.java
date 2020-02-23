package qinghua;
//数组的使用    数组的声明，数组的创建，数组元素的初始化，使用数组
public class _16 {
    public static void main(String[] args) {
        int[] intArray;
        String stringArray;//两种申明的方式

        intArray = new int[10];//数组的创建
        String[] stringArray2 = new String[20];//数组的申明+创建

        int a[]={22,33,44,55};//申明+初始化
//        创建时候未赋值的，被赋予默认初始值
//        基本数据类型数据默认值为0；
//        boolean类型数据默认值为false；
//        引用类型元素默认值为null；

        //使用数组：arrayName[index]
        //下标必须是int,short,byte,char
        //元素个数即数组长度，通过arrayName.length得到
        
        
//        数组名是一个引用：
        int [] arraytemp1 = {1,2,3,4,5};
        int [] arraytemp2;
        for (int i = 0; i < arraytemp1.length; i++) {
            System.out.print(arraytemp1[i]);
            arraytemp1[i]++;
        }
        System.out.println();
        arraytemp2 = arraytemp1;
        for (int i = 0; i < arraytemp2.length; i++) {
            System.out.print(arraytemp2[i]);
        }

        System.out.println();
        char[] copyFrom = {'a' ,'b' ,'c' ,'d' ,'e'};
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom,2,copyTo,1,2);
        System.out.println(new String(copyTo));

        //多维数组
        int[][] gradeTable;//申明

        int[][] gradeTable1 = new int[3][13];
        int p = 1;
        for (int i = 0; i < gradeTable1.length; i++) {
            for (int i1 = 0; i1 < gradeTable1[i].length; i1++) {
                gradeTable1[i][i1] = p;
                p++;
                System.out.printf("%3d",gradeTable1[i][i1]);
            }
            System.out.println();
        }

        int[][] gradeTable2 = {
                {1,2,3,4,5},
                {1,2,3},
                {1,2,3,4,5,6,7,8,9}
        };
        for (int i = 0; i < gradeTable2.length; i++) {
            System.out.printf("第%d行的长度为:%d",i+1,gradeTable2[i].length);
            System.out.println();
        }

    }
}


