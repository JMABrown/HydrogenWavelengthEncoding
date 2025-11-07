//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Hello and welcome!");

    //for (int i = 1; i <= 5; i++) {
    //    IO.println("i = " + i);
    //}

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your distance to convert to Hydrogen Binary: ");
    var answer = scanner.nextLine();
    scanner.close();

    answer = CleanInput(answer);
    System.out.println("Input cleaned: " + answer);

    var unit = answer.charAt(answer.length() - 1);
    answer = answer.substring(0, answer.length() - 1);
    var answerNumeric = Double.parseDouble(answer);

    var unitStr = Character.toString(unit);
    NotationConverter converter = new NotationConverter();
    var mulFactor = converter.GetMulFactor(unitStr);

    var realValue = answerNumeric * mulFactor;
    System.out.println("Input as value in meters: " + realValue);

    BinaryConverter binaryConverter = new BinaryConverter();
    var result = binaryConverter.ConvertForValue(realValue);
    System.out.println("Value as binary: " + result);
}

public String CleanInput(String input) {

    // Strip whitespace
    input = input.replace(" ", "");
    input = input.replace("\n", "");
    input = input.replace("\t", "");

    // Strip comas
    input = input.replace(",", "");

    // Strip the 'm' unit for meters
    var lastChar = input.charAt(input.length() - 1);
    if (lastChar != 'm') {

    }
    input = input.substring(0, input.length() - 1);

    return input;
}
