package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateLotto {
    static int START_INCLUSIVE = 1;
    static int END_INCLUSIVE = 45;
    static int COUNT = 6;
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
            List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(START_INCLUSIVE, END_INCLUSIVE, COUNT);
            Collections.sort(randomNumbers);
            generatedNumbers.add(randomNumbers);
        }
    }
}
