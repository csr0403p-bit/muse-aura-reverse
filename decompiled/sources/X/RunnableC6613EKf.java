package X;

import androidx.work.impl.WorkerWrapper;

/* renamed from: X.EKf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6613EKf implements Runnable {
    public static final String __redex_internal_original_name = "SystemForegroundDispatcher$1";
    public final /* synthetic */ EKZ A00;
    public final /* synthetic */ String A01;

    public RunnableC6613EKf(final EKZ this$0, final String val$workSpecId) {
        this.A00 = this$0;
        this.A01 = val$workSpecId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EKE eke;
        EKZ ekz = this.A00;
        EKU eku = ekz.A00.A03;
        String str = this.A01;
        synchronized (eku.A09) {
            WorkerWrapper workerWrapper = eku.A06.get(str);
            eke = (workerWrapper == null && (workerWrapper = eku.A05.get(str)) == null) ? null : workerWrapper.A05;
        }
        if (eke == null || !(!EKL.A09.equals(eke.A0B))) {
            return;
        }
        synchronized (ekz.A06) {
            ekz.A09.put(AbstractC6646ELq.A00(eke), eke);
            C6625EKu c6625EKu = ekz.A04;
            GBK gbk = ((C6616EKj) ekz.A05).A04;
            AnonymousClass003.A0v(c6625EKu, gbk);
            ekz.A08.put(AbstractC6646ELq.A00(eke), AnonymousClass001.A11(new EZB(ekz, eke, c6625EKu, null, 6), Hxb.A02(gbk)));
        }
    }
}
