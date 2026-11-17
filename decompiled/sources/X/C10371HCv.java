package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.vesta.VestaClient;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.HCv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10371HCv {
    public final QuickPerformanceLogger A00;
    public final Hqz A01;
    public final Executor A02;
    public final C10366HCq A03;

    public final ACv A00(Hl3 hl3, String str, String str2, String str3, String str4) {
        String strA0j = str4;
        AnonymousClass003.A0u(str, str2);
        ACv aCv = new ACv();
        HCz hCz = new HCz(this.A00);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = hCz.A01;
        int i = hCz.A00;
        lightweightQuickPerformanceLogger.markerStartWithCancelPolicy(536549438, false, i, -1L, TimeUnit.NANOSECONDS);
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, "use_case", "hatch");
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, "register_entry_point", "vesta_registration_client");
        String strValueOf = String.valueOf(false);
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, "pq_enabled", strValueOf);
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, "pq_registration_enabled", strValueOf);
        C10366HCq c10366HCq = this.A03;
        C10374HCy c10374HCy = new C10374HCy(aCv, hCz);
        if (str4 == null) {
            strA0j = BV5.A0j();
        }
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, "request_uuid", strA0j);
        C10366HCq.A00(hCz, c10374HCy, hl3, c10366HCq, strA0j, str, str2, str3, null, 10, false, false, false, false);
        return aCv;
    }

    public C10371HCv(QuickPerformanceLogger quickPerformanceLogger, Hqz hqz, Executor executor) {
        AnonymousClass003.A0x(executor, quickPerformanceLogger);
        this.A01 = hqz;
        this.A02 = executor;
        this.A00 = quickPerformanceLogger;
        this.A03 = new C10366HCq(new HD8(hqz, executor, VestaClient.getApiVersionNative()));
    }
}
