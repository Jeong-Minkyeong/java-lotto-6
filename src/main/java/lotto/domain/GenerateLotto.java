package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateLotto {
    private final Integer cost;
    private List<List> generatedNumbers;

    public GenerateLotto() {
        this.cost = 0;
        this.generatedNumbers = new ArrayList<>();
    }

    public GenerateLotto(Integer cost) {
        this.cost = cost;
        int numOfLotto = cost / 1000;
        for (int i = 0; i < numOfLotto; i++) {
            List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            Collections.sort(randomNumbers);
            generatedNumbers.add(randomNumbers);
        }
        validateMinimumCost(cost);
        validateDivisibilityByThousand(cost);
    }

    private void validateMinimumCost(Integer cost){
        if (cost < 1000 ) {
            throw new IllegalArgumentException("[ERROR] 구매 금액은 최소 1000원 이상이어야 합니다.");
        }
    }

    private void validateDivisibilityByThousand(Integer cost){
        if (cost % 1000 != 0 ) {
            throw new IllegalArgumentException("[ERROR] 구매 금액은 1,000원으로 나누어 떨어져야 합니다.");
        }
    }
}
