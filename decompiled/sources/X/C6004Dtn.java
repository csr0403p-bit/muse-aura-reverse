package X;

/* renamed from: X.Dtn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6004Dtn extends AbstractC6008Dtr {
    public C6003Dtm A00;
    public C6007Dtq A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final E6B A05;
    public final C5998Dth A06;
    public final boolean A07;

    @Override // X.AbstractC6010Dtt, X.AbstractC6011Dtu
    public final void A0B() {
        this.A04 = false;
        this.A03 = false;
        super.A0B();
    }

    @Override // X.AbstractC6010Dtt, X.InterfaceC6009Dts
    public final void AQS() {
    }

    @Override // X.InterfaceC6009Dts
    public final void AaI(InterfaceC6006Dtp interfaceC6006Dtp) {
        C6003Dtm c6003Dtm = (C6003Dtm) interfaceC6006Dtp;
        if (c6003Dtm.A02 != null) {
            InterfaceC6009Dts interfaceC6009Dts = c6003Dtm.A03;
            interfaceC6009Dts.getClass();
            interfaceC6009Dts.AaI(c6003Dtm.A02);
        }
        if (interfaceC6006Dtp == this.A00) {
            this.A00 = null;
        }
    }

    public static void A00(C6004Dtn c6004Dtn, long j) {
        C6003Dtm c6003Dtm = c6004Dtn.A00;
        int iA06 = c6004Dtn.A01.A06(c6003Dtm.A05.A04);
        if (iA06 != -1) {
            long j2 = c6004Dtn.A01.A0D(c6004Dtn.A05, iA06, false).A01;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = BV5.A07(j2 - 1);
            }
            c6003Dtm.A00 = j;
        }
    }

    @Override // X.InterfaceC6009Dts
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C6003Dtm A7x(Dy6 dy6, InterfaceC5538DkF interfaceC5538DkF, long j) {
        C6003Dtm c6003Dtm = new C6003Dtm(dy6, interfaceC5538DkF, j);
        InterfaceC6009Dts interfaceC6009Dts = ((AbstractC6008Dtr) this).A00;
        C1G.A08(AnonymousClass002.A1Y(c6003Dtm.A03));
        c6003Dtm.A03 = interfaceC6009Dts;
        if (this.A04) {
            Object obj = dy6.A04;
            C6007Dtq c6007Dtq = this.A01;
            Object obj2 = C6007Dtq.A02;
            if (c6007Dtq.A00 != null && obj.equals(C6007Dtq.A02)) {
                obj = this.A01.A00;
            }
            c6003Dtm.A00(dy6.A01(obj));
        } else {
            this.A00 = c6003Dtm;
            if (!this.A03) {
                this.A03 = true;
                A0D(interfaceC6009Dts, null);
                return c6003Dtm;
            }
        }
        return c6003Dtm;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6004Dtn(X.InterfaceC6009Dts r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>(r5)
            r3 = 1
            if (r6 == 0) goto Ld
            boolean r1 = r5.AP2()
            r0 = 1
            if (r1 != 0) goto Le
        Ld:
            r0 = 0
        Le:
            r4.A07 = r0
            X.Dth r0 = new X.Dth
            r0.<init>()
            r4.A06 = r0
            X.E6B r0 = new X.E6B
            r0.<init>()
            r4.A05 = r0
            androidx.media3.common.Timeline r2 = r5.AGS()
            if (r2 == 0) goto L2f
            r1 = 0
            X.Dtq r0 = new X.Dtq
            r0.<init>(r2, r1, r1)
            r4.A01 = r0
            r4.A02 = r3
            return
        L2f:
            X.Dnm r1 = r5.AHb()
            java.lang.Object r0 = X.C6007Dtq.A02
            X.Dty r3 = new X.Dty
            r3.<init>(r1)
            java.lang.Object r2 = X.C5998Dth.A0G
            java.lang.Object r1 = X.C6007Dtq.A02
            X.Dtq r0 = new X.Dtq
            r0.<init>(r3, r2, r1)
            r4.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6004Dtn.<init>(X.Dts, boolean):void");
    }
}
