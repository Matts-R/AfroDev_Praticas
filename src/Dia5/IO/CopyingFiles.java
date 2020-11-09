package Dia5.IO;

import java.io.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public abstract class CopyingFiles {

    protected static String FILE_EXTENSION;
    protected String fullPath;
    protected String destinationOfCopy;
    protected String copyName = "(copy)";
    protected FileOutputStream output = null;
    protected FileInputStream input = null;

    protected int bytes = 0;

    protected CopyingFiles(String fullpath) throws FileNotFoundException {
        this.fullPath = fullpath;
        this.destinationOfCopy = fullpath;

        input = new FileInputStream(new File(this.fullPath));
        this.setfileExtension();
    }

    protected abstract void setfileExtension();

    protected String returnNewPath() {
        String[] path = this.fullPath.split("/");
        String fileName = path[path.length - 1];

        fileName = returnNewName(fileName);
        path[path.length - 1] = fileName;

        this.fullPath = Arrays.toString(path)
                .replace(", ", "/")
                .replace("[", "")
                .replace("]", "");

        return this.fullPath;
    }

    protected String returnNewName(String fileName) {
        int index = fileName.indexOf(".");
        StringBuilder builder = new StringBuilder(fileName);
        fileName = builder.replace(index, fileName.length(),
                this.copyName.concat(FILE_EXTENSION)).toString();

        return fileName;
    }

    protected void setDestination() {
        int choice;

        choice = JOptionPane.showConfirmDialog(null, "Você deseja que a cópia seja feita "
                + "em um novo local ? (Caso nenhum caminho seja fornecido a cópia "
                + "será alocada no mesmo diretório da original)");

        if (choice == JOptionPane.YES_OPTION) {
            this.destinationOfCopy = JOptionPane.showInputDialog("Favor informe o novo caminho do arquivo");
            this.destinationOfCopy = this.destinationOfCopy.concat(this.copyName).concat(FILE_EXTENSION);

        } else {
            destinationOfCopy = this.returnNewPath();
        }
    }

    protected void makeCopy() throws IOException {
        this.setDestination();

        output = new FileOutputStream(this.destinationOfCopy);

        while ((this.bytes = this.input.read()) != -1) {
            this.output.write(bytes);
        }

        System.out.println("Arquivo criado com sucesso em: " + destinationOfCopy);
        
        output.close();
        input.close();
    }
}
