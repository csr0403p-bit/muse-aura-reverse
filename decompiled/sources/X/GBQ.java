package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public final class GBQ extends GBK implements Hni {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A06 = AtomicIntegerFieldUpdater.newUpdater(GBQ.class, "runningWorkers$volatile");
    public final Object A00;
    public final GBK A01;
    public final int A02;
    public final String A03;
    public final GBX<Runnable> A04;
    public final /* synthetic */ Hni A05;
    public volatile /* synthetic */ int runningWorkers$volatile;

    public static final Runnable A00(GBQ gbq) {
        while (true) {
            GBX<Runnable> gbx = gbq.A04;
            Runnable runnableA01 = gbx.A01();
            if (runnableA01 != null) {
                return runnableA01;
            }
            synchronized (gbq.A00) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A06;
                atomicIntegerFieldUpdater.decrementAndGet(gbq);
                if (gbx.A00() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(gbq);
            }
        }
    }

    private final boolean A01() {
        synchronized (this.A00) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A06;
            if (atomicIntegerFieldUpdater.get(this) >= this.A02) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // X.Hni
    public final HsS AO7(Runnable runnable, C78T c78t, long j) {
        return this.A05.AO7(runnable, c78t, j);
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Hm1<-Lkotlin/Unit;>;)V */
    @Override // X.Hni
    public final void AcD(Hm1 hm1, long j) {
        this.A05.AcD(hm1, j);
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        Runnable runnableA00;
        this.A04.A02(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A06;
        if (atomicIntegerFieldUpdater.get(this) >= this.A02 || !A01() || (runnableA00 = A00(this)) == null) {
            return;
        }
        try {
            GBI.A01(new RunnableC9248GBb(runnableA00, this), this, this.A01);
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // X.GBK
    public final void dispatchYield(C78T c78t, Runnable runnable) {
        Runnable runnableA00;
        this.A04.A02(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A06;
        if (atomicIntegerFieldUpdater.get(this) >= this.A02 || !A01() || (runnableA00 = A00(this)) == null) {
            return;
        }
        try {
            this.A01.dispatchYield(this, new RunnableC9248GBb(runnableA00, this));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // X.GBK
    public final String toString() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A01);
        sbA0w.append(".limitedParallelism(");
        return C8j5.A0X(sbA0w, this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GBQ(String str, GBK gbk, int i) {
        Hni hni;
        this.A05 = (!(gbk instanceof Hni) || (hni = (Hni) gbk) == null) ? AbstractC10475Hkn.A00 : hni;
        this.A01 = gbk;
        this.A02 = i;
        this.A03 = str;
        GBX<Runnable> gbx = new GBX<>();
        gbx._cur$volatile = new GBY(8, false);
        this.A04 = gbx;
        this.A00 = C3cG.A0T();
    }

    @Override // X.GBK
    public final GBK limitedParallelism(int i, String str) {
        GBA.A00(i);
        return i >= this.A02 ? str != null ? new GBE(str, this) : this : super.limitedParallelism(i, str);
    }
}
