package X;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class DTQ implements Runnable {
    public static final String __redex_internal_original_name = "PrivateMaxEntriesMap$UpdateTask";
    public final int A00;
    public final DTP<K, V> A01;
    public final /* synthetic */ DTL A02;

    /* JADX WARN: Multi-variable type inference failed */
    public DTQ(DTP dtp, DTP<K, V> dtp2, int i) {
        this.A02 = dtp2;
        this.A00 = i;
        this.A01 = dtp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DTL dtl = this.A02;
        AtomicLong atomicLong = dtl.weightedSize;
        atomicLong.lazySet(atomicLong.get() + this.A00);
        InterfaceC5064DTa<?> interfaceC5064DTa = this.A01;
        DTM<DTP<K, V>> dtm = dtl.evictionDeque;
        if (dtm.A04(interfaceC5064DTa) && interfaceC5064DTa != dtm.A01) {
            DTM.A03(interfaceC5064DTa, dtm);
            DTM.A02(interfaceC5064DTa, dtm);
        }
        dtl.A03();
    }
}
