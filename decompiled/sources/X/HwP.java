package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HwP {
    public static final HwP A01 = new HwP(true);
    public static volatile HwP A02;
    public final Map A00;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x0014, B:14:0x0023, B:13:0x0021, B:15:0x0025), top: B:22:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.HwP A00() {
        /*
            X.GFJ r0 = X.GFJ.A02
            X.HwP r0 = X.HwP.A02
            if (r0 != 0) goto L2a
            java.lang.Class<X.HwP> r3 = X.HwP.class
            monitor-enter(r3)
            X.HwP r0 = X.HwP.A02     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L25
            java.lang.String r2 = "getEmptyRegistry"
            java.lang.Class<?> r0 = X.HxY.A00     // Catch: java.lang.Throwable -> L27
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            X.HwP r0 = (X.HwP) r0     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            if (r0 == 0) goto L21
            goto L23
        L21:
            X.HwP r0 = X.HwP.A01     // Catch: java.lang.Throwable -> L27
        L23:
            X.HwP.A02 = r0     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return r0
        L27:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HwP.A00():X.HwP");
    }

    public HwP() {
        this.A00 = BV4.A0u();
    }

    public HwP(boolean empty) {
        this.A00 = Collections.EMPTY_MAP;
    }
}
