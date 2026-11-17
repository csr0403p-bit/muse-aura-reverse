package androidx.compose.ui.text.font;

import X.A4D;
import X.B94;
import X.B9B;
import X.BNK;
import X.C0918AHu;
import X.C7523EzA;

/* loaded from: classes4.dex */
public final class AsyncTypefaceCache {
    public final C7523EzA<A4D, B94> A00 = new C7523EzA<>(16);
    public final C0918AHu<A4D, B94> A01 = C0918AHu.A02();
    public final BNK A02 = new BNK();

    public static final void A00(AsyncTypefaceCache asyncTypefaceCache, B9B b9b, Object obj) {
        Object obj2 = null;
        A4D a4d = new A4D(b9b);
        synchronized (asyncTypefaceCache.A02) {
            if (obj == null) {
                asyncTypefaceCache.A01.A0E(a4d, new B94(obj2));
            } else {
                asyncTypefaceCache.A00.A05(a4d, new B94(obj));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.B9B r8, X.HtJ r9, X.G0U r10, boolean r11) {
        /*
            r7 = this;
            r3 = 2
            boolean r0 = r9 instanceof X.C2313BTn
            if (r0 == 0) goto Ld
            r0 = r9
            X.BTn r0 = (X.C2313BTn) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L64
            r6 = r9
            X.BTn r6 = (X.C2313BTn) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r6.A00 = r2
        L1e:
            java.lang.Object r3 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L8f
            boolean r11 = r6.A04
            java.lang.Object r4 = r6.A01
            X.Hwg.A00(r3)
        L30:
            X.BNK r5 = r7.A02
            monitor-enter(r5)
            if (r3 != 0) goto L6a
            goto L74
        L36:
            X.Hwg.A00(r3)
            X.A4D r4 = new X.A4D
            r4.<init>(r8)
            X.BNK r1 = r7.A02
            monitor-enter(r1)
            X.EzA<X.A4D, X.B94> r0 = r7.A00     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = r0.A02(r4)     // Catch: java.lang.Throwable -> L98
            X.B94 r0 = (X.B94) r0     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L53
            X.AHu<X.A4D, X.B94> r0 = r7.A01     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = r0.A05(r4)     // Catch: java.lang.Throwable -> L98
            X.B94 r0 = (X.B94) r0     // Catch: java.lang.Throwable -> L98
        L53:
            if (r0 == 0) goto L56
            goto L94
        L56:
            monitor-exit(r1)
            r6.A01 = r4
            r6.A04 = r11
            r6.A00 = r2
            java.lang.Object r3 = r10.invoke(r6)
            if (r3 != r5) goto L30
            return r5
        L64:
            X.BTn r6 = new X.BTn
            r6.<init>(r7, r9, r3)
            goto L1e
        L6a:
            if (r11 == 0) goto L80
            X.AHu<X.A4D, X.B94> r2 = r7.A01     // Catch: java.lang.Throwable -> L8c
            X.B94 r0 = new X.B94     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8c
            goto L7c
        L74:
            X.AHu<X.A4D, X.B94> r2 = r7.A01     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            X.B94 r0 = new X.B94     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8c
        L7c:
            r2.A0E(r4, r0)     // Catch: java.lang.Throwable -> L8c
            goto L8a
        L80:
            X.EzA<X.A4D, X.B94> r1 = r7.A00     // Catch: java.lang.Throwable -> L8c
            X.B94 r0 = new X.B94     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8c
            r1.A05(r4, r0)     // Catch: java.lang.Throwable -> L8c
        L8a:
            monitor-exit(r5)
            return r3
        L8c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L94:
            java.lang.Object r5 = r0.A00     // Catch: java.lang.Throwable -> L98
            monitor-exit(r1)
            return r5
        L98:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.A01(X.B9B, X.HtJ, X.G0U, boolean):java.lang.Object");
    }
}
