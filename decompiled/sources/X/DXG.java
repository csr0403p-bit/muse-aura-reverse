package X;

import android.os.SystemClock;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* loaded from: classes5.dex */
public final class DXG extends DXL {
    public static DXG A03;
    public static final DXR A04 = new DXR();
    public C5092DXa A00;
    public String A01;
    public final E7C A02;

    @Override // X.DXL
    public final synchronized void A01(AbrContextAwareConfiguration abrContextAwareConfiguration, DXN dxn, boolean z, boolean z2) {
        boolean zA1X;
        C5092DXa c5092DXa;
        try {
            C0Q.A01("onTransferFinished");
            super.A01(abrContextAwareConfiguration, dxn, z, z2);
            COW cow = COW.A08;
            synchronized (cow) {
                try {
                    zA1X = AnonymousClass002.A1X(cow.A01);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zA1X && (c5092DXa = this.A00) != null) {
                c5092DXa.A01();
            }
            try {
                VideoBandwidthEstimate videoBandwidthEstimateA01 = this.A05.A01(abrContextAwareConfiguration);
                long jAFL = videoBandwidthEstimateA01.A06;
                if (jAFL >= 0) {
                    long jAFM = videoBandwidthEstimateA01.A00;
                    if (jAFM > 0) {
                        if (abrContextAwareConfiguration != null && abrContextAwareConfiguration.abrSetting.enableConfRiskBwCache) {
                            EnumC5744Dof enumC5744Dof = EnumC5744Dof.A05;
                            jAFM = videoBandwidthEstimateA01.AFM(null, abrContextAwareConfiguration.getHighBwRiskConfPct(enumC5744Dof));
                            jAFL = videoBandwidthEstimateA01.AFL(abrContextAwareConfiguration.getHighBwRiskConfPct(enumC5744Dof));
                        }
                        if (jAFL >= 0 && jAFM > 0) {
                            synchronized (cow) {
                                try {
                                    String str = cow.A03;
                                    if (str != null) {
                                        COX cox = new COX(str, -1L, jAFL, SystemClock.elapsedRealtime(), jAFM);
                                        cow.A02 = cox;
                                        cow.A07.put(str, cox);
                                        C8C c8c = cow.A01;
                                        if (c8c != null && (cow.A05 || SystemClock.elapsedRealtime() - cow.A00 >= 120000)) {
                                            c8c.A00(COW.A00(cow));
                                            cow.A00 = SystemClock.elapsedRealtime();
                                            if (cow.A04) {
                                                CFK.A06(COW.A09, C60P.A1M(" for network: ", cow.A03, C3cG.A0f(cow.A02, "Writing cached bwe to disk: ")));
                                            }
                                            cow.A05 = false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
            }
        } finally {
            C0Q.A00();
        }
    }

    public static final synchronized DXG A00() {
        DXG dxg;
        synchronized (A04) {
            dxg = A03;
            if (dxg == null) {
                dxg = new DXG(E7C.A00);
                A03 = dxg;
            }
        }
        return dxg;
    }

    public final synchronized void A02(C5686DnS c5686DnS) {
        boolean zA1X;
        COX cox;
        int i;
        C5092DXa c5092DXa;
        C7384Etj.A0Y(c5686DnS, 0);
        int i2 = (int) c5686DnS.initialCachedBwSizeBytes;
        boolean z = c5686DnS.enableInitialBWStdDevFix;
        try {
            C0Q.A01("resetTransferAccumulator");
            try {
                this.A04 = new C5339Dga();
                super.A02 = -1L;
                DXM dxm = this.A05;
                dxm.A00 = new VideoBandwidthEstimate();
                dxm.A01 = false;
                dxm.A03.clear();
                dxm.A04.clear();
                this.A03 = 0L;
                super.A01 = 0;
                super.A00 = 0;
                COW cow = COW.A08;
                synchronized (cow) {
                    try {
                        zA1X = AnonymousClass002.A1X(cow.A01);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zA1X && (c5092DXa = this.A00) != null) {
                    String strA01 = c5092DXa.A01();
                    this.A01 = strA01;
                    cow.A02(strA01);
                }
                synchronized (cow) {
                    try {
                        cox = cow.A02;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AbstractC3426CMt.A03("SharedTransferAccumulator", "Resetting Shared Accumulator. currentConnection: %s record: %s", this.A01, cox);
                if (cox != null) {
                    long j = cox.A01;
                    if (j > 0) {
                        int i3 = (int) cox.A03;
                        if (i2 <= 0) {
                            i2 = 10000;
                        }
                        int i4 = (int) ((i2 * 8000) / j);
                        if (i4 == 0) {
                            i4 = 1;
                        }
                        AbstractC3426CMt.A03("SharedTransferAccumulator", "Initializing with ttfb: %d transfer duration: %d", Integer.valueOf(i3), Integer.valueOf(i4));
                        if (z) {
                            i = i3;
                        } else {
                            j = -1;
                            i = -1;
                        }
                        super.A01(null, new DXN(0, i3, i4, i2, 1L, j, i, -1L, -1L, -1L, false, false, false), true, true);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            C0Q.A00();
        }
    }

    public DXG(E7C e7c) {
        this.A02 = e7c;
    }
}
