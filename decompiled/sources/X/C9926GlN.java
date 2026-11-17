package X;

import java.math.BigDecimal;

/* renamed from: X.GlN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9926GlN extends AbstractC9927GlO {
    public int A00;
    public C9516GMj A01;
    public AbstractC9794GhC A02;
    public C9997GnR A03;
    public C10038GoI A04;
    public boolean A05;
    public final boolean A06;
    public final boolean A07;
    public transient C9964Gmb A08;

    public static Number A0A(C9926GlN c9926GlN, boolean z) {
        EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) c9926GlN).A00;
        if (enumC9834GiY == null || !enumC9834GiY._isNumber) {
            throw AbstractC9916Gl7.A03(c9926GlN, AnonymousClass001.A0v(") not numeric, cannot use numeric value accessors", C3cG.A0f(enumC9834GiY, "Current token (")));
        }
        Object objA05 = AbstractC9916Gl7.A05(c9926GlN);
        if (objA05 instanceof Number) {
            return (Number) objA05;
        }
        if (!(objA05 instanceof String)) {
            throw BV5.A0U("Internal error: entry should be a Number, but is of type ", AbstractC9855Gj3.A07(objA05));
        }
        String str = (String) objA05;
        int length = str.length();
        if (((AbstractC9927GlO) c9926GlN).A00 == EnumC9834GiY.VALUE_NUMBER_INT) {
            return (z || length >= 19) ? AbstractC7611F5y.A0Z(c9926GlN, str) : length >= 10 ? Long.valueOf(HlV.A07(str)) : Integer.valueOf(HlV.A04(str));
        }
        if (!z) {
            return Double.valueOf(HlV.A00(str, c9926GlN.A23(EnumC10013Gnl.A02)));
        }
        BigDecimal bigDecimalA09 = HlV.A09(str, c9926GlN.A23(EnumC10013Gnl.A01));
        if (bigDecimalA09 == null) {
            throw BV5.A0V("Internal error: failed to parse number '", str, "'");
        }
        return bigDecimalA09;
    }

    public C9926GlN(AbstractC10020Gns abstractC10020Gns, AbstractC9794GhC abstractC9794GhC, C10002GnY c10002GnY, C9997GnR c9997GnR, boolean z, boolean z2) {
        super(c10002GnY);
        this.A01 = null;
        this.A03 = c9997GnR;
        this.A00 = -1;
        this.A02 = abstractC9794GhC;
        this.A04 = abstractC10020Gns == null ? new C10038GoI() : new C10038GoI(abstractC10020Gns, C9517GMk.A02);
        this.A07 = z;
        this.A06 = z2;
    }
}
