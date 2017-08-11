import java.util.Stack;

class ArabicToRomanConverter {

    String convert(int number) {
        Stack<String> stack = new Stack<>();
        for (int powerOfTen = 1; number != 0; powerOfTen *= 10, number /= 10)
            if (number % 10 != 0) stack.push(ConverterUtils.conversionTable.get((number % 10) * powerOfTen));
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.toString();
    }
}
