package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.CQb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3483CQb extends CQh {
    public final AtomicReferenceFieldUpdater<CQV, C3492CQp> A00;
    public final AtomicReferenceFieldUpdater<CQV, Object> A01;
    public final AtomicReferenceFieldUpdater<C3489CQm, C3489CQm> A02;
    public final AtomicReferenceFieldUpdater<C3489CQm, Thread> A03;
    public final AtomicReferenceFieldUpdater<CQV, C3489CQm> A04;

    /* JADX WARN: Incorrect types in method signature: (LX/CQV<*>;LX/CQp;LX/CQp;)Z */
    @Override // X.CQh
    public final boolean A00(C3492CQp c3492CQp, C3492CQp c3492CQp2, CQV cqv) {
        return AbstractC5217DdT.A00(cqv, c3492CQp, c3492CQp2, this.A00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CQV<*>;LX/CQm;LX/CQm;)Z */
    @Override // X.CQh
    public final boolean A01(C3489CQm c3489CQm, C3489CQm c3489CQm2, CQV cqv) {
        return AbstractC5217DdT.A00(cqv, c3489CQm, c3489CQm2, this.A04);
    }

    @Override // X.CQh
    public final boolean A02(CQV<?> cqv, Object obj, Object obj2) {
        return AbstractC5217DdT.A00(cqv, obj, obj2, this.A01);
    }

    public C3483CQb(AtomicReferenceFieldUpdater<C3489CQm, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C3489CQm, C3489CQm> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<CQV, C3489CQm> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<CQV, C3492CQp> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<CQV, Object> atomicReferenceFieldUpdater5) {
        this.A03 = atomicReferenceFieldUpdater;
        this.A02 = atomicReferenceFieldUpdater2;
        this.A04 = atomicReferenceFieldUpdater3;
        this.A00 = atomicReferenceFieldUpdater4;
        this.A01 = atomicReferenceFieldUpdater5;
    }
}
