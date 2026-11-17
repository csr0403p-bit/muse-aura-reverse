package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class Bs8 {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, AtomicReference atomicReference) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
