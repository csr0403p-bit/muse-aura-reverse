package X;

import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.vesta.VestaClientException;
import com.meta.vesta.registrationclient.VestaRegisterException;

/* renamed from: X.HCy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10374HCy {
    public final /* synthetic */ ACv<ADW> A00;
    public final /* synthetic */ HCz A01;

    /* JADX WARN: Incorrect types in method signature: (LX/HCz;LX/ACv<LX/ADW;>;)V */
    public C10374HCy(ACv aCv, HCz hCz) {
        this.A01 = hCz;
        this.A00 = aCv;
    }

    public static void A00(VestaClientException vestaClientException, HCz hCz, C10374HCy c10374HCy, String str) {
        CFK.A08("VestaRegisterModule", str, vestaClientException);
        EnumC10335Gup enumC10335Gup = vestaClientException.error;
        String strName = enumC10335Gup.name();
        int iOrdinal = enumC10335Gup.ordinal();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = hCz.A01;
        int i = hCz.A00;
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, "vesta_client_error_code", iOrdinal);
        lightweightQuickPerformanceLogger.markerPoint(536549438, i, "vesta_client_error");
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, strName);
        c10374HCy.A01(new VestaRegisterException(null, HD3.A08, vestaClientException));
    }

    public final void A01(VestaRegisterException vestaRegisterException) {
        HCz hCz = this.A01;
        String message = vestaRegisterException.getMessage();
        if (message == null) {
            message = "Unknown Vesta registration failure";
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = hCz.A01;
        int i = hCz.A00;
        lightweightQuickPerformanceLogger.markerPoint(536549438, i, "vesta_registration_failed");
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, "vesta_registration_error", message);
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, message);
        lightweightQuickPerformanceLogger.markerAnnotate(536549438, i, "error_code", vestaRegisterException.A00().toString());
        lightweightQuickPerformanceLogger.markerEnd(536549438, i, (short) 3);
        this.A00.A00(new ADU(vestaRegisterException.A00()));
    }
}
