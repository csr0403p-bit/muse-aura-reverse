package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: X.CPj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3476CPj<OutputT> extends AbstractC3446CNr<OutputT> {
    public static final CPh A00;
    public static final CPa A01 = new CPa(AbstractC3476CPj.class);
    public volatile int remaining;
    public volatile Set<Throwable> seenExceptions;

    static {
        CPh c3475CPi;
        Throwable th = null;
        try {
            c3475CPi = new C3477CPk(AtomicIntegerFieldUpdater.newUpdater(AbstractC3476CPj.class, "remaining"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3476CPj.class, Set.class, "seenExceptions"));
        } catch (Throwable th2) {
            th = th2;
            c3475CPi = new C3475CPi();
        }
        A00 = c3475CPi;
        if (th != null) {
            A01.A00().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
