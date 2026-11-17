package X;

import android.graphics.Path;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BT6 implements Ht9, G0U {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;

    public BT6(InterfaceC1068ATy interfaceC1068ATy, int i, int i2) {
        this.$t = 6;
        this.A02 = interfaceC1068ATy;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                AYU.A05((AYU) obj, (AZE) this.A02, AZF.A01, this.A00, this.A01);
                break;
            case 1:
                ((AYU) obj).A0A((AZE) this.A02, 0.0f, this.A00, this.A01);
                break;
            case 2:
                InterfaceC2036Awq interfaceC2036Awq = (InterfaceC2036Awq) this.A02;
                int i = this.A00;
                int i2 = this.A01;
                C1891AtA c1891AtA = (C1891AtA) obj;
                long jAQ6 = interfaceC2036Awq.AQ6(AbstractC1815ArZ.A00(0, c1891AtA.A05.length()));
                int iA02 = Au3.A02(jAQ6);
                int iA01 = Au3.A01(jAQ6);
                int i3 = iA01;
                if (i < iA02) {
                    i = iA02;
                }
                if (i <= iA01) {
                    iA01 = i;
                }
                if (i2 < iA02) {
                    i2 = iA02;
                }
                if (i2 <= i3) {
                    i3 = i2;
                }
                c1891AtA.A04(interfaceC2036Awq.AQ5(AbstractC1815ArZ.A00(iA01, i3)));
                break;
            case 3:
                int i4 = this.A00;
                int i5 = this.A01;
                InterfaceC2036Awq interfaceC2036Awq2 = (InterfaceC2036Awq) this.A02;
                C1891AtA c1891AtA2 = (C1891AtA) obj;
                if (i4 >= 0 && i5 >= 0) {
                    long jAQ62 = interfaceC2036Awq2.AQ6(c1891AtA2.A00);
                    int iA012 = Au3.A01(jAQ62);
                    int iALz = iA012 + i5;
                    if (((i5 ^ iALz) & (iA012 ^ iALz)) < 0) {
                        iALz = interfaceC2036Awq2.ALz();
                    }
                    long jAQ5 = interfaceC2036Awq2.AQ5(AbstractC1815ArZ.A00(iA012, Math.min(iALz, interfaceC2036Awq2.ALz())));
                    AbstractC1921Ati.A00(c1891AtA2, Au3.A02(jAQ5), Au3.A01(jAQ5));
                    int iA022 = Au3.A02(jAQ62);
                    int i6 = iA022 - i4;
                    if (((i4 ^ iA022) & (iA022 ^ i6)) < 0) {
                        i6 = 0;
                    }
                    long jAQ52 = interfaceC2036Awq2.AQ5(AbstractC1815ArZ.A00(Math.max(0, i6), iA022));
                    AbstractC1921Ati.A00(c1891AtA2, Au3.A02(jAQ52), Au3.A01(jAQ52));
                    break;
                } else {
                    AbstractC1061ATk.A00(FGI.A0Y("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i4, i5));
                    throw F60.createAndThrow();
                }
            case 4:
                int i7 = this.A00;
                int i8 = this.A01;
                InterfaceC2036Awq interfaceC2036Awq3 = (InterfaceC2036Awq) this.A02;
                C1891AtA c1891AtA3 = (C1891AtA) obj;
                if (c1891AtA3.A02 != null) {
                    c1891AtA3.A03();
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i8 < 0) {
                    i8 = 0;
                }
                long jAQ53 = interfaceC2036Awq3.AQ5(AbstractC1815ArZ.A00(i7, i8));
                int iA023 = Au3.A02(jAQ53);
                C1919Atg c1919Atg = c1891AtA3.A05;
                int iA04 = ATD.A04(iA023, 0, c1919Atg.length());
                int iA042 = ATD.A04(Au3.A01(jAQ53), 0, c1919Atg.length());
                if (iA04 != iA042) {
                    if (iA04 >= iA042) {
                        c1891AtA3.A06(null, iA042, iA04);
                        break;
                    } else {
                        c1891AtA3.A06(null, iA04, iA042);
                        break;
                    }
                }
                break;
            case 5:
                int i9 = this.A00;
                ((AYU) obj).A0A((AZE) this.A02, 0.0f, Ab3.A01((i9 - r4.A01) / 2.0f), Ab3.A01((this.A01 - r4.A00) / 2.0f));
                break;
            default:
                InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) this.A02;
                int i10 = this.A00;
                int i11 = this.A01;
                C1960Auz c1960Auz = (C1960Auz) obj;
                InterfaceC2006AwF interfaceC2006AwF = c1960Auz.A06;
                int i12 = c1960Auz.A05;
                int i13 = c1960Auz.A04;
                int iA043 = ATD.A04(i10, i12, i13) - i12;
                int iA044 = ATD.A04(i11, i12, i13) - i12;
                C1957Auw c1957Auw = (C1957Auw) interfaceC2006AwF;
                if (iA043 >= 0 && iA043 <= iA044 && iA044 <= c1957Auw.A03.length()) {
                    Path path = new Path();
                    C1999Aw8 c1999Aw8 = c1957Auw.A01;
                    c1999Aw8.A09.getSelectionPath(iA043, iA044, path);
                    int i14 = c1999Aw8.A07;
                    if (i14 != 0 && !path.isEmpty()) {
                        path.offset(0.0f, i14);
                    }
                    C1710Aot c1710Aot = new C1710Aot(path);
                    c1710Aot.AhM(AnonymousClass007.A0A(0.0f, c1960Auz.A01));
                    interfaceC1068ATy.A3k(c1710Aot, 0L);
                    break;
                } else {
                    throw C60O.A0i(FGI.A0f("start(", ") or end(", ") is out of range [0..", "], or start > end!", iA043, iA044, c1957Auw.A03.length()));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public BT6(InterfaceC2036Awq interfaceC2036Awq, int i, int i2, int i3) {
        this.$t = i3;
        if (2 - i3 != 0) {
            this.A00 = i;
            this.A01 = i2;
            this.A02 = interfaceC2036Awq;
        } else {
            this.A02 = interfaceC2036Awq;
            this.A00 = i;
            this.A01 = i2;
        }
    }

    public BT6(AZE aze, int i, int i2, int i3) {
        this.$t = i3;
        switch (i3) {
            case 0:
            case 1:
                this.A02 = aze;
                this.A00 = i;
                break;
            default:
                this.A00 = i;
                this.A02 = aze;
                break;
        }
        this.A01 = i2;
    }
}
