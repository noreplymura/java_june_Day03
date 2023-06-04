import java.util.Scanner;
public class CountVowels{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
char ch[]={'a','e','i','o','u','A','E','I','O','U'};
int count=0;
String str=sc.nextLine();
for(int i=0;i<=ch.length-1;i++){
for(int j=0;j<=str.length()-1;j++){
if(str.charAt(j)==ch[i]){
count++;
}
}
}
System.out.println(count);

}
}