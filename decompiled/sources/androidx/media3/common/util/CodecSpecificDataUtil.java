package androidx.media3.common.util;

import X.BV5;
import X.C60O;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class CodecSpecificDataUtil {
    public static final byte[] A01 = {0, 0, 0, 1};
    public static final String[] A02 = {"", "A", "B", "C"};
    public static final Pattern A00 = Pattern.compile("^\\D?(\\d+)$");

    public static String A00(int[] iArr, int i, int i2, int i3, int i4, boolean z) {
        StringBuilder sbA0x = C60O.A0x(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", A02[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
        int length = iArr.length;
        while (true) {
            if (length <= 0) {
                break;
            }
            if (iArr[length - 1] == 0) {
                length--;
            } else {
                int i5 = 0;
                do {
                    sbA0x.append(String.format(".%02X", BV5.A1Y(iArr[i5])));
                    i5++;
                } while (i5 < length);
            }
        }
        return sbA0x.toString();
    }
}
