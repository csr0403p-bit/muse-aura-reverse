package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class GCF {
    public final AtomicReferenceArray<GCH> A00 = new AtomicReferenceArray<>(128);
    public volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    public volatile /* synthetic */ int consumerIndex$volatile;
    public volatile /* synthetic */ Object lastScheduledTask$volatile;
    public volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(GCF.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A03 = AtomicIntegerFieldUpdater.newUpdater(GCF.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(GCF.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(GCF.class, "blockingTasksInBuffer$volatile");

    public static final GCH A00(GCF gcf) {
        GCH andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
            int i = atomicIntegerFieldUpdater.get(gcf);
            if (i - A03.get(gcf) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(gcf, i, i + 1) && (andSet = gcf.A00.getAndSet(i2, null)) != null) {
                if (andSet.A01) {
                    A01.decrementAndGet(gcf);
                }
                return andSet;
            }
        }
    }
}
