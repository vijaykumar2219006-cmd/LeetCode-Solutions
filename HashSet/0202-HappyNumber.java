import java.util.HashSet;
public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();
        while(n!=1){
            int sum=0;
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            while(n>0){
                int digit=n%10;
                sum=sum+(digit*digit);
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
}
    
