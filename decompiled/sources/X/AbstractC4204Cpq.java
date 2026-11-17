package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.Cpq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4204Cpq {
    public static final StringBuilder A00;
    public static final SimpleDateFormat A01;
    public static final SimpleDateFormat A02;

    static {
        Locale locale = Locale.ROOT;
        A01 = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        A02 = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        A00 = BV4.A0p(33);
    }

    public static void A00(long j, StringBuilder sb) {
        String str;
        if (j == 0) {
            str = "0s";
        } else {
            sb.ensureCapacity(sb.length() + 27);
            boolean z = false;
            if (j < 0) {
                sb.append("-");
                if (j != Long.MIN_VALUE) {
                    j = -j;
                } else {
                    j = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                    z = true;
                }
            }
            if (j >= 86400000) {
                sb.append(j / 86400000);
                sb.append("d");
                j %= 86400000;
            }
            if (true == z) {
                j = 25975808;
            }
            if (j >= 3600000) {
                sb.append(j / 3600000);
                sb.append("h");
                j %= 3600000;
            }
            if (j >= 60000) {
                sb.append(j / 60000);
                sb.append("m");
                j %= 60000;
            }
            if (j >= 1000) {
                sb.append(j / 1000);
                sb.append("s");
                j %= 1000;
            }
            if (j <= 0) {
                return;
            }
            sb.append(j);
            str = "ms";
        }
        sb.append(str);
    }
}
