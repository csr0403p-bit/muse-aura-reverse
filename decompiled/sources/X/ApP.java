package X;

import android.os.Trace;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
public abstract class ApP {
    public static Boolean A00;
    public static final AKH<Executor> A01 = AGO.A01(6);

    public static final void A00(BFM bfm, final ApQ apQ, final C1822Arm c1822Arm, final C2K7 c2k7, final List list) {
        BBI bbi = (BBI) bfm;
        Executor executor = (Executor) AKO.A07(A01, bbi);
        if (executor == null || !A01(apQ.length())) {
            bfm.AgE(-517090505);
            BBI.A0R(bbi, false);
            return;
        }
        bfm.AgE(-518737659);
        final EnumC1820Arj enumC1820Arj = (EnumC1820Arj) AKO.A07(Am0.A0A, bbi);
        final AXN axnA04 = AKO.A04(Am0.A04, bbi);
        try {
            executor.execute(new Runnable() { // from class: X.Aze
                public static final String __redex_internal_original_name = "BasicText_androidKt$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C1822Arm c1822Arm2 = c1822Arm;
                    EnumC1820Arj enumC1820Arj2 = enumC1820Arj;
                    List list2 = list;
                    ApQ apQ2 = apQ;
                    AXN axn = axnA04;
                    C2K7 c2k72 = c2k7;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        BDi bDiA00 = Snapshot.A00(null, null);
                        try {
                            Snapshot snapshotA0A = bDiA00.A0A();
                            try {
                                C1822Arm c1822ArmA01 = AbstractC1823Arn.A01(c1822Arm2, enumC1820Arj2);
                                if (list2 == null) {
                                    list2 = C0881AGi.A00;
                                }
                                C1834Ary c1834Ary = new C1834Ary(apQ2, c1822ArmA01, c2k72, axn, list2);
                                c1834Ary.AHR();
                                c1834Ary.AHj();
                                bDiA00.A0T().A00();
                            } finally {
                                Snapshot.A06(snapshotA0A);
                            }
                        } finally {
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        BBI.A0R(bbi, false);
    }

    public static final boolean A01(int i) {
        if (i >= 8 && i < 1000) {
            Boolean boolValueOf = A00;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                A00 = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
