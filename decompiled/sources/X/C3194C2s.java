package X;

import android.app.Application;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.C2s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3194C2s {
    public static final Map<String, C3194C2s> A05 = BV4.A0u();
    public int A00;
    public int A01;
    public File A02;
    public Object A03;
    public String A04;

    public static synchronized C3194C2s A00(String str) {
        C3194C2s c3194C2s;
        Map<String, C3194C2s> map = A05;
        c3194C2s = map.get(str);
        if (c3194C2s == null) {
            c3194C2s = new C3194C2s();
            c3194C2s.A03 = new Object();
            c3194C2s.A04 = str;
            map.put(str, c3194C2s);
        }
        return c3194C2s;
    }

    public final void A01() {
        synchronized (this.A03) {
            CFK.A06(C9Y.TAG, "FixedLengthFiles.forceDeleteAllFiles");
            File[] fileArrListFiles = this.A02.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }
    }

    public final void A02() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long j;
        this.A02.mkdirs();
        File[] fileArrListFiles = this.A02.listFiles();
        int i = this.A00;
        long length = i;
        if (fileArrListFiles != null) {
            length = i - fileArrListFiles.length;
        }
        long jMin = Math.min(C3262C6f.A00() / this.A01, length);
        for (int i2 = 0; i2 < jMin; i2++) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.A02, FGI.A0M(UUID.randomUUID().toString(), "_prop.txt")), "rw");
                long j2 = 0;
                while (true) {
                    try {
                        j = this.A01;
                        if (j2 >= j) {
                            break;
                        }
                        randomAccessFile.seek(j2);
                        randomAccessFile.writeByte(32);
                        j2 += 4096;
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                randomAccessFile.setLength(j);
                randomAccessFile.close();
            } catch (IOException e) {
                C2Q.A00().AT9("AddPoolFiles", e, null);
                CFK.A0A(C9Y.TAG, "Initialization failed.", e);
                return;
            }
        }
    }

    public final void A03(Application application, int i, int i2) {
        synchronized (this.A03) {
            if (this.A02 != null) {
                CFK.A06(C9Y.TAG, "FixedLengthFiles.init() called twice.");
            } else {
                this.A00 = i;
                this.A01 = i2;
                this.A02 = application.getDir(FGI.A0M("file_pool", this.A04), 0);
            }
        }
    }
}
