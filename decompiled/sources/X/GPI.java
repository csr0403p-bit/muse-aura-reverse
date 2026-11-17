package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes6.dex */
public final class GPI extends C06G implements GPK {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GPI) && this.A00 == ((GPI) obj).A00);
    }

    @Override // X.GPK
    public final Integer AL4() {
        return this.A00;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return BV5.A03(num, GPJ.A01(num));
    }

    public final String toString() {
        Integer num = this.A00;
        return C60O.A0r("Rejected(status=", num != null ? GPJ.A01(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
    }

    public GPI(Integer num) {
        this.A00 = num;
    }
}
