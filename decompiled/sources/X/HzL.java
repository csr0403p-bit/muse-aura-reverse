package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HzL {
    public static final HzL A01 = new HzL(true);
    public static volatile HzL A02;
    public final Map A00;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x0014, B:14:0x0023, B:13:0x0021, B:15:0x0025), top: B:22:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.HzL A00() {
        /*
            X.GHP r0 = X.GHP.A02
            X.HzL r0 = X.HzL.A02
            if (r0 != 0) goto L2a
            java.lang.Class<X.HzL> r3 = X.HzL.class
            monitor-enter(r3)
            X.HzL r0 = X.HzL.A02     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L25
            java.lang.String r2 = "getEmptyRegistry"
            java.lang.Class<?> r0 = X.AbstractC10619Hzc.A00     // Catch: java.lang.Throwable -> L27
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            X.HzL r0 = (X.HzL) r0     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            if (r0 == 0) goto L21
            goto L23
        L21:
            X.HzL r0 = X.HzL.A01     // Catch: java.lang.Throwable -> L27
        L23:
            X.HzL.A02 = r0     // Catch: java.lang.Throwable -> L27
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
        throw new UnsupportedOperationException("Method not decompiled: X.HzL.A00():X.HzL");
    }

    public HzL() {
        this.A00 = BV4.A0u();
    }

    public HzL(boolean empty) {
        this.A00 = Collections.EMPTY_MAP;
    }
}
