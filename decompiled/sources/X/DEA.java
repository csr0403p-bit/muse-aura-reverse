package X;

import android.util.LruCache;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DEA implements InterfaceC5923DsA {
    public final DE9 A00;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    @Override // X.InterfaceC5923DsA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AOB(android.net.Uri r5, java.lang.String r6, java.lang.String r7, long r8, long r10) {
        /*
            r4 = this;
            X.DE9 r4 = r4.A00
            X.DEV r0 = X.DE0.A0G
            r3 = 0
            X.C7384Etj.A0Y(r4, r3)
            java.lang.Object r2 = r4.A00
            X.DEV r2 = (X.DEV) r2
            if (r2 != 0) goto L10
            X.DEV r2 = X.DE0.A0G
        L10:
            r1 = 0
            if (r7 == 0) goto L29
            if (r5 == 0) goto L29
            X.DEC r0 = new X.DEC
            r0.<init>(r5, r7, r3, r3)
            monitor-enter(r2)
            X.C1J r0 = r2.A00(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L26
            goto L25
        L22:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L25:
            r1 = 1
        L26:
            monitor-exit(r2)
            if (r1 != 0) goto L30
        L29:
            X.DE8 r1 = r4.A01(r5, r7)
            r0 = 0
            if (r1 == 0) goto L31
        L30:
            r0 = 1
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEA.AOB(android.net.Uri, java.lang.String, java.lang.String, long, long):boolean");
    }

    @Override // X.InterfaceC5923DsA
    public final void AeC(String str, String str2) {
        DE9 de9 = this.A00;
        if (str == null || str2 == null) {
            AbstractC3426CMt.A02("DashChunkMemoryCache", "Invalid input is given for setPrefetchFormatId");
            return;
        }
        AtomicReference<LruCache<String, DEB>> atomicReference = de9.A02;
        synchronized (atomicReference) {
            LruCache<String, DEB> lruCache = atomicReference.get();
            if (lruCache != null) {
                lruCache.get(str);
            }
        }
    }

    public DEA(DE9 de9) {
        this.A00 = de9;
    }

    @Override // X.InterfaceC5923DsA
    public final /* synthetic */ long AE8(long j, long j2, String str) {
        return -1L;
    }
}
