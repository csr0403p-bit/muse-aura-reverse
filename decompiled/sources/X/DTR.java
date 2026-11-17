package X;

/* loaded from: classes5.dex */
public final class DTR implements Runnable {
    public static final String __redex_internal_original_name = "PrivateMaxEntriesMap$RemovalTask";
    public final DTP<K, V> A00;
    public final /* synthetic */ DTL A01;

    /* JADX WARN: Multi-variable type inference failed */
    public DTR(DTP dtp, DTP<K, V> dtp2) {
        this.A01 = dtp2;
        this.A00 = dtp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DTL dtl = this.A01;
        DTM<DTP<K, V>> dtm = dtl.evictionDeque;
        InterfaceC5064DTa<?> interfaceC5064DTa = this.A00;
        if (dtm.A04(interfaceC5064DTa)) {
            DTM.A03(interfaceC5064DTa, dtm);
        }
        dtl.A04(interfaceC5064DTa);
    }
}
