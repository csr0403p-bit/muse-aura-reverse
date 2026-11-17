package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.CPk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3477CPk extends CPh {
    public final AtomicIntegerFieldUpdater<? super AbstractC3476CPj<?>> A00;
    public final AtomicReferenceFieldUpdater<? super AbstractC3476CPj<?>, ? super Set<Throwable>> A01;

    @Override // X.CPh
    public final int A00(AbstractC3476CPj<?> state) {
        return this.A00.decrementAndGet(state);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<-LX/CPj<*>;-Ljava/util/Set<Ljava/lang/Throwable;>;>;Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater<-LX/CPj<*>;>;)V */
    public C3477CPk(AtomicIntegerFieldUpdater seenExceptionsUpdater, AtomicReferenceFieldUpdater remainingCountUpdater) {
        this.A01 = remainingCountUpdater;
        this.A00 = seenExceptionsUpdater;
    }
}
