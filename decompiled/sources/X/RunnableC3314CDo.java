package X;

import com.facebook.voltron.download.google.GooglePlayDownloader$CancelledException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CDo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3314CDo implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayDownloader$getRunnable$1";
    public final /* synthetic */ CE8 A00;
    public final /* synthetic */ C3313CDn A01;

    public RunnableC3314CDo(CE8 ce8, C3313CDn c3313CDn) {
        this.A01 = c3313CDn;
        this.A00 = ce8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DK9 dk9;
        long jMax;
        try {
            C3313CDn c3313CDn = this.A01;
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            CE8 ce8 = this.A00;
            Iterator<String> it = ce8.A01.A01.iterator();
            boolean z = false;
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (!CDH.A04.A00().A03(strA0j)) {
                    arrayListA0h.add(strA0j);
                    z = true;
                }
            }
            if (z) {
                C3315CDp c3315CDp = new C3315CDp(ce8, c3313CDn);
                CEU ceu = new CEU(arrayListA0h, arrayListA0h2);
                C3103ByQ c3103ByQ = c3313CDn.A07;
                synchronized (c3103ByQ) {
                    try {
                        dk9 = c3103ByQ.A01;
                        long jNow = dk9.now();
                        long j = c3103ByQ.A00;
                        jMax = Math.max(jNow, j);
                        c3103ByQ.A00 = Math.max(j, 2000 + jMax);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jNow2 = jMax - dk9.now();
                if (jNow2 > 0) {
                    try {
                        c3103ByQ.A02.invoke(Long.valueOf(jNow2));
                    } catch (InterruptedException e) {
                        CFK.A08("PlayRequestThrottle", "Interrupted while waiting between subsequent download attempts", e);
                    }
                }
                CSA<Integer> csaAg7 = c3313CDn.A0A.Ag7(ceu);
                C7384Etj.A0U(csaAg7);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Executor executor = c3313CDn.A0D;
                csaAg7.A09(c3315CDp, executor);
                csaAg7.A09(new F4W(countDownLatch, 1), executor);
                try {
                    countDownLatch.await(30L, TimeUnit.SECONDS);
                } catch (InterruptedException e2) {
                    BzX.A00("GooglePlayDownloader", "Interrupted while waiting for session ID", e2);
                }
                if (!csaAg7.A0B()) {
                    synchronized (c3315CDp.A02) {
                        try {
                            c3315CDp.A00 = true;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ce8.A00.A00(new GooglePlayDownloader$CancelledException(FGI.A0M("Never received a response from Google downloading modules: ", C60O.A0o(ceu))));
                }
            } else {
                C3320CDz<C3310CDj> c3320CDz = ce8.A00;
                c3320CDz.A00.A06(new C3310CDj(null, null, 1));
            }
            synchronized (c3313CDn) {
                c3313CDn.A02 = false;
                C3313CDn.A02(c3313CDn);
            }
        } catch (Throwable th3) {
            C3313CDn c3313CDn2 = this.A01;
            synchronized (c3313CDn2) {
                c3313CDn2.A02 = false;
                C3313CDn.A02(c3313CDn2);
                throw th3;
            }
        }
    }
}
