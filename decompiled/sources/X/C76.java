package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class C76 {
    public static C76 A08;
    public int A00;
    public WeakReference<Object> A02;
    public final Object A04 = C3cG.A0T();
    public boolean A03 = false;
    public final Object A05 = C3cG.A0T();
    public final WeakHashMap<Object, C3275C7c> A07 = BV4.A11();
    public final List<WeakHashMap<Object, Object>> A06 = C3cG.A0h();
    public C7K A01 = null;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (r0 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #0 {, blocks: (B:25:0x004e, B:27:0x0052, B:29:0x0058, B:31:0x0062, B:33:0x0068, B:42:0x007f, B:44:0x0085, B:45:0x0089, B:46:0x008b, B:48:0x0095, B:49:0x00a6, B:55:0x00c5, B:54:0x00c0, B:41:0x007a, B:14:0x001d, B:16:0x0022, B:18:0x0028, B:20:0x002d, B:22:0x0041, B:24:0x0047), top: B:63:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095 A[Catch: all -> 0x00cc, TryCatch #0 {, blocks: (B:25:0x004e, B:27:0x0052, B:29:0x0058, B:31:0x0062, B:33:0x0068, B:42:0x007f, B:44:0x0085, B:45:0x0089, B:46:0x008b, B:48:0x0095, B:49:0x00a6, B:55:0x00c5, B:54:0x00c0, B:41:0x007a, B:14:0x001d, B:16:0x0022, B:18:0x0028, B:20:0x002d, B:22:0x0041, B:24:0x0047), top: B:63:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0 A[Catch: all -> 0x00cc, TryCatch #0 {, blocks: (B:25:0x004e, B:27:0x0052, B:29:0x0058, B:31:0x0062, B:33:0x0068, B:42:0x007f, B:44:0x0085, B:45:0x0089, B:46:0x008b, B:48:0x0095, B:49:0x00a6, B:55:0x00c5, B:54:0x00c0, B:41:0x007a, B:14:0x001d, B:16:0x0022, B:18:0x0028, B:20:0x002d, B:22:0x0041, B:24:0x0047), top: B:63:0x000a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A01(java.lang.Integer r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.Integer r5 = X.C79.A0Z     // Catch: java.lang.Throwable -> Lce
            r4 = 1
            if (r7 == r5) goto L8
            r6.A03 = r4     // Catch: java.lang.Throwable -> Lce
        L8:
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> Lce
            if (r7 != r0) goto L13
            int r0 = r6.A00     // Catch: java.lang.Throwable -> Lce
            int r0 = r0 + 1
        L10:
            r6.A00 = r0     // Catch: java.lang.Throwable -> Lce
            goto L4e
        L13:
            java.lang.Integer r0 = X.C79.A0W     // Catch: java.lang.Throwable -> Lce
            if (r7 != r0) goto L1b
            int r0 = r6.A00     // Catch: java.lang.Throwable -> Lce
            int r0 = r0 - r4
            goto L10
        L1b:
            if (r7 != r5) goto L4e
            java.lang.ref.WeakReference<java.lang.Object> r0 = r6.A02     // Catch: java.lang.Throwable -> Lcc
            r3 = 0
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lcc
            if (r8 != r0) goto L2c
            r6.A02 = r3     // Catch: java.lang.Throwable -> Lcc
            r2 = 1
            goto L2d
        L2c:
            r2 = 0
        L2d:
            java.util.List<java.util.WeakHashMap<java.lang.Object, java.lang.Object>> r0 = r6.A06     // Catch: java.lang.Throwable -> Lcc
            java.lang.Integer r1 = X.C79.A01     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> Lcc
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0     // Catch: java.lang.Throwable -> Lcc
            r0.remove(r8)     // Catch: java.lang.Throwable -> Lcc
            java.util.WeakHashMap<java.lang.Object, X.C7c> r0 = r6.A07     // Catch: java.lang.Throwable -> Lcc
            r0.remove(r8)     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto Lca
            java.lang.Object r0 = r6.A00(r1, r5, r3)     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto Lca
            java.lang.ref.WeakReference r0 = X.BV4.A0q(r0)     // Catch: java.lang.Throwable -> Lcc
            r6.A02 = r0     // Catch: java.lang.Throwable -> Lcc
            goto Lca
        L4e:
            java.lang.ref.WeakReference<java.lang.Object> r0 = r6.A02     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> Lcc
            if (r1 == 0) goto L7a
            java.util.WeakHashMap<java.lang.Object, X.C7c> r0 = r6.A07     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lcc
            X.C7c r0 = (X.C3275C7c) r0     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L7a
            java.lang.Integer r3 = r0.A00     // Catch: java.lang.Throwable -> Lcc
            boolean r2 = X.AnonymousClass002.A1Z(r1, r8)
            int r1 = r7.compareTo(r3)     // Catch: java.lang.Throwable -> Lcc
            boolean r0 = X.C8j3.A1R(r1)
            if (r2 == 0) goto L77
            if (r0 != 0) goto L8b
            if (r1 == 0) goto L8b
            goto L7f
        L77:
            if (r0 != 0) goto L7a
            goto L8b
        L7a:
            java.lang.ref.WeakReference r0 = X.BV4.A0q(r8)     // Catch: java.lang.Throwable -> Lcc
            goto L89
        L7f:
            java.lang.Object r0 = r6.A00(r3, r7, r8)     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L8b
            java.lang.ref.WeakReference r0 = X.BV4.A0q(r0)     // Catch: java.lang.Throwable -> Lcc
        L89:
            r6.A02 = r0     // Catch: java.lang.Throwable -> Lcc
        L8b:
            java.util.WeakHashMap<java.lang.Object, X.C7c> r3 = r6.A07     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r2 = r3.get(r8)     // Catch: java.lang.Throwable -> Lcc
            X.C7c r2 = (X.C3275C7c) r2     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto La6
            java.util.List<java.util.WeakHashMap<java.lang.Object, java.lang.Object>> r1 = r6.A06     // Catch: java.lang.Throwable -> Lcc
            java.lang.Integer r0 = r2.A00     // Catch: java.lang.Throwable -> Lcc
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lcc
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0     // Catch: java.lang.Throwable -> Lcc
            r0.remove(r8)     // Catch: java.lang.Throwable -> Lcc
        La6:
            java.util.List<java.util.WeakHashMap<java.lang.Object, java.lang.Object>> r1 = r6.A06     // Catch: java.lang.Throwable -> Lcc
            int r0 = r7.intValue()     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> Lcc
            java.util.WeakHashMap r1 = (java.util.WeakHashMap) r1     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r0 = r6.A04     // Catch: java.lang.Throwable -> Lcc
            r1.put(r8, r0)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Integer r0 = X.C79.A0T     // Catch: java.lang.Throwable -> Lcc
            if (r7 != r0) goto Lbe
            if (r2 == 0) goto Lc0
            goto Lc5
        Lbe:
            if (r2 != 0) goto Lc5
        Lc0:
            X.C7c r2 = new X.C7c     // Catch: java.lang.Throwable -> Lcc
            r2.<init>()     // Catch: java.lang.Throwable -> Lcc
        Lc5:
            r2.A00 = r7     // Catch: java.lang.Throwable -> Lcc
            r3.put(r8, r2)     // Catch: java.lang.Throwable -> Lcc
        Lca:
            monitor-exit(r6)
            return
        Lcc:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lce
        Lce:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lce
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76.A01(java.lang.Integer, java.lang.Object):void");
    }

    private Object A00(Integer num, Integer num2, Object obj) {
        List<WeakHashMap<Object, Object>> list = this.A06;
        int iIntValue = num.intValue();
        WeakHashMap<Object, Object> weakHashMap = list.get(iIntValue);
        Object key = null;
        if (weakHashMap.size() > 1) {
            Iterator itA0i = C3cG.A0i(weakHashMap);
            while (itA0i.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0i.next();
                if (entry.getKey() != obj) {
                    return entry.getKey();
                }
            }
            return null;
        }
        int iIntValue2 = num2.intValue();
        int i = iIntValue + 1;
        if (iIntValue2 == i) {
            return null;
        }
        while (i < iIntValue2) {
            Iterator<Map.Entry<Object, Object>> it = list.get(i).entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<Object, Object> next = it.next();
                    if (next.getKey() != obj) {
                        key = next.getKey();
                        if (key != null) {
                            return key;
                        }
                    }
                }
            }
            i++;
        }
        return key;
    }

    public C76() {
        for (Integer num : C79.A00(13)) {
            this.A06.add(num.intValue(), new WeakHashMap<>());
        }
    }
}
