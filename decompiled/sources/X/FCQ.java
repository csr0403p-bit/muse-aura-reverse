package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FCQ<K, V> {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final int A06;
    public int A01 = Integer.MAX_VALUE;
    public final LinkedHashMap<K, V> A07 = new LinkedHashMap<>(0, 0.75f, true);

    public final synchronized Map<K, V> A01() {
        return AbstractC7607F5u.A14(this.A07);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        i = this.A03;
        i2 = this.A04;
        i3 = i2 + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.MAX_VALUE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3 != 0 ? (i * 100) / i3 : 0));
    }

    public final V A00(K k) {
        if (k == null) {
            throw BV4.A0a("key == null");
        }
        synchronized (this) {
            V v = this.A07.get(k);
            if (v != null) {
                this.A03++;
                return v;
            }
            this.A04++;
            return null;
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (TK;TV;)TV; */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:22:0x0033, B:29:0x0061, B:24:0x0039, B:26:0x003f, B:27:0x005f), top: B:45:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L6f
            if (r7 == 0) goto L6f
            monitor-enter(r5)
            int r0 = r5.A05     // Catch: java.lang.Throwable -> L6c
            int r0 = r0 + 1
            r5.A05 = r0     // Catch: java.lang.Throwable -> L6c
            int r0 = r5.A02     // Catch: java.lang.Throwable -> L6c
            int r0 = r0 + 1
            r5.A02 = r0     // Catch: java.lang.Throwable -> L6c
            java.util.LinkedHashMap<K, V> r3 = r5.A07     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r3.put(r6, r7)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L1f
            int r1 = r5.A02     // Catch: java.lang.Throwable -> L6c
            r0 = 1
            int r1 = r1 - r0
            r5.A02 = r1     // Catch: java.lang.Throwable -> L6c
        L1f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            int r4 = r5.A06
            monitor-enter(r5)
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            monitor-enter(r5)
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L66
            if (r0 > r4) goto L2d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L66
            return
        L2d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L66
            r2 = 0
        L2f:
            monitor-enter(r5)
            r0 = 0
            if (r2 < r0) goto L39
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L63
            if (r0 <= r4) goto L61
        L39:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L61
            java.util.Iterator r0 = X.C3cG.A0i(r3)     // Catch: java.lang.Throwable -> L63
            java.util.Map$Entry r1 = X.C3cH.A0l(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r1.getKey()     // Catch: java.lang.Throwable -> L63
            r1.getValue()     // Catch: java.lang.Throwable -> L63
            r3.remove(r0)     // Catch: java.lang.Throwable -> L63
            int r1 = r5.A02     // Catch: java.lang.Throwable -> L63
            r0 = 1
            int r1 = r1 - r0
            r5.A02 = r1     // Catch: java.lang.Throwable -> L63
            int r0 = r5.A00     // Catch: java.lang.Throwable -> L63
            int r0 = r0 + 1
            r5.A00 = r0     // Catch: java.lang.Throwable -> L63
            int r2 = r2 + 1
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L63
            goto L2f
        L61:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L63
            return
        L63:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L63
            throw r0
        L66:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L66
            throw r0
        L69:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            throw r0
        L6c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            throw r0
        L6f:
            java.lang.String r0 = "key == null || value == null"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FCQ.A02(java.lang.Object, java.lang.Object):void");
    }

    public FCQ(int i) {
        this.A06 = i;
    }
}
