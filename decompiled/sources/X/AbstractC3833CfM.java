package X;

import java.util.Map;

/* renamed from: X.CfM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3833CfM {
    public static C3832CfL A00(C3853Cfi c3853Cfi, Integer num, Long l, Long l2, String str, Map map) {
        String strA0M = str == null ? " transportName" : "";
        if (l == null) {
            strA0M = FGI.A0M(strA0M, " eventMillis");
        }
        if (l2 == null) {
            strA0M = FGI.A0M(strA0M, " uptimeMillis");
        }
        if (strA0M.isEmpty()) {
            return new C3832CfL(c3853Cfi, num, str, map, l.longValue(), l2.longValue());
        }
        throw BV8.A0l(strA0M);
    }
}
