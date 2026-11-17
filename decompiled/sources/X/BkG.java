package X;

import android.hardware.camera2.params.OutputConfiguration;

/* loaded from: classes5.dex */
public final class BkG {
    public long A00 = 1;
    public final OutputConfiguration A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof BkG)) {
            return false;
        }
        BkG bkG = (BkG) obj;
        return C6xC.A00(this.A01, bkG.A01) && this.A00 == bkG.A00;
    }

    public final int hashCode() {
        int iHashCode = this.A01.hashCode() ^ 31;
        return AnonymousClass002.A0A(this.A00) ^ ((iHashCode << 5) - iHashCode);
    }

    public BkG(OutputConfiguration outputConfiguration) {
        this.A01 = outputConfiguration;
    }
}
