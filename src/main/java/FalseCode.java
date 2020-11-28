import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.CharSetUtils;
import java.util.Scanner;

public class FalseCode {
    public static void list(){
        Scanner s = new Scanner(System.in);
        int n;
        String s1,s2,s3;
        System.out.println("请选择功能：");
        System.out.println("1、合并字符串\n");
        System.out.println("2、判断字符串是否相等\n");
        System.out.println("3、计算字符串中包含某字符数\n");
        System.out.println("4、删除字符串中某字符\n");
        n = s.nextInt();
        switch (n){
            case 1:
                System.out.println("请输入要合并的两个字符串(用回车分开)：\n");
                s1=s.nextLine();
                s2=s.nextLine();
                s3=FalseCode.addstring(s1,s2);
                break;
            case 2:
                FalseCode.comparestring();
                break;
            case 3:
                System.out.println("请输入字符串：");
                s1=s.nextLine();
                System.out.println("请输入要计算的字符：");
                s2=s.nextLine();
                n=FalseCode.stringcount(s1,s2);
                break;
            case 4:
                System.out.println("请输入字符串：");
                s1=s.nextLine();
                System.out.println("请输入要删除的字符：");
                s2=s.nextLine();
                FalseCode.deletestring(s1,s2);
                break;
            default:
                System.out.println("无效输入\n");
                break;
        }
    }
    public static String addstring(String s1,String s2){
        String s3;
        s3=StringUtils.join(s1,s2);
        System.out.format("合并后的字符串为%s\n",s3);
        return s3;
    }

    public static void comparestring(){
        Scanner s = new Scanner(System.in);
        String s1,s2;
        boolean n;
        System.out.println("请输入要比较的两个字符串(用回车分开)：\n");
        s1=s.nextLine();
        s2=s.nextLine();
        n=StringUtils.equals(s1,s2);
        if(n==true){
            System.out.println("字符串相等\n");
        }
        else{
            System.out.println("字符串不相等\n");
        }
    }

    public static int stringcount(String s1,String s2){
        int n;
        n=CharSetUtils.count(s1,s2);
        System.out.format("字符串%s中共有%s字符%d个\n",s1,s2,n);
        return n;
    }

    public static String deletestring(String s1,String s2){
        String s3;
        int n;
        n=CharSetUtils.count(s1,s2);
        if(n==0){
            System.out.println("字符串中无此字符\n");
            return s1;
        }
        else{
            s3=CharSetUtils.delete(s1,s2);
            System.out.format("删除字符后的字符串为%s\n",s3);
        }
        return s3;
    }
}
