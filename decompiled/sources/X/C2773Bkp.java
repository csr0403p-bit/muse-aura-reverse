package X;

/* renamed from: X.Bkp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2773Bkp extends AbstractC2772Bko {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2772Bko) {
                C2773Bkp c2773Bkp = (C2773Bkp) ((AbstractC2772Bko) obj);
                if (Float.floatToIntBits(this.A03) != Float.floatToIntBits(c2773Bkp.A03) || Float.floatToIntBits(this.A01) != Float.floatToIntBits(c2773Bkp.A01) || Float.floatToIntBits(this.A02) != Float.floatToIntBits(c2773Bkp.A02) || Float.floatToIntBits(this.A00) != Float.floatToIntBits(c2773Bkp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC2779Bkw
    public final float AH5() {
        return this.A00;
    }

    @Override // X.InterfaceC2779Bkw
    public final float AHV() {
        return this.A01;
    }

    @Override // X.InterfaceC2779Bkw
    public final float AHl() {
        return this.A02;
    }

    @Override // X.InterfaceC2779Bkw
    public final float AMy() {
        return this.A03;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.A03) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.A01)) * 1000003) ^ Float.floatToIntBits(this.A02)) * 1000003) ^ Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ImmutableZoomState{zoomRatio=");
        sbA0x.append(this.A03);
        sbA0x.append(", maxZoomRatio=");
        sbA0x.append(this.A01);
        sbA0x.append(", minZoomRatio=");
        sbA0x.append(this.A02);
        sbA0x.append(", linearZoom=");
        sbA0x.append(this.A00);
        return BV7.A11(sbA0x);
    }

    public C2773Bkp(float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }
}
