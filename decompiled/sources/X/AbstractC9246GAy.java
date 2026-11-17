package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.GAy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9246GAy {
    public static final ThreadLocal<GB7> A00 = new ThreadLocal<>();

    public static final GB7 A00() {
        ThreadLocal<GB7> threadLocal = A00;
        GB7 gb7 = threadLocal.get();
        if (gb7 != null) {
            return gb7;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GB4.A01;
        GAz gAz = new GAz(Thread.currentThread());
        threadLocal.set(gAz);
        return gAz;
    }
}
