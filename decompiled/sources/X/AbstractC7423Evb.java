package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Evb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7423Evb {
    public static void A00(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("check");
        }
    }
}
