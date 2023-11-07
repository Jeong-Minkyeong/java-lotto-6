package lotto.controller;

import lotto.service.LottoService;
import lotto.view.LottoView;

import java.util.List;

public class LottoController {
    private final LottoService lottoService;
    private final LottoView lottoView;

    public LottoController(LottoService lottoService, LottoView lottoView) {
        this.lottoService = lottoService;
        this.lottoView = lottoView;
    }

    public void play(){

    }

    public void saveGeneratedLotto(int cost){
        lottoService.createGeneratedLotto(cost);
    }

    public void saveWinningNumber(List<Integer> winningNumber){
        lottoService.creatWinningNumber(winningNumber);
    }

    public void saveBonusNumber(int bonusNumber){
        lottoService.createBonusNumber(bonusNumber);
    }
}
