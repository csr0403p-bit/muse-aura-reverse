package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.CQc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3484CQc extends CQf {
    public final AtomicReferenceFieldUpdater<AbstractC3485CQd, CQi> A00;
    public final AtomicReferenceFieldUpdater<AbstractC3485CQd, Object> A01;
    public final AtomicReferenceFieldUpdater<C3490CQn, C3490CQn> A02;
    public final AtomicReferenceFieldUpdater<C3490CQn, Thread> A03;
    public final AtomicReferenceFieldUpdater<AbstractC3485CQd, C3490CQn> A04;

    public C3484CQc(AtomicReferenceFieldUpdater<C3490CQn, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<C3490CQn, C3490CQn> waiterNextUpdater, AtomicReferenceFieldUpdater<AbstractC3485CQd, C3490CQn> waitersUpdater, AtomicReferenceFieldUpdater<AbstractC3485CQd, CQi> listenersUpdater, AtomicReferenceFieldUpdater<AbstractC3485CQd, Object> valueUpdater) {
        this.A03 = waiterThreadUpdater;
        this.A02 = waiterNextUpdater;
        this.A04 = waitersUpdater;
        this.A00 = listenersUpdater;
        this.A01 = valueUpdater;
    }
}
