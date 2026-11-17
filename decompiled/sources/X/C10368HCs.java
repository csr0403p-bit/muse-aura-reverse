package X;

import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.meta.vesta.registrationclient.VestaRegisterException;

/* renamed from: X.HCs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10368HCs {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ HDF A02;
    public final /* synthetic */ HCz A03;
    public final /* synthetic */ C10374HCy A04;
    public final /* synthetic */ Hl3 A05;
    public final /* synthetic */ C10366HCq A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ byte[] A0G;

    public C10368HCs(HDF hdf, HCz hCz, C10374HCy c10374HCy, Hl3 hl3, C10366HCq c10366HCq, String str, String str2, String str3, String str4, String str5, byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = hCz;
        this.A0F = z;
        this.A01 = i;
        this.A06 = c10366HCq;
        this.A04 = c10374HCy;
        this.A05 = hl3;
        this.A0A = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A0B = str4;
        this.A0C = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A07 = str5;
        this.A00 = i2;
        this.A02 = hdf;
        this.A0G = bArr;
    }

    public final void A00(Throwable th) {
        HCz hCz = this.A03;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = hCz.A01;
        int i = hCz.A00;
        lightweightQuickPerformanceLogger.markerPoint(536549438, i, "init_and_begin_register_network_call_error");
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, message);
        this.A04.A01(new VestaRegisterException(null, HD3.A06, th));
    }
}
