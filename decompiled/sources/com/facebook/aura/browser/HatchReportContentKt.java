package com.facebook.aura.browser;

import X.AnonymousClass003;
import X.FGI;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class HatchReportContentKt {
    public static final String REPORT_CONTENT_URL = "https://muse.ai/api/hatch/report-content";

    public static final void openReportContentForm(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        AuraBrowserLauncherKt.openBrowser(FGI.A0M("https://muse.ai/api/hatch/report-content?shortcode=", str), context);
    }
}
