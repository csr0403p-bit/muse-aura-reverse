package X;

/* renamed from: X.AxZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2062AxZ {
    public final int A00(AZE aze, EnumC1820Arj enumC1820Arj, int i, int i2, int i3) {
        if (this instanceof C1988Avt) {
            return ((C1988Avt) this).A00.A4A(i2, i);
        }
        if (this instanceof C1987Avs) {
            return ((C1987Avs) this).A00.A4E(enumC1820Arj, i2, i);
        }
        int iABt = aze.ABt(((C2009AwK) ((C2010AwL) this).A00).A00);
        if (iABt == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iABt;
        return enumC1820Arj == EnumC1820Arj.A03 ? (i - i2) - i4 : i4;
    }
}
