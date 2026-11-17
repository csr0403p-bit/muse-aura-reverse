package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Hoo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10521Hoo {
    public static int A00(String str) {
        if (str == null) {
            return 0;
        }
        Matcher matcher = Pattern.compile("^type_tag:([0-9a-zA-Z]{8});").matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return (int) Long.parseLong(BV6.A0p(matcher, 1), 16);
        }
        return 0;
    }
}
