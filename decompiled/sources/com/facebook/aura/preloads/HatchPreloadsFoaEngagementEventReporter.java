package com.facebook.aura.preloads;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C31u;
import X.C3620CZj;
import X.C3624CZw;
import X.C3cH;
import X.C60O;
import X.CFK;
import X.CZt;
import X.EnumC7554F3f;
import X.Eu1;
import X.InterfaceC7359EnW;
import android.content.Context;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.preloads.MC;

/* loaded from: classes5.dex */
public final class HatchPreloadsFoaEngagementEventReporter {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchPreloadsFoaEngagementEventReporter.class, "isEnabled", "<v#0>", 0);
    public static final HatchPreloadsFoaEngagementEventReporter INSTANCE = new HatchPreloadsFoaEngagementEventReporter();

    public static final boolean reportEvent$lambda$0(C31u<Object, Boolean> c31u) {
        return AnonymousClass001.A1X(C31u.A00(c31u, $$delegatedProperties));
    }

    private final boolean isPreloadsSdkPresent(Context context) {
        return new C3620CZj(context, context.getPackageManager()).A01().A06;
    }

    private final void logEvent(EnumC7554F3f enumC7554F3f, C3624CZw c3624CZw) {
        Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("hatch_foa_engagement");
        if (eu1AcquireEvent.isSampled()) {
            eu1AcquireEvent.A3V(enumC7554F3f, "event_type");
            eu1AcquireEvent.A3y("oxygen_preload_id", c3624CZw.A0X);
            eu1AcquireEvent.A3f("app_manager_version_code", c3624CZw.A07);
            eu1AcquireEvent.A3y("partner_id", c3624CZw.A0V);
            eu1AcquireEvent.A3P("is_available", c3624CZw.A02);
            eu1AcquireEvent.A3P("is_operational", c3624CZw.A03);
            eu1AcquireEvent.A3f("is_restricted", c3624CZw.A0D);
            eu1AcquireEvent.A3y("attribution_json", c3624CZw.A0L);
            eu1AcquireEvent.A3y("attribution", c3624CZw.A0K);
            eu1AcquireEvent.A3y("persistent_restricted_mode_bitmask", c3624CZw.A0W);
            eu1AcquireEvent.APu();
        }
    }

    public final void reportEvent(Context context, EnumC7554F3f enumC7554F3f) {
        AnonymousClass003.A0u(context, enumC7554F3f);
        try {
            if (isPreloadsSdkPresent(context) && reportEvent$lambda$0(AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_app_preloads_sessionless_mcs.android_foa_engagement_event_enabled))) {
                logEvent(enumC7554F3f, CZt.A00(context));
            }
        } catch (Exception e) {
            CFK.A08(HatchPreloadsFoaEngagementEventReporterKt.TAG, "Error reporting FoA engagement event", e);
        }
    }
}
