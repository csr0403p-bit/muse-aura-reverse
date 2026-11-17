package X;

import com.facebook.systrace.Systrace;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.CCj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3295CCj implements Runnable {
    public static final String __redex_internal_original_name = "AppUnpacker$2";
    public final /* synthetic */ CCi A00;

    public RunnableC3295CCj(CCi cCi) {
        this.A00 = cCi;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Systrace.A04(2147483648L, "AppUnpacker.finishUnpackingOnBackgroundThread()");
        try {
            try {
                CCi cCi = this.A00;
                try {
                    for (AbstractC3297CCr abstractC3297CCr : cCi.A04) {
                        File file = abstractC3297CCr.A00;
                        C1H.A00(file);
                        Systrace.A04(2147483648L, "AppUnpacker.fsync");
                        try {
                            RandomAccessFile randomAccessFileA0L = BV4.A0L(file);
                            try {
                                randomAccessFileA0L.getFD().sync();
                                randomAccessFileA0L.close();
                                Systrace.A03(2147483648L);
                            } catch (Throwable th) {
                                try {
                                    randomAccessFileA0L.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            Systrace.A03(2147483648L);
                            throw th3;
                        }
                    }
                    if (!C3cG.A0O(cCi.A02, ".unpacked").createNewFile()) {
                        throw BV4.A0K("Could not create .unpacked file");
                    }
                } catch (IOException unused) {
                }
                C1Z c1z = cCi.A00;
                C1H.A00(c1z);
                c1z.close();
                cCi.A00 = null;
                CCi.A05.A01();
            } finally {
                Systrace.A03(2147483648L);
            }
        } catch (IOException e) {
            throw BV4.A0e(e);
        }
    }
}
