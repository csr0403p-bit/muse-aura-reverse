package X;

import java.io.File;

/* loaded from: classes5.dex */
public abstract class EDB {
    public static boolean A00(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                A00(file2);
            }
        }
        return file.delete();
    }
}
