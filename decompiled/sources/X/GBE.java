package X;

/* loaded from: classes6.dex */
public final class GBE extends GBK implements Hni {
    public final String A00;
    public final GBK A01;
    public final /* synthetic */ Hni A02;

    @Override // X.Hni
    public final HsS AO7(Runnable runnable, C78T c78t, long j) {
        return this.A02.AO7(runnable, c78t, j);
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Hm1<-Lkotlin/Unit;>;)V */
    @Override // X.Hni
    public final void AcD(Hm1 hm1, long j) {
        this.A02.AcD(hm1, j);
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        this.A01.dispatch(c78t, runnable);
    }

    @Override // X.GBK
    public final void dispatchYield(C78T c78t, Runnable runnable) {
        this.A01.dispatchYield(c78t, runnable);
    }

    @Override // X.GBK
    public final boolean isDispatchNeeded(C78T c78t) {
        return this.A01.isDispatchNeeded(c78t);
    }

    @Override // X.GBK
    public final String toString() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GBE(String str, GBK gbk) {
        Hni hni;
        this.A02 = (!(gbk instanceof Hni) || (hni = (Hni) gbk) == null) ? AbstractC10475Hkn.A00 : hni;
        this.A01 = gbk;
        this.A00 = str;
    }
}
