package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CWK extends PhantomReference {
    public final Runnable A00;
    public final Set A01;

    public /* synthetic */ CWK(Object obj, Runnable runnable, ReferenceQueue referenceQueue, Set set) {
        super(obj, referenceQueue);
        this.A01 = set;
        this.A00 = runnable;
    }
}
