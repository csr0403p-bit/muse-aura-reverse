package X;

/* loaded from: classes5.dex */
public final class CQL implements Runnable {
    public static final String __redex_internal_original_name = "PandoQueryExecutor$executeInner$1$3";
    public final /* synthetic */ CPS A00;
    public final /* synthetic */ IllegalStateException A01;

    public CQL(CPS cps, IllegalStateException illegalStateException) {
        this.A00 = cps;
        this.A01 = illegalStateException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CPS cps = this.A00;
        if (cps != null) {
            cps.invoke(this.A01);
        }
    }
}
