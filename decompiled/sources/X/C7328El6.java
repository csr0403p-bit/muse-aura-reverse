package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.El6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7328El6 {
    public final ReentrantLock A02 = new ReentrantLock();
    public final Map<SoftReference<HjR>, Boolean> A01 = C60O.A1C();
    public final ReferenceQueue<HjR> A00 = new ReferenceQueue<>();
}
