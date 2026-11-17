package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes5.dex */
public final class CK9 {
    public final Context A00;

    public CK9(Context context) {
        this.A00 = context;
    }

    public static long A00(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jA00 = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jA00 += A00(file2);
        }
        return jA00;
    }
}
