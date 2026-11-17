package X;

import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.List;

/* renamed from: X.Aui, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1944Aui {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C1934Atx A07;
    public ApQ A08;
    public C1834Ary A09;
    public C1958Aux A0A;
    public C1822Arm A0B;
    public C2K7 A0C;
    public AXN A0D;
    public List<C1733ApU<C1821Arl>> A0E;
    public boolean A0F;
    public EnumC1820Arj A0G;

    public static final C1834Ary A01(C1944Aui c1944Aui, EnumC1820Arj enumC1820Arj) {
        C1834Ary c1834Ary = c1944Aui.A09;
        if (c1834Ary == null || enumC1820Arj != c1944Aui.A0G || c1834Ary.AG7()) {
            c1944Aui.A0G = enumC1820Arj;
            ApQ apQ = c1944Aui.A08;
            C1822Arm c1822ArmA01 = AbstractC1823Arn.A01(c1944Aui.A0B, enumC1820Arj);
            AXN axn = c1944Aui.A0D;
            C7384Etj.A0X(axn);
            C2K7 c2k7 = c1944Aui.A0C;
            List list = c1944Aui.A0E;
            if (list == null) {
                list = C0881AGi.A00;
            }
            c1834Ary = new C1834Ary(apQ, c1822ArmA01, c2k7, axn, list);
        }
        c1944Aui.A09 = c1834Ary;
        return c1834Ary;
    }

    public final int A02(EnumC1820Arj enumC1820Arj, int i) {
        int i2 = this.A01;
        int i3 = this.A00;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA05 = AYL.A05(0, i, 0, Integer.MAX_VALUE);
        if (this.A03 > 1) {
            C1934Atx c1934Atx = this.A07;
            C1822Arm c1822Arm = this.A0B;
            AXN axn = this.A0D;
            C7384Etj.A0X(axn);
            C1934Atx c1934AtxA00 = C1934Atx.A00(c1934Atx, c1822Arm, this.A0C, axn, enumC1820Arj);
            this.A07 = c1934AtxA00;
            jA05 = c1934AtxA00.A01(jA05, this.A03);
        }
        int iA00 = AbstractC2060AxX.A00(A00(this, enumC1820Arj, jA05).A00);
        int iA02 = Constraints.A02(jA05);
        if (iA00 < iA02) {
            iA00 = iA02;
        }
        this.A01 = i;
        this.A00 = iA00;
        return iA00;
    }

    public final void A03(ApQ apQ, C1822Arm c1822Arm, C2K7 c2k7, List list, int i, int i2, int i3, boolean z) {
        this.A08 = apQ;
        boolean zA03 = c1822Arm.A03(this.A0B);
        this.A0B = c1822Arm;
        if (!zA03) {
            this.A05 <<= 2;
            this.A09 = null;
            this.A0A = null;
            this.A00 = -1;
            this.A01 = -1;
        }
        this.A0C = c2k7;
        this.A04 = i;
        this.A0F = z;
        this.A02 = i2;
        this.A03 = i3;
        this.A0E = list;
        this.A05 = 2 | (this.A05 << 2);
        this.A09 = null;
        this.A0A = null;
        this.A00 = -1;
        this.A01 = -1;
    }

    public final void A04(AXN axn) {
        long jA0J;
        AXN axn2 = this.A0D;
        if (axn != null) {
            long j = AbstractC1967AvY.A00;
            jA0J = AnonymousClass005.A0J(axn.AEm(), axn.AFo());
        } else {
            jA0J = AbstractC1967AvY.A00;
        }
        if (axn2 == null) {
            this.A0D = axn;
            this.A06 = jA0J;
        } else if (axn == null || this.A06 != jA0J) {
            this.A0D = axn;
            this.A06 = jA0J;
            this.A05 = 1 | (this.A05 << 2);
            this.A09 = null;
            this.A0A = null;
            this.A00 = -1;
            this.A01 = -1;
        }
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MultiParagraphLayoutCache(textLayoutResult=");
        C1958Aux c1958Aux = this.A0A;
        Object constraints = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        sbA0x.append(c1958Aux != null ? "<TextLayoutResult>" : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append(", lastDensity=");
        long j = this.A06;
        long j2 = AbstractC1967AvY.A00;
        sbA0x.append((Object) FGI.A0P("InlineDensity(density=", ", fontScale=", ')', AnonymousClass003.A03(j), AnonymousClass004.A00(j)));
        sbA0x.append(", history=");
        sbA0x.append(this.A05);
        sbA0x.append(", constraints=");
        C1958Aux c1958Aux2 = this.A0A;
        if (c1958Aux2 != null) {
            constraints = new Constraints(c1958Aux2.A04.A02);
        }
        sbA0x.append(constraints);
        return C8j3.A16(sbA0x, ')');
    }

    public static final C1956Auv A00(C1944Aui c1944Aui, EnumC1820Arj enumC1820Arj, long j) {
        C1834Ary c1834AryA01 = A01(c1944Aui, enumC1820Arj);
        boolean z = c1944Aui.A0F;
        long jA00 = AbstractC1976Avh.A00(c1834AryA01.AHR(), c1944Aui.A04, j, z);
        boolean z2 = c1944Aui.A0F;
        int i = c1944Aui.A04;
        int i2 = c1944Aui.A02;
        if ((!z2 && (i == 2 || i == 4 || i == 5)) || i2 < 1) {
            i2 = 1;
        }
        return new C1956Auv(c1834AryA01, i2, i, jA00);
    }
}
