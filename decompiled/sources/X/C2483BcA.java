package X;

/* renamed from: X.BcA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2483BcA extends AbstractC2485BcC {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2485BcC) {
                C2483BcA c2483BcA = (C2483BcA) ((AbstractC2485BcC) obj);
                if (this.A00 != c2483BcA.A00 || this.A01 != c2483BcA.A01 || this.A02 != c2483BcA.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FeatureSettings{cameraMode=");
        sbA0x.append(0);
        sbA0x.append(", requiredMaxBitDepth=");
        sbA0x.append(this.A00);
        sbA0x.append(", previewStabilizationOn=");
        sbA0x.append(this.A01);
        sbA0x.append(", ultraHdrOn=");
        sbA0x.append(this.A02);
        return BV7.A11(sbA0x);
    }

    public C2483BcA(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public final int hashCode() {
        return (((((-721379959) ^ this.A00) * 1000003) ^ BV7.A02(this.A01 ? 1 : 0)) * 1000003) ^ (this.A02 ? 1231 : 1237);
    }
}
