package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.Hsj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC10556Hsj {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, AtomicReferenceArray atomicReferenceArray, int i) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
