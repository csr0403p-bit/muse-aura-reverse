package com.facebook.aura.preloads;

import X.AbstractC0852A5y;
import X.AnonymousClass001;
import X.C31u;
import X.C60O;
import X.F24;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.preloads.MC;

/* loaded from: classes5.dex */
public abstract class HatchPreloadsFppEventReporterKt {
    public static final String KEY_LAST_REPORT_TIMESTAMP_MS = "last_report_timestamp_ms";
    public static final String TAG = "HatchPreloadsFpp";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchPreloadsFppEventReporterKt.class, "isFppStatusEventEnabled", "isFppStatusEventEnabled()Z", 1);
    public static final long MIN_REPORT_INTERVAL = AbstractC0852A5y.A01(F24.A03, 10);
    public static final C31u isFppStatusEventEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_app_preloads.android_fpp_status_event_enabled);

    public static final boolean isFppStatusEventEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isFppStatusEventEnabled$delegate, $$delegatedProperties));
    }
}
