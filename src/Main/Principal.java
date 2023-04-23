/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author 10722126729
 */
public class Principal {
public static void main(String args[]) {
Thread t1 = new Thread(new Operario("chinelo", 100));
Thread t2 = new Thread(new Operario("sandalia", 500));
t1.start();
t2.start();
}
}