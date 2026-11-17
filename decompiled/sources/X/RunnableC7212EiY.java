package X;

/* renamed from: X.EiY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7212EiY implements Runnable {
    public static final String __redex_internal_original_name = "AbstractDataSource$2";
    public final /* synthetic */ AbstractC7206EiO A00;
    public final /* synthetic */ InterfaceC7248EjS A01;

    public RunnableC7212EiY(AbstractC7206EiO abstractC7206EiO, InterfaceC7248EjS interfaceC7248EjS) {
        this.A01 = interfaceC7248EjS;
        this.A00 = abstractC7206EiO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.onProgressUpdate(this.A00);
    }
}
