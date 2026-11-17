package X;

import java.io.Serializable;

/* renamed from: X.Dzh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6285Dzh implements Serializable {
    public static final C6285Dzh A00;
    public final C6295Dzr audioReservationPolicy;
    public final C6294Dzq audioVideoCoordinationPolicy;
    public final C6290Dzm bufferPolicy;
    public final C6293Dzp cadencePolicy;
    public final C6287Dzj congestionPricingPolicy;
    public final C6049Duk diagnostics;
    public final BZM dutyCycleBounds;
    public final boolean fallbackWhenNetworkCongested;
    public final boolean isCachedMediaCreditEnabled;
    public final boolean isEnabled;
    public final double prefetchMaximumDutyCycle;
    public final double prefetchTargetDutyCycle;
    public final C6286Dzi readinessPolicy;
    public final BZL segmentPolicy;
    public final C6292Dzo switchPolicy;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        double d = 0.0d;
        A00 = new C6285Dzh(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, d, d, 32767, z, z, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C6285Dzh() {
        boolean z = false;
        double d = 0.0d;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, d, d, 32767, z, z, z);
    }

    public /* synthetic */ C6285Dzh(C6295Dzr c6295Dzr, C6294Dzq c6294Dzq, C6290Dzm c6290Dzm, C6293Dzp c6293Dzp, C6287Dzj c6287Dzj, C6049Duk c6049Duk, BZM bzm, C6286Dzi c6286Dzi, BZL bzl, C6292Dzo c6292Dzo, C06H c06h, double d, double d2, int i, boolean z, boolean z2, boolean z3) {
        BZM bzm2 = new BZM(null, 0.0d, 0.0d, 3);
        C6286Dzi c6286Dzi2 = new C6286Dzi(null, null, null, null, 15, false);
        C6290Dzm c6290Dzm2 = new C6290Dzm(null, null, 1023, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false);
        BZL bzl2 = new BZL(null, 0.0d, 127, 0L, 0L, 0L, false, false, false);
        C6292Dzo c6292Dzo2 = new C6292Dzo(0L, false);
        C6295Dzr c6295Dzr2 = new C6295Dzr(false, 0L, 0L);
        C6294Dzq c6294Dzq2 = new C6294Dzq(false);
        C6293Dzp c6293Dzp2 = new C6293Dzp(1000L, 0L);
        C6049Duk c6049Duk2 = new C6049Duk(true, false, false);
        C6287Dzj c6287Dzj2 = new C6287Dzj(null, null, null, 3);
        this.isEnabled = false;
        this.dutyCycleBounds = bzm2;
        this.prefetchTargetDutyCycle = 0.0d;
        this.prefetchMaximumDutyCycle = 0.0d;
        this.readinessPolicy = c6286Dzi2;
        this.bufferPolicy = c6290Dzm2;
        this.segmentPolicy = bzl2;
        this.switchPolicy = c6292Dzo2;
        this.audioReservationPolicy = c6295Dzr2;
        this.audioVideoCoordinationPolicy = c6294Dzq2;
        this.cadencePolicy = c6293Dzp2;
        this.diagnostics = c6049Duk2;
        this.isCachedMediaCreditEnabled = false;
        this.fallbackWhenNetworkCongested = false;
        this.congestionPricingPolicy = c6287Dzj2;
    }
}
