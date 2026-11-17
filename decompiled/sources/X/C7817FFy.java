package X;

import android.graphics.RectF;

/* renamed from: X.FFy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7817FFy {
    public final RectF A00;
    public final RectF A01;
    public final RectF A02;
    public final EnumC7870FIi A03;
    public final FIe A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7817FFy) {
                C7817FFy c7817FFy = (C7817FFy) obj;
                if (!this.A02.equals(c7817FFy.A02) || !this.A01.equals(c7817FFy.A01) || !this.A00.equals(c7817FFy.A00) || this.A04 != c7817FFy.A04 || this.A03 != c7817FFy.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)))));
    }

    public final String toString() {
        RectF rectF = this.A02;
        RectF rectF2 = this.A01;
        RectF rectF3 = this.A00;
        FIe fIe = this.A04;
        EnumC7870FIi enumC7870FIi = this.A03;
        StringBuilder sbA0f = C3cG.A0f(rectF, "TooltipPositionInfo(tooltipRect=");
        sbA0f.append(", contentRect=");
        sbA0f.append(rectF2);
        sbA0f.append(", arrowRect=");
        sbA0f.append(rectF3);
        sbA0f.append(", tooltipPosition=");
        sbA0f.append(fIe);
        return C3cJ.A0L(enumC7870FIi, ", arrowLocation=", sbA0f);
    }

    public C7817FFy(RectF rectF, RectF rectF2, RectF rectF3, EnumC7870FIi enumC7870FIi, FIe fIe) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A00 = rectF3;
        this.A04 = fIe;
        this.A03 = enumC7870FIi;
    }
}
