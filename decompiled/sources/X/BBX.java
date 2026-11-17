package X;

/* loaded from: classes4.dex */
public final class BBX extends AN8 {
    public static final Object A05 = C3cG.A0T();
    public int A00;
    public int A01;
    public long A02;
    public Ae9<BDs> A03;
    public Object A04;

    @Override // X.AN8
    public final AN8 A02(long j) {
        BBX bbx = new BBX();
        ((AN8) bbx).A00 = j;
        bbx.A03 = AbstractC1189Ads.A00;
        bbx.A04 = A05;
        return bbx;
    }

    @Override // X.AN8
    public final void A03(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        BBX bbx = (BBX) an8;
        this.A03 = bbx.A03;
        this.A04 = bbx.A04;
        this.A00 = bbx.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[PHI: r17
  0x00c8: PHI (r17v11 int) = (r17v10 int), (r17v12 int) binds: [B:31:0x009e, B:38:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.AN8] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.AN8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.BBX] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A04(androidx.compose.runtime.snapshots.Snapshot r33) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBX.A04(androidx.compose.runtime.snapshots.Snapshot):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(androidx.compose.runtime.snapshots.Snapshot r8) {
        /*
            r7 = this;
            java.lang.Object r6 = X.BDh.A08
            monitor-enter(r6)
            long r4 = r7.A02     // Catch: java.lang.Throwable -> L3b
            long r1 = r8.A09()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L17
            int r1 = r7.A01     // Catch: java.lang.Throwable -> L3b
            int r0 = r8.A08()     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r1 == r0) goto L18
        L17:
            r2 = 1
        L18:
            monitor-exit(r6)
            java.lang.Object r1 = r7.A04
            java.lang.Object r0 = X.BBX.A05
            if (r1 == r0) goto L3a
            if (r2 == 0) goto L29
            int r1 = r7.A00
            int r0 = r7.A04(r8)
            if (r1 != r0) goto L3a
        L29:
            r3 = 1
            if (r2 == 0) goto L3a
            monitor-enter(r6)
            long r0 = r8.A09()     // Catch: java.lang.Throwable -> L3b
            r7.A02 = r0     // Catch: java.lang.Throwable -> L3b
            int r0 = r8.A08()     // Catch: java.lang.Throwable -> L3b
            r7.A01 = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r6)
        L3a:
            return r3
        L3b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBX.A05(androidx.compose.runtime.snapshots.Snapshot):boolean");
    }
}
