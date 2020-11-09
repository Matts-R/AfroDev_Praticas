package Dia5.IO;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class Main {
    
    public static void main(String[] args) {
        String fullPath;

        fullPath = JOptionPane.showInputDialog("Favor informe o caminho absoluto do arquivo");
        fullPath.trim();
        String destinationOfCopy = fullPath;

        try {
            CopyingImageFiles ok = new CopyingImageFiles(fullPath);

            ok.makeCopy();
            
        } catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "Erro inesperado, tente novamente");
        }
    }
}
