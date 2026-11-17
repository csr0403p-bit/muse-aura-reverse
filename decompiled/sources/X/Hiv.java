package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class Hiv {
    public static final AtomicReference<EnumC10570Huc> A01 = BV4.A16(EnumC10570Huc.A02);
    public static final Set A00 = new CopyOnWriteArraySet();
    public static final AtomicInteger A03 = BV5.A17();
    public static final Map A02 = BV4.A0u();

    public static final void A00() {
        Set set = A00;
        if (set.isEmpty()) {
            return;
        }
        if ((set instanceof Collection) && set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC7609F5w.A0m(it);
        }
    }
}
