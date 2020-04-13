package software2;


//java
//CompareNumbers
//
//##  题目要求
//编写一个程序，让用户输入3个数。首先确认所有数字各不相同，如果存在相同的数，输出"There are same numbers."，否则输出其中最大的数。
//​
//注意：使用英文标点符号，输入的数均为整数。
//
//##  示例
//输出：	Enter the first number:
//输入：	1
//输出：	Enter the second number:
//输入：	51
//输出：	Enter the third number:
//输入：	2
//输出：	The largest number is 51.
public class homework10comparenumbers {
    public static void main(String[] args){
        int firstnumber,secondnumber,thirdnumber,max=0;
        System.out.println("Enter the first number:");
        java.util.Scanner f = new java.util.Scanner(System.in);
        firstnumber = f.nextInt();
        System.out.println("Enter the second number: ");
        java.util.Scanner s = new java.util.Scanner(System.in);
        secondnumber = s.nextInt();
        System.out.println("Enter the third number: ");
        java.util.Scanner t = new java.util.Scanner(System.in);
        thirdnumber = t.nextInt();
        if(thirdnumber==secondnumber||secondnumber==firstnumber||firstnumber==thirdnumber){
            System.out.println("There are same numbers.");
        }
        else{
            if(firstnumber>secondnumber){
                max = firstnumber;
            }
            else{
                max = secondnumber;
            }
            if(thirdnumber>max){
                max = thirdnumber;
            }
            System.out.printf("The largest number is %d.",max);
        }

    }
}
