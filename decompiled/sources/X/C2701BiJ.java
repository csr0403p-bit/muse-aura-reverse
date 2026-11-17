package X;

/* renamed from: X.BiJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2701BiJ extends AbstractC2815Bls {
    public final InterfaceC2873Bng A00;
    public final Bi7 A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2815Bls) {
                C2701BiJ c2701BiJ = (C2701BiJ) ((AbstractC2815Bls) obj);
                if (!this.A01.equals(c2701BiJ.A01) || !this.A00.equals(c2701BiJ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, BV8.A0A(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("InputPacket{processingRequest=");
        sbA0x.append(this.A01);
        sbA0x.append(", imageProxy=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C2701BiJ(InterfaceC2873Bng interfaceC2873Bng, Bi7 bi7) {
        if (bi7 == null) {
            throw BV4.A0a("Null processingRequest");
        }
        this.A01 = bi7;
        this.A00 = interfaceC2873Bng;
    }
}
