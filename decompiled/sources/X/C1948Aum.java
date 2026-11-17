package X;

import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.Aum, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1948Aum {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C1934Atx A06;
    public InterfaceC2006AwF A07;
    public InterfaceC1841AsE A08;
    public C1822Arm A09;
    public C2K7 A0A;
    public AXN A0B;
    public EnumC1820Arj A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public long A0I = AbstractC1967AvY.A00;
    public long A04 = C8j3.A0M();
    public long A05 = AYL.A06(0, 0, 0, 0);
    public int A0H = -1;
    public int A0G = -1;

    public static final void A02(C1948Aum c1948Aum) {
        c1948Aum.A07 = null;
        c1948Aum.A08 = null;
        c1948Aum.A0C = null;
        c1948Aum.A0H = -1;
        c1948Aum.A0G = -1;
        c1948Aum.A05 = AYL.A06(0, 0, 0, 0);
        c1948Aum.A04 = C8j3.A0M();
        c1948Aum.A0E = false;
    }

    public static final InterfaceC1841AsE A01(C1948Aum c1948Aum, EnumC1820Arj enumC1820Arj) {
        InterfaceC1841AsE c1833Arx = c1948Aum.A08;
        if (c1833Arx == null || enumC1820Arj != c1948Aum.A0C || c1833Arx.AG7()) {
            c1948Aum.A0C = enumC1820Arj;
            String str = c1948Aum.A0D;
            C1822Arm c1822ArmA01 = AbstractC1823Arn.A01(c1948Aum.A09, enumC1820Arj);
            C0881AGi c0881AGi = C0881AGi.A00;
            AXN axn = c1948Aum.A0B;
            C7384Etj.A0X(axn);
            c1833Arx = new C1833Arx(c1822ArmA01, c1948Aum.A0A, axn, str, c0881AGi, c0881AGi);
        }
        c1948Aum.A08 = c1833Arx;
        return c1833Arx;
    }

    public final int A03(EnumC1820Arj enumC1820Arj, int i) {
        int i2 = this.A0H;
        int i3 = this.A0G;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA05 = AYL.A05(0, i, 0, Integer.MAX_VALUE);
        if (this.A01 > 1) {
            C1822Arm c1822Arm = this.A09;
            C1934Atx c1934Atx = this.A06;
            AXN axn = this.A0B;
            C7384Etj.A0X(axn);
            C1934Atx c1934AtxA00 = C1934Atx.A00(c1934Atx, c1822Arm, this.A0A, axn, enumC1820Arj);
            this.A06 = c1934AtxA00;
            jA05 = c1934AtxA00.A01(jA05, this.A01);
        }
        int iA00 = AbstractC2060AxX.A00(A00(this, enumC1820Arj, jA05).AGD());
        int iA02 = Constraints.A02(jA05);
        if (iA00 < iA02) {
            iA00 = iA02;
        }
        this.A0H = i;
        this.A0G = iA00;
        return iA00;
    }

    public final void A04(AXN axn) {
        long jA0J;
        AXN axn2 = this.A0B;
        if (axn != null) {
            long j = AbstractC1967AvY.A00;
            jA0J = AnonymousClass005.A0J(axn.AEm(), axn.AFo());
        } else {
            jA0J = AbstractC1967AvY.A00;
        }
        if (axn2 == null) {
            this.A0B = axn;
            this.A0I = jA0J;
        } else if (axn == null || this.A0I != jA0J) {
            this.A0B = axn;
            this.A0I = jA0J;
            this.A03 = 1 | (this.A03 << 2);
            A02(this);
        }
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ParagraphLayoutCache(paragraph=");
        sbA0x.append(this.A07 != null ? "<paragraph>" : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append(", lastDensity=");
        long j = this.A0I;
        long j2 = AbstractC1967AvY.A00;
        sbA0x.append((Object) FGI.A0P("InlineDensity(density=", ", fontScale=", ')', AnonymousClass003.A03(j), AnonymousClass004.A00(j)));
        sbA0x.append(", history=");
        sbA0x.append(this.A03);
        return AnonymousClass001.A0v(", constraints=$)", sbA0x);
    }

    public C1948Aum(C1822Arm c1822Arm, C2K7 c2k7, String str, int i, int i2, int i3, boolean z) {
        this.A0D = str;
        this.A09 = c1822Arm;
        this.A0A = c2k7;
        this.A02 = i;
        this.A0F = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    public static final C1957Auw A00(C1948Aum c1948Aum, EnumC1820Arj enumC1820Arj, long j) {
        InterfaceC1841AsE interfaceC1841AsEA01 = A01(c1948Aum, enumC1820Arj);
        boolean z = c1948Aum.A0F;
        long jA00 = AbstractC1976Avh.A00(interfaceC1841AsEA01.AHR(), c1948Aum.A02, j, z);
        boolean z2 = c1948Aum.A0F;
        int i = c1948Aum.A02;
        int i2 = c1948Aum.A00;
        if ((!z2 && (i == 2 || i == 4 || i == 5)) || i2 < 1) {
            i2 = 1;
        }
        return new C1957Auw((C1833Arx) interfaceC1841AsEA01, i2, i, jA00);
    }
}
