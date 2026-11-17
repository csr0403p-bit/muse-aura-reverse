package X;

/* loaded from: classes5.dex */
public final class CPV implements Runnable {
    public static final String __redex_internal_original_name = "PandoGraphQLConsistencyJNI$subscribeToNodeStore$1";
    public final /* synthetic */ CPW<T> A00;
    public final /* synthetic */ String A01;

    public CPV(CPW<T> cpw, String str) {
        this.A00 = cpw;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CPW.A00(this.A00, FGI.A0M(this.A01, " has no NodeStore form read through a reader fragment."), null);
    }
}
