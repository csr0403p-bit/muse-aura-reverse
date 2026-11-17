package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public abstract class C69 {
    public static char A00(File file) {
        C68 c68;
        RandomAccessFile randomAccessFile;
        if (file.exists()) {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                } finally {
                }
            } catch (IOException e) {
                C2Q.A00().AT9("AppStateNativeParser", e, null);
                CFK.A0A(C9Y.TAG, "Reading AppStateNativeParser failed", e);
            }
            if (randomAccessFile.length() != 0) {
                char c = (char) randomAccessFile.readByte();
                randomAccessFile.close();
                return c;
            }
            randomAccessFile.close();
            c68 = C68.A09;
        } else {
            c68 = C68.A0D;
        }
        return c68.mSymbol;
    }
}
