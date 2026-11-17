package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class E0c extends E04 {
    public static final Pattern A01 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    public final StringBuilder A00 = C60O.A0w();

    public static long A01(Matcher matcher, int i) {
        return ((BV8.A0M(matcher, i + 1) * 3600000) + (BV8.A0M(matcher, i + 2) * 60000) + (BV8.A0M(matcher, i + 3) * 1000) + BV8.A0M(matcher, i + 4)) * 1000;
    }
}
