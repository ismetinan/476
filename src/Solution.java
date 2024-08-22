public class Solution {
    public static int findComplement(int num) {
        String numBit = Integer.toBinaryString(num);
        String newNumBit = "";
        for (int i = 0; i < numBit.length(); i++) {
            if (numBit.charAt(i) == '0') {
                newNumBit += "1";
            } else {
                newNumBit += "0";
            }
        }
        return Integer.parseInt(newNumBit,2);

    }
    public static void main(String[] args) {
        System.out.println(findComplement(4));
    }
}