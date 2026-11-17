package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* loaded from: classes5.dex */
public final class DnP implements Do0 {
    public String A00;
    public boolean A01 = false;
    public final InterfaceC4913DEg A02;
    public final InterfaceC4913DEg A03;
    public final AbrContextAwareConfiguration A04;
    public final InterfaceC5683DnM A05;

    private double A00(C5730DoP c5730DoP, int i, boolean z) {
        int systemicRiskOtherBitrate;
        AbrContextAwareConfiguration abrContextAwareConfiguration = this.A04;
        double systemicRiskBitrateBoostFactor = abrContextAwareConfiguration.getSystemicRiskBitrateBoostFactor(z);
        if (!abrContextAwareConfiguration.getSystemicRiskEnableDynamicOtherBitrate(z) || (systemicRiskOtherBitrate = c5730DoP.A00) <= 0) {
            systemicRiskOtherBitrate = abrContextAwareConfiguration.getSystemicRiskOtherBitrate(z);
        }
        return (i * systemicRiskBitrateBoostFactor) + systemicRiskOtherBitrate;
    }

    private C5900Drh A01(C5900Drh c5900Drh) {
        AbrContextAwareConfiguration abrContextAwareConfiguration = this.A04;
        boolean z = abrContextAwareConfiguration.abrSetting.honorDefaultBandwidthSR;
        long maxInitialBitrate = abrContextAwareConfiguration.getMaxInitialBitrate();
        if (c5900Drh.A02 != -1 || !z) {
            return c5900Drh;
        }
        C5900Drh c5900Drh2 = new C5900Drh();
        c5900Drh2.A02 = maxInitialBitrate;
        c5900Drh2.A01 = maxInitialBitrate;
        c5900Drh2.A00 = -1;
        c5900Drh2.A03 = null;
        return c5900Drh2;
    }

    private void A02(C6154Dwx c6154Dwx, double d, double d2) {
        if (this.A03 != null) {
            InterfaceC4913DEg interfaceC4913DEg = this.A02;
            AbrContextAwareConfiguration abrContextAwareConfiguration = this.A04;
            long j = (long) d;
            int defaultBwRiskConfPct = abrContextAwareConfiguration.getDefaultBwRiskConfPct();
            String str = this.A00;
            InterfaceC5903Drm interfaceC5903DrmACl = interfaceC4913DEg.ACl();
            interfaceC5903DrmACl.getClass();
            if (defaultBwRiskConfPct != -1 && (defaultBwRiskConfPct <= 0 || defaultBwRiskConfPct >= 100)) {
                defaultBwRiskConfPct = 80;
            }
            C5686DnS.A00(interfaceC4913DEg, abrContextAwareConfiguration, interfaceC5903DrmACl, interfaceC5903DrmACl);
            long jAFJ = interfaceC5903DrmACl.AFJ(str, -1, j);
            long jAFJ2 = interfaceC5903DrmACl.AFJ(str, defaultBwRiskConfPct, j);
            C5480DjH c5480DjHADi = interfaceC5903DrmACl.ADi();
            C5900Drh c5900Drh = new C5900Drh();
            c5900Drh.A02 = jAFJ;
            c5900Drh.A01 = jAFJ2;
            c5900Drh.A00 = defaultBwRiskConfPct;
            c5900Drh.A03 = c5480DjHADi;
            C5900Drh c5900DrhA01 = A01(c5900Drh);
            this.A05.A3Y(BV6.A0o(c6154Dwx), c5900DrhA01.A00, c5900DrhA01.A02, c5900DrhA01.A01, (long) d2, c6154Dwx.A05);
        }
    }

    @Override // X.Do0
    public final boolean AOT() {
        return this.A01;
    }

    @Override // X.Do0
    public final boolean Afa() {
        return false;
    }

    public DnP(InterfaceC4913DEg interfaceC4913DEg, InterfaceC4913DEg interfaceC4913DEg2, AbrContextAwareConfiguration abrContextAwareConfiguration, InterfaceC5683DnM interfaceC5683DnM, String str) {
        this.A05 = interfaceC5683DnM;
        this.A04 = abrContextAwareConfiguration;
        this.A02 = interfaceC4913DEg;
        this.A00 = str;
        this.A03 = interfaceC4913DEg2;
    }

    @Override // X.Do0
    public final /* synthetic */ void A6b(C6154Dwx c6154Dwx) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0331, code lost:
    
        if (r0 > r11) goto L115;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/DoP;[LX/Dwx;Ljava/util/Map<Ljava/lang/String;LX/Dil;>;LX/Dwx;IILX/DnY;)LX/Drg; */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01df A[EDGE_INSN: B:212:0x01df->B:66:0x01df BREAK  A[LOOP:1: B:41:0x012c->B:51:0x019b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e5  */
    @Override // X.Do0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5899Drg AAt(X.C6154Dwx r82, X.C5730DoP r83, X.C5691DnY r84, java.util.Map r85, X.C6154Dwx[] r86, int r87, int r88) {
        /*
            Method dump skipped, instructions count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DnP.AAt(X.Dwx, X.DoP, X.DnY, java.util.Map, X.Dwx[], int, int):X.Drg");
    }
}
