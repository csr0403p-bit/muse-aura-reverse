package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes6.dex */
public class GCI {
    public final int A00;
    public final G0W<Throwable, Unit, C78T, Unit> A01;
    public volatile /* synthetic */ int _availablePermits$volatile;
    public volatile /* synthetic */ long deqIdx$volatile;
    public volatile /* synthetic */ long enqIdx$volatile;
    public volatile /* synthetic */ Object head$volatile;
    public volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(GCI.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A03 = AtomicLongFieldUpdater.newUpdater(GCI.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06 = AtomicReferenceFieldUpdater.newUpdater(GCI.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A04 = AtomicLongFieldUpdater.newUpdater(GCI.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(GCI.class, "_availablePermits$volatile");

    private final boolean A00(GCR gcr) {
        Object objA00;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A06;
        GCK gck = (GCK) atomicReferenceFieldUpdater.get(this);
        long andIncrement = A04.getAndIncrement(this);
        GCN gcn = GCN.A00;
        long j = GCQ.A01;
        long j2 = andIncrement / j;
        loop0: while (true) {
            objA00 = GCM.A00(gcn, gck, j2);
            if (objA00 == GCM.A00) {
                break;
            }
            GCK gckA00 = GCP.A00(objA00);
            while (true) {
                GCK gck2 = (GCK) atomicReferenceFieldUpdater.get(this);
                if (gck2.A00 >= gckA00.A00) {
                    break loop0;
                }
                if (gckA00.A08()) {
                    if (AbstractC5217DdT.A00(this, gck2, gckA00, atomicReferenceFieldUpdater)) {
                        AbstractC7607F5u.A1R(gck2);
                        break loop0;
                    }
                    if (gckA00.A07()) {
                        gckA00.A02();
                    }
                }
            }
        }
        GCJ gcj = (GCJ) GCP.A00(objA00);
        int i = (int) (andIncrement % j);
        AtomicReferenceArray atomicReferenceArray = gcj.A00;
        if (AbstractC10556Hsj.A00(null, gcr, atomicReferenceArray, i)) {
            gcr.AO3(gcj, i);
            return true;
        }
        if (!AbstractC10556Hsj.A00(GCQ.A04, GCQ.A05, atomicReferenceArray, i)) {
            return false;
        }
        if (gcr instanceof Hm1) {
            C7384Etj.A0Z(gcr, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((Hm1) gcr).Abe(Unit.INSTANCE, this.A01);
            return true;
        }
        if (!(gcr instanceof C9273GCa)) {
            throw AbstractC7607F5u.A10(gcr, "unexpected: ");
        }
        ((C9273GCa) gcr).A01 = Unit.INSTANCE;
        return true;
    }

    public final void A01(Hm1<? super Unit> hm1) {
        while (true) {
            int andDecrement = A02.getAndDecrement(this);
            if (andDecrement <= this.A00) {
                if (andDecrement > 0) {
                    hm1.Abe(Unit.INSTANCE, this.A01);
                    return;
                } else {
                    C7384Etj.A0Z(hm1, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
                    if (A00((GCR) hm1)) {
                        return;
                    }
                }
            }
        }
    }

    public final Object A2u(HtJ<? super Unit> htJ) {
        int andDecrement;
        do {
            andDecrement = A02.getAndDecrement(this);
        } while (andDecrement > this.A00);
        if (andDecrement <= 0) {
            GBL gblA00 = GBO.A00(C7Bm.A02(htJ));
            try {
                if (!A00(gblA00)) {
                    A01(gblA00);
                }
                Object objA0F = gblA00.A0F();
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                if (objA0F != enumC10460Hji) {
                    objA0F = Unit.INSTANCE;
                }
                if (objA0F == enumC10460Hji) {
                    return objA0F;
                }
            } catch (Throwable th) {
                gblA00.A0J();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean AhT() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.A00;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    return true;
                }
            }
        }
    }

    public final void release() {
        int i;
        Object objA00;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.A00;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw BV7.A0l("The number of released permits cannot be greater than ", i2);
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
            GCK gck = (GCK) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = A03.getAndIncrement(this);
            long j = GCQ.A01;
            long j2 = andIncrement2 / j;
            GCO gco = GCO.A00;
            while (true) {
                objA00 = GCM.A00(gco, gck, j2);
                if (objA00 == GCM.A00) {
                    break;
                }
                GCK gckA00 = GCP.A00(objA00);
                while (true) {
                    GCK gck2 = (GCK) atomicReferenceFieldUpdater.get(this);
                    if (gck2.A00 >= gckA00.A00) {
                        break;
                    }
                    if (gckA00.A08()) {
                        if (AbstractC5217DdT.A00(this, gck2, gckA00, atomicReferenceFieldUpdater)) {
                            if (gck2.A07()) {
                                gck2.A02();
                            }
                        } else if (gckA00.A07()) {
                            gckA00.A02();
                        }
                    }
                }
            }
            GCJ gcj = (GCJ) GCP.A00(objA00);
            gcj.A01();
            if (((GCK) gcj).A00 <= j2) {
                int i3 = (int) (andIncrement2 % j);
                HrH hrH = GCQ.A04;
                AtomicReferenceArray atomicReferenceArray = gcj.A00;
                Object andSet = atomicReferenceArray.getAndSet(i3, hrH);
                if (andSet == null) {
                    int i4 = GCQ.A00;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == GCQ.A05) {
                            return;
                        }
                    }
                    if (!AbstractC10556Hsj.A00(hrH, GCQ.A02, atomicReferenceArray, i3)) {
                        return;
                    }
                } else if (andSet == GCQ.A03) {
                    continue;
                } else if (andSet instanceof Hm1) {
                    Hm1 hm1 = (Hm1) andSet;
                    if (hm1.AhY(Unit.INSTANCE, null, this.A01) != null) {
                        hm1.A6g();
                        return;
                    }
                } else {
                    if (!(andSet instanceof C9273GCa)) {
                        throw AbstractC7607F5u.A10(andSet, "unexpected: ");
                    }
                    if (C9273GCa.A00(this, Unit.INSTANCE, (C9273GCa) andSet) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public GCI(int i) {
        this.A00 = i;
        GCJ gcj = new GCJ(null, 2, 0L);
        this.head$volatile = gcj;
        this.tail$volatile = gcj;
        this._availablePermits$volatile = i;
        this.A01 = new GY7(this, 3);
    }
}
