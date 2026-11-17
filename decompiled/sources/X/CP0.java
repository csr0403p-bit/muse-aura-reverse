package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CP0 {
    public static final CP0 A02 = new CP0(-1);
    public static final CP0 A03 = new CP0(-2);
    public static final CP0 A04 = new CP0(new int[0]);
    public final int[] A00;
    public final int[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                CP0 cp0 = (CP0) obj;
                if (!Arrays.equals(this.A01, cp0.A01) || !Arrays.equals(this.A00, cp0.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + Arrays.hashCode(this.A00);
    }

    public CP0(int... iArr) {
        this.A01 = iArr;
        this.A00 = null;
    }

    public final String toString() {
        return FGI.A0h("{normalMarkers: ", Arrays.toString(this.A01), ", metadataMarkers: ", Arrays.toString(this.A00), "}");
    }

    public CP0(int[] iArr, int[] iArr2) {
        this.A01 = iArr;
        this.A00 = iArr2;
    }
}
