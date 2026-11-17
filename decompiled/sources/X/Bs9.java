package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Bs9 implements MobileConfigCxxChangeListener {
    public Map A00 = BV4.A0u();

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: all -> 0x0093, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0012, B:8:0x0025, B:9:0x002e, B:10:0x002f, B:13:0x0033, B:14:0x0035, B:15:0x0039, B:17:0x0043, B:19:0x0056, B:20:0x0060, B:22:0x006b, B:24:0x007e, B:27:0x008c, B:26:0x0089), top: B:39:0x0005, outer: #2, inners: #0 }] */
    @Override // com.facebook.mobileconfig.MobileConfigCxxChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onConfigChanged(java.lang.String[] r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)     // Catch: java.lang.Throwable -> L95
            java.util.Map r4 = r5.A00     // Catch: java.lang.Throwable -> L93
            r0 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L93
            boolean r0 = r4.containsKey(r1)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Throwable -> L93
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L93
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r1 = X.BV5.A10(r0)     // Catch: java.lang.Throwable -> L93
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L2f
            r1.next()     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "getListenerV2"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)     // Catch: java.lang.Throwable -> L93
        L2e:
            throw r0     // Catch: java.lang.Throwable -> L93
        L2f:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L91
            r2 = 0
        L33:
            r0 = r6[r2]     // Catch: java.lang.Throwable -> L93
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L88 java.lang.Throwable -> L93
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            boolean r0 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L60
            java.lang.Object r0 = X.BV5.A0f(r4, r1)     // Catch: java.lang.Throwable -> L93
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L93
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r1 = X.BV5.A10(r0)     // Catch: java.lang.Throwable -> L93
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L60
            r1.next()     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "getListenerV2"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)     // Catch: java.lang.Throwable -> L93
            goto L2e
        L60:
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L93
            boolean r0 = r4.containsKey(r1)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Throwable -> L93
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L93
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r1 = X.BV5.A10(r0)     // Catch: java.lang.Throwable -> L93
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8c
            r1.next()     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "getListenerV2"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)     // Catch: java.lang.Throwable -> L93
            goto L2e
        L88:
            r0 = move-exception
            r0.toString()     // Catch: java.lang.Throwable -> L93
        L8c:
            int r2 = r2 + 1
            if (r2 >= r3) goto L91
            goto L33
        L91:
            monitor-exit(r5)
            return
        L93:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L95
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bs9.onConfigChanged(java.lang.String[]):void");
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxChangeListener
    public final /* synthetic */ void onConfigChanged(String[] strArr, String str) {
        onConfigChanged(strArr);
    }
}
