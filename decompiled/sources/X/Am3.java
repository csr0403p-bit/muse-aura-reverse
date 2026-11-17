package X;

/* loaded from: classes4.dex */
public final class Am3 {
    public final int A00;
    public final InterfaceC1497Ak4 A01;
    public final C1562Alc A02;
    public final BLU A03;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ScrollCaptureCandidate(node=");
        sbA0x.append(this.A02);
        sbA0x.append(", depth=");
        sbA0x.append(this.A00);
        sbA0x.append(", viewportBoundsInWindow=");
        sbA0x.append(this.A03);
        sbA0x.append(", coordinates=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public Am3(InterfaceC1497Ak4 interfaceC1497Ak4, C1562Alc c1562Alc, BLU blu, int i) {
        this.A02 = c1562Alc;
        this.A00 = i;
        this.A03 = blu;
        this.A01 = interfaceC1497Ak4;
    }
}
