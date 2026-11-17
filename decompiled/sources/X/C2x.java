package X;

import android.util.Log;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public abstract class C2x implements Closeable {
    public static void A00(C30 c30, File file, InputStream inputStream, byte[] bArr) {
        String str = c30.A01;
        String strA0M = FGI.A0M("extracting DSO ", str);
        if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
            Log.i("fb-UnpackingSoSource", strA0M);
        }
        File fileA0O = C3cG.A0O(file, str);
        try {
            try {
                RandomAccessFile randomAccessFileA0M = BV4.A0M(fileA0O);
                try {
                    int iAvailable = inputStream.available();
                    if (iAvailable > 1) {
                        SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFileA0M.getFD(), iAvailable);
                    }
                    int i = 0;
                    do {
                        int i2 = inputStream.read(bArr, 0, C8j3.A0F(Integer.MAX_VALUE, i, 32768));
                        if (i2 == -1) {
                            break;
                        }
                        randomAccessFileA0M.write(bArr, 0, i2);
                        i += i2;
                    } while (i < Integer.MAX_VALUE);
                    randomAccessFileA0M.setLength(randomAccessFileA0M.getFilePointer());
                    if (!fileA0O.setExecutable(true, false)) {
                        throw BV8.A0j(fileA0O, "cannot make file executable: ");
                    }
                    randomAccessFileA0M.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFileA0M.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                Log.e("fb-UnpackingSoSource", AnonymousClass006.A0y(e, " due to: ", C3cG.A0f(fileA0O, "error extracting dso  ")));
                C2D.A03(fileA0O);
                throw e;
            }
        } finally {
            if (fileA0O.exists() && !fileA0O.setReadOnly()) {
                StringBuilder sbA0f = C3cG.A0f(fileA0O, "Error removing ");
                sbA0f.append(" write permission from directory ");
                sbA0f.append(file);
                sbA0f.append(" (writable: ");
                sbA0f.append(file.canWrite());
                Log.e("SoLoader", AnonymousClass001.A0v(")", sbA0f));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        X.BV4.A1K("Illegal line in compressed metadata: [", r11, "]", "SoLoader");
        r0 = new X.C30[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C30[] A01() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2x.A01():X.C30[]");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ZipFile zipFile;
        if (this instanceof C3207C3i) {
            zipFile = ((C3207C3i) this).A01;
        } else if (!(this instanceof C3Z)) {
            return;
        } else {
            zipFile = ((C3Z) this).A01;
        }
        zipFile.close();
    }
}
