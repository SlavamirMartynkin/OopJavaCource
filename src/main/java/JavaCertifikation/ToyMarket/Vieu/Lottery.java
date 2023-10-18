package JavaCertifikation.ToyMarket.Vieu;

import JavaCertifikation.ToyMarket.Service.Toy;
import JavaCertifikation.ToyMarket.Service.ToysShop;
import JavaCertifikation.ToyMarket.Service.WinnerWriter;

import java.io.FilterWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Random;

public class Lottery extends ToysShop implements Startable {
    private ArrayList<Toy> winnerToy;
    private ArrayList<Toy> lotteryLots;

    public Lottery(ArrayList<Toy> winnerToy, ArrayList<Toy> lotteryLots) {
        this.winnerToy = winnerToy;
        this.lotteryLots = lotteryLots;
    }

    public ArrayList<Toy> getWinnerToy() {
        return winnerToy;
    }

    @Override
    public void startLottery() throws IOException {
        double fullChance = 0;
        WinnerWriter writer = new WinnerWriter();

        for (Toy toy : lotteryLots) {
            fullChance += toy.getChance();
        }

        Random rnd = new Random();
        double rndNum = rnd.nextDouble() * fullChance;

        Toy winner = null;
        for (Toy toy : lotteryLots) {
            if (rndNum < toy.getChance()) {
                winner = new Toy(toy.getId(), toy.getName(), 1, toy.getChance());
                toy.setQuantity(toy.getQuantity() - 1);
                if (toy.getQuantity() == 0){
                    lotteryLots.remove(toy);
                }
                break;
            }
            rndNum -= toy.getChance();
        }

        if (winner != null && winner.getQuantity() > 0) {
            winnerToy.add(winner);
            writer.winnerWriter(winner.toString());
        }
    }
}
