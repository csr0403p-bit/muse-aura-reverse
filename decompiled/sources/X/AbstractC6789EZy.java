package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;

/* renamed from: X.EZy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6789EZy {
    public static final String A00(int i) {
        if (i == 0) {
            return HatchPriceImpressionEventDataKt.NO_DISCOUNT;
        }
        char[] cArr = AbstractC6790EZz.A00;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (cArr2[i2] == '0' && (i2 = i2 + 1) < 8) {
        }
        AH7.A03(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final void A01(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }
}
