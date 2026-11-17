package X;

/* renamed from: X.Bjr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2750Bjr implements InterfaceC2779Bkw {
    public float A00;
    public float A01;
    public final float A02;
    public final float A03;

    public final void A00(float f) {
        float f2 = this.A02;
        if (f <= f2) {
            float f3 = this.A03;
            if (f >= f3) {
                this.A01 = f;
                float f4 = 0.0f;
                if (f2 != f3) {
                    if (f == f2) {
                        f4 = 1.0f;
                    } else if (f != f3) {
                        float f5 = 1.0f / f3;
                        f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
                    }
                }
                this.A00 = f4;
                return;
            }
        }
        StringBuilder sbA0x = C60O.A0x("Requested zoomRatio ");
        sbA0x.append(f);
        sbA0x.append(" is not within valid range [");
        sbA0x.append(this.A03);
        sbA0x.append(" , ");
        sbA0x.append(f2);
        throw C8j3.A0w("]", sbA0x);
    }

    @Override // X.InterfaceC2779Bkw
    public final float AH5() {
        return this.A00;
    }

    @Override // X.InterfaceC2779Bkw
    public final float AHV() {
        return this.A02;
    }

    @Override // X.InterfaceC2779Bkw
    public final float AHl() {
        return this.A03;
    }

    @Override // X.InterfaceC2779Bkw
    public final float AMy() {
        return this.A01;
    }

    public C2750Bjr(float f, float f2) {
        this.A02 = f;
        this.A03 = f2;
    }
}
