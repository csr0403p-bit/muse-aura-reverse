package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: X.El9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7331El9 implements FWS {
    public static final long serialVersionUID = 1;

    /* JADX WARN: Incorrect return type in method signature: ()TP; */
    @Override // X.FWS
    public final HjR A2y() {
        HjR hjR;
        SoftReference<HjR> softReference;
        ThreadLocal<SoftReference<HjR>> threadLocal = AbstractC7330El8.A01;
        SoftReference<HjR> softReference2 = threadLocal.get();
        if (softReference2 == null || (hjR = softReference2.get()) == null) {
            hjR = new HjR();
            C7328El6 c7328El6 = AbstractC7330El8.A00;
            if (c7328El6 != null) {
                ReferenceQueue<HjR> referenceQueue = c7328El6.A00;
                softReference = new SoftReference<>(hjR, referenceQueue);
                Map<SoftReference<HjR>, Boolean> map = c7328El6.A01;
                map.put(softReference, AnonymousClass001.A0i());
                while (true) {
                    Reference<? extends HjR> referencePoll = referenceQueue.poll();
                    if (referencePoll == null) {
                        break;
                    }
                    map.remove(referencePoll);
                }
            } else {
                softReference = new SoftReference<>(hjR);
            }
            threadLocal.set(softReference);
        }
        return hjR;
    }
}
