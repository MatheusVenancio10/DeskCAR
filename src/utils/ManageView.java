package utils;

import javax.swing.JOptionPane;
import view.ChoiceScreen;
import view.AdministratorScreen;

public class ManageView {
    
    private String password = "123";
    AdministratorScreen adm = new AdministratorScreen();
    ChoiceScreen choice;
    
    public void administrator(){
        String confirmPassword = JOptionPane.showInputDialog(null, "Senha da administração: ");
        if(password.equals(confirmPassword)){
            adm.setVisible(true);
        } else {
            choice = new ChoiceScreen();
            choice.setVisible(true);
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }
    
}
