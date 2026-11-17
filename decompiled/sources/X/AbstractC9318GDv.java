package X;

import androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* renamed from: X.GDv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9318GDv {
    public static final GDZ A00;

    static {
        A00 = (C9400GHp.A04 && C9400GHp.A05 && (AbstractC9316GDs.A00 == null || AbstractC9316GDs.A01)) ? new GE1() : new GE0();
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < '\u0080') {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < '\u0800') {
                i2 += ('\u007f' - cCharAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = charSequence.charAt(i);
                    if (cCharAt2 < '\u0800') {
                        i3 += ('\u007f' - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if ('\ud800' <= cCharAt2 && cCharAt2 <= '\udfff') {
                            if (Character.codePointAt(charSequence, i) < 65536) {
                                throw new Utf8$UnpairedSurrogateException(i, length2);
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
