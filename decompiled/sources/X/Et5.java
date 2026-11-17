package X;

import android.graphics.Path;

/* loaded from: classes5.dex */
public final class Et5 extends C06G implements InterfaceC7430Evn {
    public final float A00;
    public final long A01;

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        C7384Etj.A0Y(path, 0);
        long j = this.A01;
        path.addCircle(AnonymousClass003.A03(j), AnonymousClass004.A00(j), this.A00, Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Et5) {
                Et5 et5 = (Et5) obj;
                if (this.A01 != et5.A01 || Float.compare(this.A00, et5.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C3cI.A01(this.A01) + Float.floatToIntBits(this.A00);
    }

    public Et5(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }
}
