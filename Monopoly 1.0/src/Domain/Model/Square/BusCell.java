package Model.Square;

import Model.GameEngine;
import SettingWindow.MoneyController;
import SettingWindow.PlayerController;
import Model.Cards.SpecialCell;

public class BusCell extends SpecialCell {
    private MoneyController moneyController = MoneyController.getInstance();
    private PlayerController playerController = PlayerController.getInstance();
    private int busFee = 100;
    public BusCell(String name, String type) {
        super(name, type);
    }

    @Override
    public void evaluateSquare(GameEngine gameEngine) {
        moneyController.decreaseMoney(playerController.getCurrentPlayer(),busFee);

    }

}