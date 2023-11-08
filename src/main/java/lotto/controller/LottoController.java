package lotto.controller;

import lotto.service.LottoService;
import lotto.view.LottoView;
import org.junit.jupiter.api.DisplayNameGenerator;

import java.util.List;
import java.util.Stack;

public class LottoController {
    static int SRANDARD_NUMBER = 1000;
    private final LottoService lottoService;
    private final LottoView lottoView;

    public LottoController(LottoService lottoService, LottoView lottoView) {
        this.lottoService = lottoService;
        this.lottoView = lottoView;
    }

    public void play(){

    }

    public void saveGeneratedLotto(){
        int cost = lottoView.inputCost();
        if (cost < SRANDARD_NUMBER) {
            throw new IllegalArgumentException("[ERROR] 구매 금액은 최소 1,000원 이상이어야 합니다.");
        }
        if (cost % SRANDARD_NUMBER != 0) {
            throw new IllegalArgumentException("[ERROR] 구매 금액은 1,000원으로 나누어 떨어져야 합니다.");
        }
        lottoService.createGeneratedLotto(cost);
    }

    public void saveWinningNumber(List<Integer> winningNumber){
        lottoService.creatWinningNumber(winningNumber);
    }

    public void saveBonusNumber(){
        int bonusNumber = lottoView.inputBonusNumber();
        String winningNumbers = lottoView.inputWinningNumbers();

        if (winningNumbers.contains(Integer.toString(bonusNumber)) || bonusNumber < 1 || bonusNumber > 45) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호가 유효하지 않거나 당첨 번호와 중복됩니다.");
        }
        lottoService.createBonusNumber(bonusNumber);
    }
}
