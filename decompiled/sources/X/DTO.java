package X;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class DTO implements Runnable {
    public static final String __redex_internal_original_name = "PrivateMaxEntriesMap$AddTask";
    public final DTP<K, V> A00;
    public final /* synthetic */ DTL A01;

    /* JADX WARN: Incorrect types in method signature: (LX/DTP<TK;TV;>;I)V */
    public DTO(DTP dtp, DTL dtl) {
        this.A01 = dtl;
        this.A00 = dtp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DTL dtl = this.A01;
        AtomicLong atomicLong = dtl.weightedSize;
        atomicLong.lazySet(atomicLong.get() + 1);
        DTP<K, V> dtp = this.A00;
        if (((DTW) dtp.get()).A00 > 0) {
            DTM<DTP<K, V>> dtm = dtl.evictionDeque;
            if (!dtm.A04(dtp)) {
                DTM.A02(dtp, dtm);
            }
            dtl.A03();
        }
    }
}
