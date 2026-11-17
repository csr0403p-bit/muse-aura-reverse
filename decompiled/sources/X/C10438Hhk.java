package X;

import java.util.Arrays;

/* renamed from: X.Hhk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10438Hhk extends C06G implements InterfaceC7487Exq {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final InterfaceC8642Fhu A06;
    public final C8180FXw A07;
    public final InterfaceC7824FGf A08;
    public final float[] A09;

    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    @Override // X.InterfaceC7487Exq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A9H(android.graphics.Canvas r10, X.C7377EtL r11) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10438Hhk.A9H(android.graphics.Canvas, X.EtL):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.primitive.canvas.model.CanvasStroke");
                C10438Hhk c10438Hhk = (C10438Hhk) obj;
                if (C7384Etj.areEqual(this.A08, c10438Hhk.A08) && C7384Etj.areEqual(this.A06, c10438Hhk.A06) && this.A03 == c10438Hhk.A03 && C7384Etj.areEqual(this.A07, c10438Hhk.A07) && this.A01 == c10438Hhk.A01 && this.A04 == c10438Hhk.A04 && this.A05 == c10438Hhk.A05 && this.A02 == c10438Hhk.A02) {
                    float[] fArr = this.A09;
                    float[] fArr2 = c10438Hhk.A09;
                    if (fArr != null) {
                        if (fArr2 != null && Arrays.equals(fArr, fArr2)) {
                        }
                    } else if (fArr2 != null) {
                        return false;
                    }
                    if (this.A00 == c10438Hhk.A00) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02((((AnonymousClass005.A02((((AnonymousClass005.A0F(this.A06, AnonymousClass005.A0E(this.A08)) + this.A03) * 31) + C60R.A01(this.A07)) * 31, this.A01) + this.A04) * 31) + this.A05) * 31, this.A02);
        float[] fArr = this.A09;
        return C8j4.A06((iA02 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31, this.A00);
    }

    public C10438Hhk(InterfaceC8642Fhu interfaceC8642Fhu, C8180FXw c8180FXw, InterfaceC7824FGf interfaceC7824FGf, float[] fArr, float f, float f2, float f3, int i, int i2, int i3) {
        this.A08 = interfaceC7824FGf;
        this.A06 = interfaceC8642Fhu;
        this.A03 = i;
        this.A07 = c8180FXw;
        this.A01 = f;
        this.A04 = i2;
        this.A05 = i3;
        this.A02 = f2;
        this.A09 = fArr;
        this.A00 = f3;
    }
}
