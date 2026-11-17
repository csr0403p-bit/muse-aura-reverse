package X;

import com.facebook.acra.anr.ANRReportProvider;
import java.util.HashMap;

/* renamed from: X.C5e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3247C5e implements ANRReportProvider {
    public final /* synthetic */ C58 A00;

    public C3247C5e(C58 c58) {
        this.A00 = c58;
    }

    @Override // com.facebook.acra.anr.ANRReportProvider
    public final boolean shouldCollectAndUploadANRReports() {
        return true;
    }

    @Override // com.facebook.acra.anr.ANRReportProvider
    public final void reportSoftError(String str, Throwable th) {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("anr_error_msg", str);
        C2Q.A00().AT9("ANRReportProvider", th, mapA0u);
    }
}
