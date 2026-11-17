package X;

/* loaded from: classes5.dex */
public final class DKZ {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final String A05;
    public final /* synthetic */ DKY A06;

    public DKZ(DKY dky, String str) {
        this.A06 = dky;
        this.A05 = str;
        this.A00 = C79.A01;
        this.A04 = -1L;
        dky.A0D.add(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r5.A01 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.A00
            int r4 = r0.intValue()
            r0 = 3
            java.lang.String r3 = "CACHE"
            java.lang.String r2 = "ttrc_source_for_"
            if (r4 == r0) goto L37
            r0 = 2
            if (r4 == r0) goto L4b
            r0 = 4
            if (r4 == r0) goto L25
            X.DKY r2 = r5.A06
            java.lang.String r1 = "Unexpected call to addSourceAnnotation in state "
            int r4 = 1 - r4
            if (r4 == 0) goto L34
            java.lang.String r0 = "CACHE_AND_NETWORK_PENDING"
        L1e:
            java.lang.String r0 = X.FGI.A0M(r1, r0)
            X.DKY.A04(r2, r0)
        L25:
            X.DKY r2 = r5.A06
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "prefetched_data_for_"
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            r0 = 0
            r2.AQG(r1, r0)
            return
        L34:
            java.lang.String r0 = "CACHE_NOT_APPLICABLE_NETWORK_PENDING"
            goto L1e
        L37:
            boolean r0 = r5.A03
            if (r0 == 0) goto L40
            boolean r0 = r5.A02
            if (r0 != 0) goto L40
            goto L4f
        L40:
            X.DKY r1 = r5.A06
            java.lang.String r0 = r5.A05
            java.lang.String r0 = X.FGI.A0M(r2, r0)
            java.lang.String r3 = "NETWORK"
            goto L57
        L4b:
            boolean r0 = r5.A01
            if (r0 != 0) goto L25
        L4f:
            X.DKY r1 = r5.A06
            java.lang.String r0 = r5.A05
            java.lang.String r0 = X.FGI.A0M(r2, r0)
        L57:
            r1.AQF(r0, r3)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKZ.A00():void");
    }

    public DKZ(DKY dky, String str, long j) {
        this.A06 = dky;
        if (j < 0) {
            DKY.A04(dky, FGI.A0M("Negative Cache Recency Threshold Entered For Query: ", str));
        }
        dky.A0C.add(str);
        dky.AQE(FGI.A0M("recency_threshold_for_", str), j);
        this.A05 = str;
        this.A00 = C79.A00;
        this.A04 = j;
    }
}
