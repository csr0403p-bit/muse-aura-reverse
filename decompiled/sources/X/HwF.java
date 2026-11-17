package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes6.dex */
public final class HwF extends C06G implements InterfaceC7487Exq {
    public final int A00;
    public final InterfaceC8642Fhu A01;
    public final C8180FXw A02;
    public final InterfaceC7824FGf A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HwF) {
                HwF hwF = (HwF) obj;
                if (!C7384Etj.areEqual(this.A03, hwF.A03) || !C7384Etj.areEqual(this.A01, hwF.A01) || this.A00 != hwF.A00 || !C7384Etj.areEqual(this.A02, hwF.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A03)) + this.A00) * 31) + AnonymousClass006.A0D(this.A02);
    }

    public HwF(InterfaceC8642Fhu interfaceC8642Fhu, C8180FXw c8180FXw, InterfaceC7824FGf interfaceC7824FGf, int i) {
        this.A03 = interfaceC7824FGf;
        this.A01 = interfaceC8642Fhu;
        this.A00 = i;
        this.A02 = c8180FXw;
    }

    @Override // X.InterfaceC7487Exq
    public final void A9H(Canvas canvas, C7377EtL c7377EtL) {
        AnonymousClass003.A0u(canvas, c7377EtL);
        Paint paintA0U = c7377EtL.A00;
        if (paintA0U == null) {
            paintA0U = AbstractC7607F5u.A0U(7);
            AbstractC7607F5u.A1G(paintA0U);
            c7377EtL.A00 = paintA0U;
        }
        C8180FXw c8180FXw = this.A02;
        HwF hwF = c7377EtL.A03;
        if (!C7384Etj.areEqual(c8180FXw, hwF != null ? hwF.A02 : null)) {
            if (c8180FXw != null) {
                paintA0U.setShadowLayer(c8180FXw.A02, c8180FXw.A00, c8180FXw.A01, c8180FXw.A03);
            } else {
                paintA0U.clearShadowLayer();
            }
        }
        int i = this.A00;
        HwF hwF2 = c7377EtL.A03;
        if (hwF2 == null || i != hwF2.A00) {
            AbstractC8733FjY.A01(i, paintA0U);
        }
        InterfaceC8642Fhu interfaceC8642Fhu = this.A01;
        HwF hwF3 = c7377EtL.A03;
        if (!C7384Etj.areEqual(interfaceC8642Fhu, hwF3 != null ? hwF3.A01 : null)) {
            if (interfaceC8642Fhu instanceof C8641Fht) {
                if (paintA0U.getShader() != null) {
                    paintA0U.setShader(null);
                }
                int color = paintA0U.getColor();
                int i2 = ((C8641Fht) interfaceC8642Fhu).A00;
                if (color != i2) {
                    paintA0U.setColor(i2);
                }
            } else {
                if (!(interfaceC8642Fhu instanceof C8640Fhs)) {
                    throw C3cG.A0q();
                }
                if (paintA0U.getAlpha() != 255) {
                    paintA0U.setAlpha(255);
                }
                paintA0U.setShader(((C8640Fhs) interfaceC8642Fhu).A00.Ah5());
            }
        }
        c7377EtL.A03 = this;
        InterfaceC7824FGf interfaceC7824FGf = this.A03;
        if (interfaceC7824FGf instanceof C7376EtK) {
            canvas.drawPath(c7377EtL.A00((C7376EtK) interfaceC7824FGf), paintA0U);
        } else {
            if (!(interfaceC7824FGf instanceof HCX)) {
                throw C3cG.A0q();
            }
            if (interfaceC7824FGf instanceof HyK) {
                Hx0.A00();
            } else {
                ((HCX) interfaceC7824FGf).A9F(canvas, paintA0U);
            }
        }
    }
}
