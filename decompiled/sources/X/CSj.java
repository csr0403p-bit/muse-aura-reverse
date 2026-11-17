package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CSj {
    public final C3530CSl A00;
    public final String A01;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<LX/CSo;>;LX/CSl;)V */
    public CSj(C3530CSl c3530CSl, Set set) {
        this.A01 = A00(set);
        this.A00 = c3530CSl;
    }

    public static String A00(Set<AbstractC3533CSo> set) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator<AbstractC3533CSo> it = set.iterator();
        while (it.hasNext()) {
            C3529CSk c3529CSk = (C3529CSk) it.next();
            sbA0w.append(c3529CSk.A00);
            sbA0w.append('/');
            sbA0w.append(c3529CSk.A01);
            if (it.hasNext()) {
                sbA0w.append(' ');
            }
        }
        return sbA0w.toString();
    }
}
