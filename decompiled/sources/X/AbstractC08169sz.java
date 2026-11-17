package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;

/* renamed from: X.9sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC08169sz {
    public static /* synthetic */ String A00(long j) {
        if (j == 0) {
            return HatchPriceImpressionEventDataKt.NO_DISCOUNT;
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        char[] cArr = new char[64];
        long j2 = (j >>> 1) / 5;
        cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
        int i = 63;
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % 10), 10);
            j2 /= 10;
        }
        return new String(cArr, i, 64 - i);
    }
}
