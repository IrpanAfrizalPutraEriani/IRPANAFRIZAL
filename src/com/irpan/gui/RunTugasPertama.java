package com.irpan.gui;

import javax.swing.*;

public class RunTugasPertama {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FORM KARTU TANDA MAHASISWA");
        jFrame.setContentPane(new TugasPertama().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
