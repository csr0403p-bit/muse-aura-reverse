package X;

import android.view.Surface;

/* loaded from: classes5.dex */
public final class BmJ extends Bn0 {
    public final int A00;
    public final Surface A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Bn0) {
                BmJ bmJ = (BmJ) ((Bn0) obj);
                if (this.A00 != bmJ.A00 || !this.A01.equals(bmJ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A01, (this.A00 ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Result{resultCode=");
        sbA0x.append(this.A00);
        sbA0x.append(AnonymousClass000.A00(19));
        return BV8.A0v(this.A01, sbA0x);
    }

    public BmJ(int i, Surface surface) {
        this.A00 = i;
        if (surface == null) {
            throw BV4.A0a("Null surface");
        }
        this.A01 = surface;
    }
}
