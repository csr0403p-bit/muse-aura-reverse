package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Hl7 {
    public long A00;
    public long A01;
    public boolean A02;
    public final Hs5 A03;

    public final String toString() {
        String str;
        long jA00 = this.A02 ? (this.A03.A00() - this.A01) + this.A00 : this.A00;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (jA00 / 86400000000000L <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (jA00 / 3600000000000L <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (jA00 / 60000000000L <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (jA00 / 1000000000 <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (jA00 / 1000000 <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (jA00 / 1000 <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jA00 / timeUnit2.convert(1L, timeUnit)));
        switch (FXR.A00[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "\u03bcs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw BV6.A0f();
        }
        return FGI.A0U(str2, InviteCodeScratcherKt.CODE_SEPARATOR, str);
    }

    public Hl7(Hs5 hs5) {
        if (hs5 == null) {
            throw BV4.A0a("ticker");
        }
        this.A03 = hs5;
    }
}
