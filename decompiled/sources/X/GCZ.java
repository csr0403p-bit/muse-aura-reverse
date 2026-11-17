package X;

/* loaded from: classes6.dex */
public final /* synthetic */ class GCZ extends C7438Evz implements G0W {
    public static final GCZ A00 = new GCZ();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    @Override // X.G0W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            r7 = r9
            r6 = r10
            X.GCV r7 = (X.GCV) r7
            X.GCa r6 = (X.C9273GCa) r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GCV.A0A
            java.lang.Object r4 = r0.get(r7)
            X.GCY r4 = (X.GCY) r4
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A06
            long r1 = r0.get(r7)
            r0 = 1
            boolean r0 = X.GCV.A0G(r7, r1, r0)
            if (r0 == 0) goto L22
            X.HrH r0 = X.AbstractC9276GCd.A04
            r6.A01 = r0
        L1f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L22:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A05
            long r10 = r0.getAndIncrement(r7)
            int r0 = X.AbstractC9276GCd.A01
            long r2 = (long) r0
            long r0 = r10 / r2
            long r2 = r10 % r2
            int r9 = (int) r2
            long r2 = r4.A00
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L3d
            X.GCY r8 = X.GCV.A06(r7, r4, r0)
            if (r8 != 0) goto L3e
            goto Le
        L3d:
            r8 = r4
        L3e:
            java.lang.Object r1 = X.GCV.A01(r6, r7, r8, r9, r10)
            r4 = r8
            X.HrH r0 = X.AbstractC9276GCd.A0H
            if (r1 != r0) goto L51
            boolean r0 = r6 instanceof X.GCR
            if (r0 == 0) goto L1f
            if (r6 == 0) goto L1f
            r6.AO3(r8, r9)
            goto L1f
        L51:
            X.HrH r0 = X.AbstractC9276GCd.A08
            if (r1 != r0) goto L61
            long r1 = r7.A0H()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto Le
            r8.A01()
            goto Le
        L61:
            X.HrH r0 = X.AbstractC9276GCd.A0I
            if (r1 == r0) goto L6b
            r8.A01()
            r6.A01 = r1
            goto L1f
        L6b:
            java.lang.String r1 = "unexpected"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCZ.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public GCZ() {
        super(3, GCV.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }
}
