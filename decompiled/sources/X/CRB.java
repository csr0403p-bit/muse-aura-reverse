package X;

import com.android.billingclient.ta;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class CRB implements Runnable {
    public static final String __redex_internal_original_name = "sa";
    public CRM A00;

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        CRH crh;
        CRM crm = this.A00;
        if (crm == null || (listenableFuture = crm.A00) == null) {
            return;
        }
        this.A00 = null;
        if (!listenableFuture.isDone()) {
            try {
                ScheduledFuture scheduledFuture = crm.A01;
                crm.A01 = null;
                String strA0J = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (jAbs > 10) {
                            strA0J = FGI.A0J("Timed out (timeout delayed by ", jAbs, " ms after scheduled time)");
                        }
                    } catch (Throwable th) {
                        if (CR9.A00.A05(crm, null, new CRH(new ta(strA0J)))) {
                            CR8.A02(crm, false);
                        }
                        throw th;
                    }
                }
                if (CR9.A00.A05(crm, null, new CRH(new ta(FGI.A0U(strA0J, ": ", String.valueOf(listenableFuture)))))) {
                    CR8.A02(crm, false);
                }
                return;
            } finally {
                listenableFuture.cancel(true);
            }
        }
        Object obj = crm.a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (CR9.A00.A05(crm, null, CR8.A00(listenableFuture))) {
                    CR8.A02(crm, false);
                    return;
                }
                return;
            }
            CRD crd = new CRD(crm, listenableFuture);
            CRF crf = CR9.A00;
            if (crf.A05(crm, null, crd)) {
                try {
                    listenableFuture.addListener(crd, EnumC3452CNy.A01);
                    return;
                } catch (Throwable th2) {
                    try {
                        crh = new CRH(th2);
                    } catch (Error | Exception unused) {
                        crh = CRH.A01;
                    }
                    crf.A05(crm, crd, crh);
                    return;
                }
            }
            obj = crm.a;
        }
        if (obj instanceof CRI) {
            listenableFuture.cancel(((CRI) obj).A01);
        }
    }
}
