package com.irpan.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TugasPertama {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textProdi;
    private JTextField textFakultas;
    private JTextField textBerlaku;
    private JPanel rootPanel;
    private JButton buttonSave;
    private JLabel LABELHASIL;

    public TugasPertama() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String Nama = textNama.getText();
               String Nim = textNim.getText();
               String Prodi = textProdi.getText();
               String Fakultas = textFakultas.getText();
               String Berlaku = textBerlaku.getText();

               KTM ktm = new KTM();
               ktm.setNAMA(Nama);
               ktm.setNIM(Nim);
               ktm.setPRODI(Prodi);
               ktm.setFAKULTAS(Fakultas);
               ktm.setBERLAKU(Berlaku);

               LABELHASIL.setText(ktm.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
