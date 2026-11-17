package X;

/* renamed from: X.EiX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7211EiX implements Runnable {
    public static final String __redex_internal_original_name = "AbstractDataSource$1";
    public final /* synthetic */ AbstractC7206EiO A00;
    public final /* synthetic */ InterfaceC7248EjS A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public RunnableC7211EiX(AbstractC7206EiO abstractC7206EiO, InterfaceC7248EjS interfaceC7248EjS, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = interfaceC7248EjS;
        this.A02 = z2;
        this.A00 = abstractC7206EiO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A03) {
            this.A01.onFailure(this.A00);
            return;
        }
        boolean z = this.A02;
        InterfaceC7248EjS interfaceC7248EjS = this.A01;
        AbstractC7206EiO abstractC7206EiO = this.A00;
        if (z) {
            return;
        }
        interfaceC7248EjS.onNewResult(abstractC7206EiO);
    }
}
