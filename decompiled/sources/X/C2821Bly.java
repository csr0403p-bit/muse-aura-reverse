package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.Bly, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2821Bly extends Bm1 {
    public final AbstractC2534BdL A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Bm1) {
                C2821Bly c2821Bly = (C2821Bly) ((Bm1) obj);
                if (this.A01.equals(c2821Bly.A01)) {
                    AbstractC2534BdL abstractC2534BdL = this.A00;
                    AbstractC2534BdL abstractC2534BdL2 = c2821Bly.A00;
                    if (abstractC2534BdL == null) {
                        if (abstractC2534BdL2 == null) {
                        }
                    } else if (abstractC2534BdL.equals(abstractC2534BdL2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        return ((BV5.A03(num, A00(num)) ^ 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CameraState{type=");
        Integer num = this.A01;
        sbA0x.append(num != null ? A00(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append(", error=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C2821Bly(AbstractC2534BdL abstractC2534BdL, Integer num) {
        this.A01 = num;
        this.A00 = abstractC2534BdL;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "OPENING";
            case 2:
                return "OPEN";
            case 3:
                return "CLOSING";
            case 4:
                return "CLOSED";
            default:
                return "PENDING_OPEN";
        }
    }
}
