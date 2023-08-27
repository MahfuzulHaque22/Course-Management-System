/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MAHFUZ TASNIM
 */
public class BAUSTCOURSEMANAGEMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        splash Splash= new splash();
        Splash.setVisible(true);
        Singin Start =new Singin();
        try{
            for(int i =0; i<=100 ; i++){
                Thread.sleep(40);
                Splash.loadingnum.setText(Integer.toString(i)+"%");
                Splash.loadingbar.setValue(i);
                if(i==100){
                    Splash.setVisible(false);
                    Start.setVisible(true);
                }
            }
        }
        catch(Exception e){
            
        }
        // TODO code application logic here
    }
    
}
