/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defencesystem;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ControlRoom defenceSystemControlRoom =new ControlRoom();
       defenceSystemControlRoom.addObserverToArrayList(new HelicopterWindow());
       defenceSystemControlRoom.addObserverToArrayList(new SubmarineWindow());
       defenceSystemControlRoom.addObserverToArrayList(new TankWindow());
       
       MainControllerWindow mainControllerWindow=new MainControllerWindow(defenceSystemControlRoom);
    }
}
