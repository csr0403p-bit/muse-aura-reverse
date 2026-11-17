package X;

/* renamed from: X.Dnz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5716Dnz extends Enum<AbstractC5716Dnz> {
    public final String value;

    public static Integer A00(String str) {
        if (str.equals("UNKNOWN")) {
            return C79.A00;
        }
        if (str.equals("DASH")) {
            return C79.A01;
        }
        if (str.equals("DASH_LIVE")) {
            return C79.A0C;
        }
        if (str.equals("PROGRESSIVE_DOWNLOAD")) {
            return C79.A0K;
        }
        if (str.equals("RTC_LIVE")) {
            return C79.A0P;
        }
        if (str.equals("HLS")) {
            return C79.A0T;
        }
        if (str.equals("MOQ_LIVE")) {
            return C79.A0W;
        }
        throw C60O.A0i(str);
    }
}
