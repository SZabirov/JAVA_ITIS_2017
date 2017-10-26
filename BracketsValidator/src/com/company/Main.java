package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        String s = "(){[]}}}}}}}}}}}";
        boolean everythingIsCorrect = true;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            String stringBracket = String.valueOf(symbol);
            if (stringBracket.equals("(") ||
                    stringBracket.equals("[") ||
                    stringBracket.equals("{")) {
                stack.push(stringBracket);
            } else {
                //FIXME поменяйте, плиз, название
                String bracket = stack.pop();
                if (bracket.equals("(") & stringBracket.equals(")") ||
                        bracket.equals("[") & stringBracket.equals("]") ||
                        bracket.equals("{") & stringBracket.equals("}")){
                } else {
                    everythingIsCorrect = false;
                }
            }
        }
        //todo проверять также условие, что стек пуст
        if (everythingIsCorrect) {
            System.out.println("Последовательность норм");
        } else {
            System.out.println("WARNING!!! The sequence is NOT correct!");
        }
    }
}
