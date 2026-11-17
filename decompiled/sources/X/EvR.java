package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class EvR extends WeakReference<Throwable> {
    public final int A00;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this != obj) {
                EvR evR = (EvR) obj;
                if (this.A00 != evR.A00 || get() != evR.get()) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public EvR(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.A00 = System.identityHashCode(th);
    }
}
