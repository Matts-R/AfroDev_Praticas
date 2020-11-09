package Dia5.IO;

import java.io.FileNotFoundException;

/**
 *
 * @author matheus
 */
public class CopyingImageFiles extends CopyingFiles{

    public CopyingImageFiles(String fullPath) throws FileNotFoundException {
        super(fullPath);
    }

    
    @Override
    protected void setfileExtension() {
        FILE_EXTENSION = ".png";
    }

}
