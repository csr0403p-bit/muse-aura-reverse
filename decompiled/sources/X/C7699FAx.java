package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.FAx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7699FAx {
    public Map<String, Object> A00 = BV4.A0u();
    public final List<C7701FAz> A01 = C3cG.A0h();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0005, B:11:0x0017, B:12:0x0028, B:14:0x002e, B:17:0x0044, B:19:0x004e, B:20:0x0052, B:22:0x0058, B:23:0x0064, B:25:0x0079, B:26:0x007d, B:27:0x0083, B:8:0x000c), top: B:33:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A01(java.lang.String r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.A00
            if (r8 != 0) goto Lc
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L17
            goto L87
        Lc:
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L89
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L17
            goto L87
        L17:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.A00     // Catch: java.lang.Throwable -> L89
            java.util.HashMap r0 = X.BV4.A0w(r0)     // Catch: java.lang.Throwable -> L89
            r6.A00 = r0     // Catch: java.lang.Throwable -> L89
            r0.put(r7, r8)     // Catch: java.lang.Throwable -> L89
            java.util.List<X.FAz> r0 = r6.A01     // Catch: java.lang.Throwable -> L89
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L89
        L28:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L87
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L89
            X.FAz r1 = (X.C7701FAz) r1     // Catch: java.lang.Throwable -> L89
            java.lang.ref.WeakReference<X.FB4> r0 = r1.A01     // Catch: java.lang.Throwable -> L89
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L89
            X.FB4 r4 = (X.FB4) r4     // Catch: java.lang.Throwable -> L89
            X.FB3 r0 = r1.A00     // Catch: java.lang.Throwable -> L89
            boolean r0 = r0.A00     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L83
            if (r4 == 0) goto L83
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r0 = r1.A02     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L89
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L64
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L89
        L52:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L28
            java.lang.String r2 = X.AnonymousClass005.A0j(r3)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "gs"
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.A00     // Catch: java.lang.Throwable -> L89
            r4.AAj(r0, r8, r1, r2)     // Catch: java.lang.Throwable -> L89
            goto L52
        L64:
            java.lang.String r1 = "gs"
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.A00     // Catch: java.lang.Throwable -> L89
            X.F9b r4 = (X.F9b) r4     // Catch: java.lang.Throwable -> L89
            X.F9k r2 = new X.F9k     // Catch: java.lang.Throwable -> L89
            r2.<init>(r4, r0, r1)     // Catch: java.lang.Throwable -> L89
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L89
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L89
            if (r1 != r0) goto L7d
            r2.run()     // Catch: java.lang.Throwable -> L89
            goto L28
        L7d:
            android.os.Handler r0 = X.F9b.A0U     // Catch: java.lang.Throwable -> L89
            r0.post(r2)     // Catch: java.lang.Throwable -> L89
            goto L28
        L83:
            r5.remove()     // Catch: java.lang.Throwable -> L89
            goto L28
        L87:
            monitor-exit(r6)
            return
        L89:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7699FAx.A01(java.lang.String, java.lang.Object):void");
    }

    public static C7701FAz A00(FB4 fb4, C7699FAx c7699FAx) {
        List<C7701FAz> list = c7699FAx.A01;
        Iterator<C7701FAz> it = list.iterator();
        while (it.hasNext()) {
            C7701FAz next = it.next();
            FB4 fb42 = next.A01.get();
            if (next.A00.A00 || fb42 == null) {
                it.remove();
            } else if (fb42 == fb4) {
                return next;
            }
        }
        C7701FAz c7701FAz = new C7701FAz(fb4);
        list.add(c7701FAz);
        return c7701FAz;
    }
}
