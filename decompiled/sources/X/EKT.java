package X;

import androidx.work.impl.WorkerWrapper;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EKT implements Runnable {
    public static final String __redex_internal_original_name = "StopWorkRunnable";
    public final int A00;
    public final EKU A01;
    public final EMx A02;
    public final boolean A03;

    public EKT(EKU eku, EMx eMx, int i, boolean z) {
        C7384Etj.A0Y(eku, 0);
        this.A01 = eku;
        this.A02 = eMx;
        this.A03 = z;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean zA01;
        WorkerWrapper workerWrapperA00;
        boolean z = this.A03;
        EKU eku = this.A01;
        EMx eMx = this.A02;
        int i = this.A00;
        if (!z) {
            str = eMx.A00.A01;
            synchronized (eku.A09) {
                zA01 = false;
                if (eku.A06.get(str) != null) {
                    EK9.A00().A02(EKU.A0B, FGI.A0U("Ignored stopWork. WorkerWrapper ", str, " is in foreground"));
                } else {
                    Set setA10 = BV4.A10(str, eku.A07);
                    if (setA10 != null && setA10.contains(eMx)) {
                        workerWrapperA00 = EKU.A00(eku, str);
                    }
                }
            }
            EK9 ek9A00 = EK9.A00();
            String strA01 = EK9.A01(__redex_internal_original_name);
            StringBuilder sbA0x = C3cI.A0x("StopWorkRunnable for ", str);
            sbA0x.append("; Processor.stopWork = ");
            sbA0x.append(zA01);
            ek9A00.A02(strA01, C60P.A1O(", reason: ", sbA0x, i));
        }
        str = eMx.A00.A01;
        synchronized (eku.A09) {
            workerWrapperA00 = EKU.A00(eku, str);
        }
        zA01 = EKU.A01(workerWrapperA00, str, i);
        EK9 ek9A002 = EK9.A00();
        String strA012 = EK9.A01(__redex_internal_original_name);
        StringBuilder sbA0x2 = C3cI.A0x("StopWorkRunnable for ", str);
        sbA0x2.append("; Processor.stopWork = ");
        sbA0x2.append(zA01);
        ek9A002.A02(strA012, C60P.A1O(", reason: ", sbA0x2, i));
    }
}
