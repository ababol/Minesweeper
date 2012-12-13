/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler.Listeners;

import Controler.Minesweeper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nono
 */
public class MenuScoreListener implements ActionListener {
    private String gD;

    /**
     *
     * @param gD
     */
    public MenuScoreListener(String gD) {
        this.gD = gD;
    }
    
    /**
     *
     * @return
     */
    public String getGameDifficulty() {
        return this.gD;
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Minesweeper.getInstance().getScores().setAskedScores(this.getGameDifficulty());
        Minesweeper.getInstance().getScores().notifyViews();
    }
}