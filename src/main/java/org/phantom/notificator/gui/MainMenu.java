package org.phantom.notificator.gui;

import org.phantom.notificator.mappers.CarMapper;
import org.phantom.notificator.mappers.CarOwnerMapper;
import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mihne_000 on 6/29/2015.
 */
public class MainMenu extends JFrame{
    private JButton addCarButton;
    private JPanel panel1;
    private JButton viewCarsButton;
    private JButton modifyCarButton;
    private CarOwnerMapper carOwnerMapper;
    private CarMapper carMapper;
    public MainMenu( CarMapper carMapper, CarOwnerMapper carOwnerMapper)  {
        super("Main Menu");
        this.carMapper=carMapper;
        this.carOwnerMapper=carOwnerMapper;
        add(panel1);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewCarsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewCars(carMapper,carOwnerMapper);
                setVisible(false);

            }
        });
        addCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCar(carMapper,carOwnerMapper);
                setVisible(false);
            }
        });
        modifyCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SelectCars(carMapper,carOwnerMapper);
                setVisible(false);
            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
        panel1=new JPanel();
        panel1.setPreferredSize(new Dimension(500, 250));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        setSize(width/2, height/2);

    }
}
