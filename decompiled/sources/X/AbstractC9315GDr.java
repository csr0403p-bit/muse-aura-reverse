package X;

import java.util.Iterator;

/* renamed from: X.GDr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9315GDr {
    public static long A00(Iterable iterable) {
        Iterator it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((C9314GDq) it.next()).A00;
        }
        return 4 + j;
    }
}
