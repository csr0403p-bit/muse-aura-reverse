package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.Cg3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3872Cg3 extends AbstractC3925Ch6 {
    public final long A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3925Ch6) {
                C3872Cg3 c3872Cg3 = (C3872Cg3) ((AbstractC3925Ch6) obj);
                if (!this.A01.equals(c3872Cg3.A01) || this.A00 != c3872Cg3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        return ((BV5.A03(num, A00(num)) ^ 1000003) * 1000003) ^ AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        Integer num = this.A01;
        return FGI.A0g("BackendResponse{status=", num != null ? A00(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD, ", nextRequestWaitMillis=", "}", this.A00);
    }

    public C3872Cg3(long j, Integer num) {
        this.A01 = num;
        this.A00 = j;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "TRANSIENT_ERROR";
            case 2:
                return "FATAL_ERROR";
            case 3:
                return "INVALID_PAYLOAD";
            default:
                return "OK";
        }
    }
}
