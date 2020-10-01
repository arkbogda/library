package pl.ab.library.io.file;

import pl.ab.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);

}
