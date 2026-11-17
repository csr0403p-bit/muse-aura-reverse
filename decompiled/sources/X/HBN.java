package X;

import android.graphics.Path;

/* loaded from: classes6.dex */
public final class HBN implements InterfaceC10348HBm {
    public float A00;
    public float A01;
    public Path A02 = AbstractC7607F5u.A0V();
    public final /* synthetic */ HB9 A03;

    @Override // X.InterfaceC10348HBm
    public final void A4j(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        HB9.A0S(this, this.A00, this.A01, f, f2, f3, f4, f5, z, z2);
        this.A00 = f4;
        this.A01 = f5;
    }

    public HBN(HBL hbl, HB9 hb9) {
        this.A03 = hb9;
        if (hbl != null) {
            hbl.A02(this);
        }
    }

    @Override // X.InterfaceC10348HBm
    public final void A87(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A02.cubicTo(f, f2, f3, f4, f5, f6);
        this.A00 = f5;
        this.A01 = f6;
    }

    @Override // X.InterfaceC10348HBm
    public final void APc(float f, float f2) {
        this.A02.lineTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.InterfaceC10348HBm
    public final void AQx(float f, float f2) {
        this.A02.moveTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.InterfaceC10348HBm
    public final void AYt(float f, float f2, float f3, float f4) {
        this.A02.quadTo(f, f2, f3, f4);
        this.A00 = f3;
        this.A01 = f4;
    }

    @Override // X.InterfaceC10348HBm
    public final void close() {
        this.A02.close();
    }
}
