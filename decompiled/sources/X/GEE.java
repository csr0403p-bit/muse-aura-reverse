package X;

import androidx.glance.appwidget.protobuf.Utf8$UnpairedSurrogateException;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* loaded from: classes6.dex */
public abstract class GEE {
    public static final GEO A00;

    static {
        A00 = (C9399GHo.A03 && C9399GHo.A04 && (GEF.A00 == null || GEF.A01)) ? new GED() : new GEC();
    }

    public static int A00(String string) {
        int length = string.length();
        int i = 0;
        while (i < length && string.charAt(i) < '\u0080') {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = string.charAt(i);
            if (cCharAt < '\u0800') {
                i2 += ('\u007f' - cCharAt) >>> 31;
                i++;
            } else {
                int i3 = 0;
                while (i < length) {
                    char cCharAt2 = string.charAt(i);
                    if (cCharAt2 < '\u0800') {
                        i3 += ('\u007f' - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if ('\ud800' <= cCharAt2 && cCharAt2 <= '\udfff') {
                            if (Character.codePointAt(string, i) < 65536) {
                                throw new Utf8$UnpairedSurrogateException(i, length);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw BV5.A0R("UTF-8 length does not fit in int: ", i2 + LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES);
    }
}
