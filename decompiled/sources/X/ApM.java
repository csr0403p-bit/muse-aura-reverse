package X;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class ApM {
    public static final boolean A00(ApQ apQ) {
        int length = apQ.length();
        List<C1733ApU<? extends C1OS>> list = apQ.A01;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1733ApU c1733ApUA0c = C8j4.A0c(list, i);
            if ((c1733ApUA0c.A02 instanceof AbstractC1699Aoe) && AbstractC1730ApR.A00(0, length, c1733ApUA0c.A01, c1733ApUA0c.A00)) {
                return true;
            }
        }
        return false;
    }
}
