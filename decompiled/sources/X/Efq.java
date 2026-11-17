package X;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import com.facebook.common.file.FileUtils$FileDeleteException;
import java.io.File;

/* loaded from: classes5.dex */
public abstract class Efq {
    public static void A00(File file) throws FileUtils$CreateDirectoryException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                FileUtils$FileDeleteException fileUtils$FileDeleteException = new FileUtils$FileDeleteException(file.getAbsolutePath());
                FileUtils$CreateDirectoryException fileUtils$CreateDirectoryException = new FileUtils$CreateDirectoryException(absolutePath);
                fileUtils$CreateDirectoryException.initCause(fileUtils$FileDeleteException);
                throw fileUtils$CreateDirectoryException;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new FileUtils$CreateDirectoryException(file.getAbsolutePath());
        }
    }
}
