package Special;

public class MultiplyStringNumbers {

    public static void main(String[] args) {
        // Result should be 80779853376
        String first = "123456";
        String second = "654321";
        
        MultiplyStringNumbers msn = new MultiplyStringNumbers();
        String result = msn.multiply(first, second);
        System.out.println(result);
        if("80779853376".equals(result)) {
            System.out.print("*****PASSED*****");
        } else {
            System.out.print("*****FAILED*****");
        }
    }

    public String multiply(String first,String second) {
        int[] val = new int[first.length() + second.length()];
        for(int i = second.length() - 1; i >= 0; i--) {
            for(int j = first.length() - 1; j >=0; j--) {
                int mul = (first.charAt(j) - '0') * (second.charAt(i) - '0');
                int sum = val[i + j + 1] + mul;
                val[i+j+1] = sum % 10;
                val[i+j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int x : val) {
            if(sb.length() == 0 && x == 0) {
                continue;
            }
            sb.append(x);
        }
        return sb.toString();
    }
    
}
