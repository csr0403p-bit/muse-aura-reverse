package X;

/* loaded from: classes5.dex */
public final class CPU implements Runnable {
    public static final String __redex_internal_original_name = "PandoGraphQLConsistencyJNI$setUpSubscription$1$1$1";
    public final /* synthetic */ CPW<T> A00;
    public final /* synthetic */ Exception A01;

    public CPU(CPW<T> cpw, Exception exc) {
        this.A00 = cpw;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CPW<T> cpw = this.A00;
        Exception exc = this.A01;
        String message = exc.getMessage();
        if (message == null) {
            message = exc.toString();
        }
        CPW.A00(cpw, message, exc);
    }
}
