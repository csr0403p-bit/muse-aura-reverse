package androidx.glance.session;

/* loaded from: classes4.dex */
public abstract class GlobalSnapshotManagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:21:0x006d, B:22:0x0070, B:24:0x0076, B:18:0x005c, B:26:0x0081, B:17:0x0058), top: B:38:0x0020, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:21:0x006d, B:22:0x0070, B:24:0x0076, B:18:0x005c, B:26:0x0081, B:17:0x0058), top: B:38:0x0020, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.AOY] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.AOY] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006a -> B:22:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.HtJ<? super kotlin.Unit> r11) {
        /*
            r3 = 4
            boolean r0 = r11 instanceof X.C2318BTs
            if (r0 == 0) goto L35
            r10 = r11
            X.BTs r10 = (X.C2318BTs) r10
            int r0 = r10.$t
            if (r0 != r3) goto L35
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r10.A00 = r2
        L17:
            java.lang.Object r9 = r10.A05
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r10.A00
            r7 = 0
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L40
            if (r0 != r6) goto L3b
            java.lang.Object r1 = r10.A04
            X.GCW r1 = (X.GCW) r1
            java.lang.Object r4 = r10.A03
            X.HxV r4 = (X.HxV) r4
            java.lang.Object r3 = r10.A02
            X.AOY r3 = (X.AOY) r3
            java.lang.Object r2 = r10.A01
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            goto L6d
        L35:
            X.BTs r10 = new X.BTs
            r10.<init>(r3, r11)
            goto L17
        L3b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L40:
            X.Hwg.A00(r9)
            X.GCV r4 = new X.GCV
            r4.<init>(r6, r5)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r7)
            r1 = 23
            X.BT9 r0 = new X.BT9
            r0.<init>(r1, r4, r2)
            X.BDp r3 = androidx.compose.runtime.snapshots.Snapshot.A02(r0)
            X.GCW r1 = r4.APO()     // Catch: java.lang.Throwable -> L8a
        L5c:
            r10.A01 = r2     // Catch: java.lang.Throwable -> L8a
            r10.A02 = r3     // Catch: java.lang.Throwable -> L8a
            r10.A03 = r4     // Catch: java.lang.Throwable -> L8a
            r10.A04 = r1     // Catch: java.lang.Throwable -> L8a
            r10.A00 = r6     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r9 = r1.A01(r10)     // Catch: java.lang.Throwable -> L8a
            if (r9 != r8) goto L70
            goto L80
        L6d:
            X.Hwg.A00(r9)     // Catch: java.lang.Throwable -> L8a
        L70:
            boolean r0 = X.AnonymousClass001.A1X(r9)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L81
            r1.A00()     // Catch: java.lang.Throwable -> L8a
            r2.set(r7)     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.snapshots.Snapshot.A05()     // Catch: java.lang.Throwable -> L8a
            goto L5c
        L80:
            return r8
        L81:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8a
            r4.A5w(r5)     // Catch: java.lang.Throwable -> L91
            r3.dispose()
            return r0
        L8a:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8c:
            r0 = move-exception
            X.AbstractC7753FDf.A00(r1, r4)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            r3.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.GlobalSnapshotManagerKt.A00(X.HtJ):java.lang.Object");
    }
}
