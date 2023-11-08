package lotto.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.List;

public class LottoView {
    public int inputCost() {
        System.out.println("구매 금액을 입력해주세요:");
        int cost = Integer.parseInt(readLine());
        return cost;
    }

    public String inputWinningNumbers() {
      System.out.println("당첨 번호를 입력해 주세요:");
      String inputNumber = readLine();
      return inputNumber;
    }

    public int inputBonusNumber() {
        System.out.println("보너스 번호를 입력해주세요:");
        int bonusNumber = Integer.parseInt(readLine());
        return bonusNumber;
    }
}
    /*
    private List<Integer> parseNumbersFromString(String numbersString) {
        String[] numberStrings = numbersString.split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String numberString : numberStrings) {
            int number = Integer.parseInt(numberString);
            if (number < 1 || number > 45) {
                throw new IllegalArgumentException("로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
            numbers.add(number);
        }
        if (numbers.size() != 6 || new HashSet<>(numbers).size() != 6) {
            throw new IllegalArgumentException("로또 번호는 정확히 6개의 서로 다른 숫자여야 합니다.");
        }
        return numbers;
    }
    */


