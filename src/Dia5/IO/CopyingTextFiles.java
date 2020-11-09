package Dia5.IO;

import java.io.FileNotFoundException;

/**
 *
 * @author matheus
 */
public class CopyingTextFiles extends CopyingFiles {

    public CopyingTextFiles(String fullPath) throws FileNotFoundException {
        super(fullPath);
    }

    @Override
    protected void setfileExtension() {
        FILE_EXTENSION = ".txt";
    }

}
