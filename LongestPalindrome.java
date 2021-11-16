import java.util.*;
public class  LongestPalindrome{
   //找出所有回文解决
   // f(i,i)= true
    // none = true
    // f(i,j) = true
    //
   //找出最长回文解
    
    //将所有回文的长度排序，最大值在末尾处找到
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while(sc.hasNext()){   
            String s = sc.next();
            if(s.equals("quit")){
                
                break;
            }
            System.out.println(getLongestPalindrome(s, s.length()));

        }    
    }
        
     
    
    
    public static int getLongestPalindrome(String A, int n) {
        ArrayList<Integer> list = getAllPalindrome(A, n);
        Collections.sort(list);
        return list.get(list.size() - 1);

    }

    // 判断是否是回文
    public static boolean isPalindrome(String s, int l) {
        if (l == 0 || l == 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(l - 1)) {
            if (l == 2) {
                return true;
            }
            return isPalindrome(s.substring(1, l - 1), l - 2);
        }
        return false;
    }

    // 经判断是回文则将回文长度储存
    public static ArrayList<Integer> getAllPalindrome(String A, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (isPalindrome(A.substring(i, j + 1), j - i + 1)) {
                    list.add(j - i + 1);
                }
            }
        }
        return list;

    }
    
                    
}