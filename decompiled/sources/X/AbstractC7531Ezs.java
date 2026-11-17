package X;

import java.io.Closeable;

/* renamed from: X.Ezs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7531Ezs {
    public static final void A00(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                CU7.A01(th, th2);
            }
        }
    }
}
