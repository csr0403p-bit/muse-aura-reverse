package X;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.C5d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3246C5d {
    public static C3246C5d A03;
    public int A00;
    public C54 A01;
    public boolean A02;

    public static synchronized void A00(C54 c54) {
        if (A03 == null) {
            C3246C5d c3246C5d = new C3246C5d();
            c3246C5d.A00 = 0;
            c3246C5d.A02 = false;
            c3246C5d.A01 = c54;
            A03 = c3246C5d;
        }
    }

    public final int A01() {
        int i;
        File fileA01;
        if (this.A02) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A02) {
                i = this.A00;
            } else {
                this.A02 = true;
                C54 c54 = this.A01;
                if (c54 != null && (fileA01 = c54.A01(c54.A07)) != null) {
                    File fileA0O = C3cG.A0O(fileA01, "critical_suppl_startup_prop.txt");
                    Properties properties = new Properties();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(BV4.A0H(fileA0O));
                        try {
                            properties.load(bufferedInputStream);
                            String property = properties.getProperty("pid");
                            i = property != null ? Integer.parseInt(property) : 0;
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (IOException | RuntimeException e) {
                        C2Q.A00().AT9("PrevSessPrevPID", e, null);
                        CFK.A0A(C9Y.TAG, "Error getting previous process id", e);
                    }
                }
                this.A00 = i;
            }
        }
        return i;
    }
}
