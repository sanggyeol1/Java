import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
    }
}



import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.print(str);
        }
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        char tmp;
        
        for(int i = 0; i < a.length(); i++){
            
            tmp = a.charAt(i);
            
            if(65 <= tmp && tmp <= 90){
                output += a.valueOf(tmp).toLowerCase();
            }else if(97 <= tmp && tmp <=122){
                output += a.valueOf(tmp).toUpperCase();
            }else{
                output += (char)tmp;
            }
            
        }
        
        System.out.println(output);
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("!@#$%^&*(\\\'\"<>?:;");
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        
        System.out.println(a + " + " + b + " = " + c );
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println(a+b);
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr;
        
        arr = a.split("");
        
        for(int i = 0; i < a.length(); i++){
            System.out.println(arr[i]);
        }
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2 == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }
}


class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        
        String[] myString = my_string.split(""); //배열 생성     
        String[] ovString = overwrite_string.split("");
        
        
        for(int i = 0; i < overwrite_string.length(); i++){
            myString[s+i] = ovString[i];
        }
        
        
        for(int i = 0; i < my_string.length(); i++){
            System.out.print(myString[i]);
        }
            
        
        String answer = String.join("", myString);
        
       
        return answer;
    }
}
