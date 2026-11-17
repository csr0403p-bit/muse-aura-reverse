package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.google.common.base.Preconditions;

/* loaded from: classes5.dex */
public abstract class DX6 {
    public static int A00(long value) {
        int i = (int) value;
        Preconditions.checkArgument(AnonymousClass002.A1M((i > value ? 1 : (i == value ? 0 : -1))), "Out of range: %s", value);
        return i;
    }

    public static Integer A02(String string) {
        Long lValueOf;
        byte b;
        string.getClass();
        if (string.isEmpty()) {
            return null;
        }
        int i = string.charAt(0) == '-' ? 1 : 0;
        int length = string.length();
        if (i == length) {
            return null;
        }
        int i2 = i + 1;
        char cCharAt = string.charAt(i);
        byte[] bArr = DX7.A00;
        if (cCharAt >= '\u0080') {
            return null;
        }
        byte[] bArr2 = DX7.A00;
        byte b2 = bArr[cCharAt];
        if (b2 < 0 || b2 >= 10) {
            return null;
        }
        long j = -b2;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt2 = string.charAt(i2);
            if (cCharAt2 >= '\u0080' || (b = bArr2[cCharAt2]) < 0 || b >= 10 || j < -922337203685477580L) {
                return null;
            }
            long j2 = j * 10;
            long j3 = b;
            if (j2 < j3 - Long.MIN_VALUE) {
                return null;
            }
            j = j2 - j3;
            i2 = i3;
        }
        if (i != 0) {
            lValueOf = Long.valueOf(j);
        } else {
            if (j == Long.MIN_VALUE) {
                return null;
            }
            lValueOf = Long.valueOf(-j);
        }
        long jLongValue = lValueOf.longValue();
        int iIntValue = lValueOf.intValue();
        if (jLongValue == iIntValue) {
            return Integer.valueOf(iIntValue);
        }
        return null;
    }

    public static int A01(long value) {
        if (value > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (value < AuraImpressionTimeTracker.UNKNOWN_TIME) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }
}
