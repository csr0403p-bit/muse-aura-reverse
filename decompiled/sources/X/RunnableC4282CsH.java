package X;

/* renamed from: X.CsH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC4282CsH implements Runnable {
    public static final String __redex_internal_original_name = "zacb";
    public final /* synthetic */ InterfaceC4283CsI A00;
    public final /* synthetic */ C4200Cpj A01;

    @Override // java.lang.Runnable
    public final void run() {
        C4200Cpj c4200Cpj = this.A01;
        InterfaceC4283CsI interfaceC4283CsI = this.A00;
        Object obj = c4200Cpj.A02;
        if (obj != null) {
            try {
                interfaceC4283CsI.ARP(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    public /* synthetic */ RunnableC4282CsH(InterfaceC4283CsI interfaceC4283CsI, C4200Cpj c4200Cpj) {
        this.A01 = c4200Cpj;
        this.A00 = interfaceC4283CsI;
    }
}
