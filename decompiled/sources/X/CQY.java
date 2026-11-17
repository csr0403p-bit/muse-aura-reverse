package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class CQY extends CQX {
    public final AtomicReferenceFieldUpdater<? super CQU<?>, CQj> A00;
    public final AtomicReferenceFieldUpdater<? super CQU<?>, Object> A01;
    public final AtomicReferenceFieldUpdater<C3491CQo, C3491CQo> A02;
    public final AtomicReferenceFieldUpdater<C3491CQo, Thread> A03;
    public final AtomicReferenceFieldUpdater<? super CQU<?>, C3491CQo> A04;

    public CQY(AtomicReferenceFieldUpdater<C3491CQo, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<C3491CQo, C3491CQo> waiterNextUpdater, AtomicReferenceFieldUpdater<? super CQU<?>, C3491CQo> waitersUpdater, AtomicReferenceFieldUpdater<? super CQU<?>, CQj> listenersUpdater, AtomicReferenceFieldUpdater<? super CQU<?>, Object> valueUpdater) {
        this.A03 = waiterThreadUpdater;
        this.A02 = waiterNextUpdater;
        this.A04 = waitersUpdater;
        this.A00 = listenersUpdater;
        this.A01 = valueUpdater;
    }
}
