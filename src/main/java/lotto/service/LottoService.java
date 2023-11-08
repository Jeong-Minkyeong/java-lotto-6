package lotto.service;

import lotto.domain.GenerateLotto;
import lotto.domain.Lotto;

import java.util.List;

public class LottoService {

    private GenerateLotto generatedLotto;
    private Integer bonusLottoNumber;
    private Lotto winningLottoNumber;

    public void createGeneratedLotto(int cost) {
        generatedLotto = new GenerateLotto(cost);
    }

    public void creatWinningNumber(List<Integer> winningNumber) {
        winningLottoNumber = new Lotto(winningNumber);
    }

    public void createBonusNumber(int bonusNumber) {
        bonusLottoNumber = bonusNumber;
    }
    /*
    public  checkWinning() {
        //당첨 결과를 계산하는 로직 ...
    }
    public calculateLottoROI(){

    }
    */
}
