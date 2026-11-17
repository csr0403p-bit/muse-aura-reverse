package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.BaQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2410BaQ extends Bb3 {
    public final long A00;
    public final EnumC2408BaN A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Bb3) {
                C2410BaQ c2410BaQ = (C2410BaQ) ((Bb3) obj);
                if (!this.A02.equals(c2410BaQ.A02) || !this.A01.equals(c2410BaQ.A01) || this.A00 != c2410BaQ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return BV6.A08(this.A01, (BV5.A03(num, A00(num)) ^ 1000003) * 1000003) ^ ((int) this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SurfaceConfig{configType=");
        Integer num = this.A02;
        sbA0x.append(num != null ? A00(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append(", configSize=");
        sbA0x.append(this.A01);
        sbA0x.append(", streamUseCase=");
        sbA0x.append(this.A00);
        return BV7.A11(sbA0x);
    }

    public C2410BaQ(EnumC2408BaN enumC2408BaN, Integer num, long j) {
        this.A02 = num;
        this.A01 = enumC2408BaN;
        this.A00 = j;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "YUV";
            case 2:
                return "JPEG";
            case 3:
                return "JPEG_R";
            case 4:
                return "RAW";
            default:
                return "PRIV";
        }
    }
}
