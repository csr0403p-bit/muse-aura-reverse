package X;

/* loaded from: classes5.dex */
public final class E3B implements InterfaceC6406E4i {
    public int A00;
    public int A01;
    public int A02;
    public E3J A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC6401E4d A0A;
    public final C6340E1q A09 = new C6340E1q(new byte[10]);
    public int A03 = 0;

    @Override // X.InterfaceC6406E4i
    public final void AcK() {
        this.A03 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A0A.AcK();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0061 -> B:13:0x0032). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC6406E4i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6x(X.E1P r13, int r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3B.A6x(X.E1P, int):void");
    }

    @Override // X.InterfaceC6406E4i
    public final void ANZ(E3J e3j, InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A04 = e3j;
        this.A0A.A84(interfaceC6413E4p, e4i);
    }

    public E3B(InterfaceC6401E4d interfaceC6401E4d) {
        this.A0A = interfaceC6401E4d;
    }

    private boolean A00(E1P e1p, byte[] bArr, int i) {
        int iA04 = e1p.A04();
        int i2 = this.A00;
        int iA0F = C8j3.A0F(i, i2, iA04);
        if (iA0F <= 0) {
            return true;
        }
        if (bArr == null) {
            e1p.A0S(iA0F);
        } else {
            e1p.A0U(bArr, i2, iA0F);
        }
        int i3 = this.A00 + iA0F;
        this.A00 = i3;
        return i3 == i;
    }
}
