package X;

import android.os.Trace;

/* loaded from: classes5.dex */
public final class DmS implements Runnable {
    public static final String __redex_internal_original_name = "HeroServicePlayer$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ DmR A09;
    public final /* synthetic */ Dlw A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public DmS(DmR dmR, Dlw dlw, Integer num, String str, String str2, String str3, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A09 = dmR;
        this.A0B = num;
        this.A01 = i;
        this.A00 = i2;
        this.A0C = str;
        this.A03 = j;
        this.A07 = j2;
        this.A06 = j3;
        this.A08 = j4;
        this.A02 = j5;
        this.A0G = z;
        this.A04 = j6;
        this.A05 = j7;
        this.A0I = z2;
        this.A0E = str2;
        this.A0H = z3;
        this.A0F = z4;
        this.A0D = str3;
        this.A0A = dlw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Trace.beginSection("HeroServicePlayer.buildRenderersCompleted");
        try {
            Dlw dlw = this.A0A;
            Dlw.A0s(dlw, "buildRenderersCompleted starts");
            DmR dmR = this.A09;
            if (Dlw.A1E(dmR, dlw)) {
                dlw.A1R = true;
                dlw.A14 = this.A0B;
                dlw.A0D = this.A01;
                dlw.A0C = this.A00;
                dlw.A17 = this.A0C;
                Dq8 dq8 = dlw.A2d;
                long j = this.A03;
                long j2 = this.A07;
                long j3 = this.A06;
                long j4 = this.A08;
                long jA01 = Dlw.A01(dlw);
                long j5 = this.A02;
                boolean z = this.A0G;
                long j6 = this.A04;
                long j7 = this.A05;
                boolean z2 = this.A0I;
                String str = this.A0E;
                Dq8 dq82 = new Dq8(str, dq8.A00, j, j2, j3, j4, dq8.A02, jA01, j5, j6, j7, z, z2);
                if (C4904DDx.A00(dmR) && dlw.A2C.loggerSDKConfig.mEnableDashLiveStartedBufferingDiagnostics) {
                    long jA012 = Dlw.A01(dlw);
                    if (j5 <= 0) {
                        j5 = jA012;
                    }
                    Dq8 dq83 = dlw.A1i ? dlw.A0q : Dq8.A0D;
                    dlw.A0q = new Dq8(str, dq83.A00, j, j2, j3, j4, dq83.A02, jA012, j5, j6, j7, z, z2);
                    dlw.A1i = true;
                }
                dlw.A1X = this.A0H;
                dlw.A1T = this.A0F;
                dlw.A1A = this.A0D;
                Dlw.A0U(dlw.A0f, dlw, dq82, 24);
                Dlw.A0l(dlw);
                Dlw.A0n(dlw, dlw.A03);
                Dlw.A0o(dlw, dlw.A02, dlw.A01);
                dlw.A2j.A0U(dlw.A02);
                Dlw.A0p(dlw, dlw.A04);
                Dlw.A0w(dlw, false);
            } else {
                Dlw.A0s(dlw, "skipped buildRenderersCompleted because of non-matching request");
            }
        } finally {
            Trace.endSection();
        }
    }
}
