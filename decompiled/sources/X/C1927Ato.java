package X;

/* renamed from: X.Ato, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1927Ato implements InterfaceC2158Azo {
    public C0910AHm<C2012AwP> A00;
    public C0910AHm<C2012AwP> A01;

    public static final void A00(C2012AwP c2012AwP, C1927Ato c1927Ato, int i, int i2, int i3) {
        int i4;
        C0910AHm<C2012AwP> c0910AHm = c1927Ato.A01;
        int i5 = c0910AHm.A00;
        if (i5 == 0) {
            i4 = 0;
        } else {
            C2012AwP c2012AwP2 = c0910AHm.A01[i5 - 1];
            i4 = c2012AwP2.A02 - c2012AwP2.A00;
        }
        if (c2012AwP == null) {
            int i6 = i - i4;
            c2012AwP = new C2012AwP();
            c2012AwP.A03 = i;
            c2012AwP.A02 = i2 + i3;
            c2012AwP.A01 = i6;
            c2012AwP.A00 = (i2 - i) + i6;
        } else {
            if (c2012AwP.A03 > i) {
                c2012AwP.A03 = i;
                c2012AwP.A01 = i;
            }
            int i7 = c2012AwP.A02;
            if (i2 > i7) {
                int i8 = i7 - c2012AwP.A00;
                c2012AwP.A02 = i2;
                i7 = i2;
                c2012AwP.A00 = i2 - i8;
            }
            c2012AwP.A02 = i7 + i3;
        }
        c0910AHm.A0G(c2012AwP);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ChangeList(changes=[");
        C0910AHm<C2012AwP> c0910AHm = this.A00;
        C2012AwP[] c2012AwPArr = c0910AHm.A01;
        int i = c0910AHm.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C2012AwP c2012AwP = c2012AwPArr[i2];
            StringBuilder sbA0x2 = C60O.A0x("(");
            sbA0x2.append(c2012AwP.A01);
            sbA0x2.append(',');
            sbA0x2.append(c2012AwP.A00);
            sbA0x2.append(")->(");
            sbA0x2.append(c2012AwP.A03);
            sbA0x2.append(',');
            sbA0x.append(C8j5.A0X(sbA0x2, c2012AwP.A02));
            if (i2 < i - 1) {
                C8j3.A1K(sbA0x);
            }
        }
        return AnonymousClass001.A0v("])", sbA0x);
    }

    public C1927Ato(C1927Ato c1927Ato) {
        C0910AHm<C2012AwP> c0910AHm;
        this.A00 = C0910AHm.A02(new C2012AwP[16], 0);
        this.A01 = C0910AHm.A02(new C2012AwP[16], 0);
        if (c1927Ato == null || (c0910AHm = c1927Ato.A00) == null) {
            return;
        }
        C2012AwP[] c2012AwPArr = c0910AHm.A01;
        int i = c0910AHm.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C2012AwP c2012AwP = c2012AwPArr[i2];
            C0910AHm<C2012AwP> c0910AHm2 = this.A00;
            int i3 = c2012AwP.A03;
            int i4 = c2012AwP.A02;
            int i5 = c2012AwP.A01;
            int i6 = c2012AwP.A00;
            C2012AwP c2012AwP2 = new C2012AwP();
            c2012AwP2.A03 = i3;
            c2012AwP2.A02 = i4;
            c2012AwP2.A01 = i5;
            c2012AwP2.A00 = i6;
            c0910AHm2.A0G(c2012AwP2);
        }
    }

    public C1927Ato() {
        this(null);
    }
}
