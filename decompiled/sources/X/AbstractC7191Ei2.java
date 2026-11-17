package X;

import android.graphics.PointF;

/* renamed from: X.Ei2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7191Ei2 extends AbstractC7202EiH {
    public final PointF A00;
    public final InterfaceC8647Fhz A01;
    public final C7434Evs A02;
    public final F0M A03;
    public final C7177Ehm A04;
    public final C7198EiA A05;
    public final C7481Exe A06;
    public final C1bk A07;
    public final BXh A08;
    public final Boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public AbstractC7191Ei2(C7195Ei7<?> c7195Ei7) {
        super(c7195Ei7);
        this.A06 = c7195Ei7.A06;
        this.A08 = c7195Ei7.A08;
        this.A07 = c7195Ei7.A07;
        this.A05 = c7195Ei7.A05;
        this.A04 = c7195Ei7.A04;
        this.A02 = c7195Ei7.A02;
        this.A0A = c7195Ei7.A0A;
        this.A0E = c7195Ei7.A0E;
        this.A01 = c7195Ei7.A01;
        this.A00 = c7195Ei7.A00;
        this.A0D = c7195Ei7.A0D;
        this.A0C = c7195Ei7.A0C;
        this.A03 = c7195Ei7.A03;
        this.A09 = c7195Ei7.A09;
        this.A0B = c7195Ei7.A0B;
    }

    @Override // X.AbstractC7202EiH
    public int hashCode() {
        int i = 0;
        int iA0F = (((((((AnonymousClass005.A0F(this.A01, C0KA.A01(C0KA.A01(((((((((((((super.hashCode() * 31) + C60R.A01(this.A06)) * 31) + C60R.A01(this.A08)) * 31) + C60R.A01(this.A07)) * 31 * 31 * 31) + C60R.A01(this.A05)) * 31) + C60R.A01(this.A04)) * 31) + C60R.A01(this.A02)) * 31, this.A0A), this.A0E) * 31) + C60R.A01(this.A00)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + C60R.A01(this.A03)) * 31;
        Boolean bool = this.A09;
        if (bool != null) {
            i = 1237;
            if (bool.booleanValue()) {
                i = 1231;
            }
        }
        return ((iA0F + i) * 31) + (this.A0B ? 1 : 0);
    }
}
