import java.util.Stack;

class ArabicToRomanConverter {

    String convert(int number) {
        if (number < 1 || number > 4999)
            throw new IllegalArgumentException("Number out of limits. It should be within the range [1, 4999]");
        Stack<String> stack = new Stack<>();
        for (int powerOfTen = 1; number != 0; powerOfTen *= 10, number /= 10)
            if (number % 10 != 0) stack.push(ConverterUtils.conversionTable.get((number % 10) * powerOfTen));
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.toString();
    }
}
