package X;

/* loaded from: classes4.dex */
public final class ATA extends AOd {
    public float A00;
    public float A01;
    public float A02;

    public final boolean equals(Object obj) {
        if (obj instanceof ATA) {
            ATA ata = (ATA) obj;
            if (ata.A00 == this.A00 && ata.A01 == this.A01 && ata.A02 == this.A02) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(C8j4.A04(this.A00), this.A01), this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnimationVector3D: v1 = ");
        sbA0x.append(this.A00);
        sbA0x.append(", v2 = ");
        sbA0x.append(this.A01);
        sbA0x.append(", v3 = ");
        sbA0x.append(this.A02);
        return sbA0x.toString();
    }
}
