package X;

/* loaded from: classes4.dex */
public final class AW1 {
    public InterfaceC2178B0w A01 = null;
    public InterfaceC1327AhE A00 = null;
    public C1325AhC A03 = null;
    public InterfaceC1068ATy A02 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AW1) {
                AW1 aw1 = (AW1) obj;
                if (!C7384Etj.areEqual(this.A01, aw1.A01) || !C7384Etj.areEqual(this.A00, aw1.A00) || !C7384Etj.areEqual(this.A03, aw1.A03) || !C7384Etj.areEqual(this.A02, aw1.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass006.A0D(this.A01) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + C3cH.A02(this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BorderCache(imageBitmap=");
        sbA0x.append(this.A01);
        sbA0x.append(", canvas=");
        sbA0x.append(this.A00);
        sbA0x.append(", canvasDrawScope=");
        sbA0x.append(this.A03);
        sbA0x.append(", borderPath=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }
}
