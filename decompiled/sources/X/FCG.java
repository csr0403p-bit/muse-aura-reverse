package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class FCG implements Runnable {
    public static final String __redex_internal_original_name = "SignalsInitialRenderWarmer$WarmingTraversal$scheduleCollectionChildren$1";
    public final /* synthetic */ FCC A00;
    public final /* synthetic */ List<FDW> A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: Multi-variable type inference failed */
    public FCG(FCC fcc, List<? extends FDW> list, boolean z) {
        this.A00 = fcc;
        this.A01 = list;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FCC fcc = this.A00;
        AtomicInteger atomicInteger = fcc.A05;
        if (atomicInteger.get() == fcc.A00) {
            FCA fca = fcc.A01;
            List<FDW> list = this.A01;
            boolean z = this.A02;
            C7769FDy<FCA> c7769FDy = AbstractC7752FDe.A00;
            FCA fcaA01 = c7769FDy.A01();
            boolean z2 = false;
            if (fcaA01 != fca) {
                z2 = true;
                c7769FDy.A02(fca);
            }
            try {
                FCC.A01(fcc, list, z);
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    if (z2) {
                        c7769FDy.A02(fcaA01);
                    }
                }
            }
        }
    }
}
