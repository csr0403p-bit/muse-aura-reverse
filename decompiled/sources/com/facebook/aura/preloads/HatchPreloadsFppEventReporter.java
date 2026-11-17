package com.facebook.aura.preloads;

import X.AbstractC06907md;
import X.BzK;
import X.C0851A5x;
import X.C3624CZw;
import X.C3cH;
import X.C4oT;
import X.C7384Etj;
import X.C8j3;
import X.C9tI;
import X.CFK;
import X.CZt;
import X.Eu1;
import android.content.Context;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import java.util.List;

/* loaded from: classes5.dex */
public final class HatchPreloadsFppEventReporter {
    public static final HatchPreloadsFppEventReporter INSTANCE = new HatchPreloadsFppEventReporter();

    public final void reportFppStatus(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            if (isEligibleForNextReport() && HatchPreloadsFppEventReporterKt.isFppStatusEventEnabled()) {
                logEvent(CZt.A00(context));
                BzK bzKA02 = BzK.A02(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.PRELOADS_FPP));
                bzKA02.AYp(HatchPreloadsFppEventReporterKt.KEY_LAST_REPORT_TIMESTAMP_MS, System.currentTimeMillis());
                bzKA02.apply();
            }
        } catch (Exception e) {
            CFK.A08(HatchPreloadsFppEventReporterKt.TAG, "Error reporting FPP status event", e);
        }
    }

    private final boolean isEligibleForNextReport() {
        return C8j3.A1Q((Math.max(System.currentTimeMillis() - AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.PRELOADS_FPP).getLong(HatchPreloadsFppEventReporterKt.KEY_LAST_REPORT_TIMESTAMP_MS, 0L), 0L) > C0851A5x.A02(HatchPreloadsFppEventReporterKt.MIN_REPORT_INTERVAL) ? 1 : (Math.max(System.currentTimeMillis() - AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.PRELOADS_FPP).getLong(HatchPreloadsFppEventReporterKt.KEY_LAST_REPORT_TIMESTAMP_MS, 0L), 0L) == C0851A5x.A02(HatchPreloadsFppEventReporterKt.MIN_REPORT_INTERVAL) ? 0 : -1)));
    }

    private final C4oT prefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.PRELOADS_FPP);
    }

    private final void logEvent(C3624CZw c3624CZw) {
        Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("hatch_fpp_status");
        if (eu1AcquireEvent.isSampled()) {
            eu1AcquireEvent.A3P("is_available", c3624CZw.A02);
            eu1AcquireEvent.A3P("fpp_available", Boolean.valueOf(c3624CZw.A0c));
            Boolean bool = c3624CZw.A03;
            eu1AcquireEvent.A3P("is_operational", bool);
            eu1AcquireEvent.A3P("fpp_operational", bool);
            eu1AcquireEvent.A3y("oxygen_preload_id", c3624CZw.A0X);
            eu1AcquireEvent.A3y("fpp_sdk_type", c3624CZw.A0P);
            List<String> list = c3624CZw.A0a;
            eu1AcquireEvent.A3y("fpp_alternative_sdk_types", list != null ? AbstractC06907md.A01(",", list, null) : null);
            List<String> list2 = c3624CZw.A0b;
            eu1AcquireEvent.A3y("fpp_issues", list2 != null ? AbstractC06907md.A01(",", list2, null) : null);
            eu1AcquireEvent.A3P("tos_should_accept", c3624CZw.A04);
            eu1AcquireEvent.A3P("tos_should_show_explicit", c3624CZw.A05);
            eu1AcquireEvent.A3y("app_manager_state", c3624CZw.A0H);
            eu1AcquireEvent.A3y("app_manager_type", c3624CZw.A0I);
            eu1AcquireEvent.A3y("app_manager_origin", c3624CZw.A0G);
            eu1AcquireEvent.A3y("app_manager_install_space", c3624CZw.A0F);
            eu1AcquireEvent.A3y("installer_state", c3624CZw.A0R);
            String str = c3624CZw.A0S;
            eu1AcquireEvent.A3y("installer_type", str);
            eu1AcquireEvent.A3y("installer_origin", c3624CZw.A0Q);
            eu1AcquireEvent.A3y("installer_name", str);
            eu1AcquireEvent.A3y("facebook_services_state", c3624CZw.A0N);
            eu1AcquireEvent.A3y("facebook_services_origin", c3624CZw.A0M);
            Boolean bool2 = c3624CZw.A00;
            eu1AcquireEvent.A3y("facebook_services_operational", bool2 != null ? String.valueOf(bool2.booleanValue()) : null);
            List<String> list3 = c3624CZw.A0Z;
            eu1AcquireEvent.A3y("facebook_services_issues", list3 != null ? AbstractC06907md.A01(",", list3, null) : null);
            eu1AcquireEvent.A3y("partner_id", c3624CZw.A0V);
            eu1AcquireEvent.A3y("app_update_owner", c3624CZw.A0J);
            eu1AcquireEvent.A3y("last_installer", c3624CZw.A0T);
            eu1AcquireEvent.A3f("fpp_sdk_algorithm", c3624CZw.A09);
            eu1AcquireEvent.A3f("tos_accepted_flag_component_enabled", c3624CZw.A0E);
            eu1AcquireEvent.A3f("app_manager_sdk_level", c3624CZw.A06);
            eu1AcquireEvent.A3f("app_manager_version_code", c3624CZw.A07);
            Long l = c3624CZw.A0B;
            eu1AcquireEvent.A3f("installer_sdk_level", l);
            eu1AcquireEvent.A3f("sdk_level", l);
            eu1AcquireEvent.A3f("installer_version_code", c3624CZw.A0C);
            eu1AcquireEvent.A3f("facebook_services_version_code", c3624CZw.A08);
            eu1AcquireEvent.A3f("is_restricted", c3624CZw.A0D);
            eu1AcquireEvent.A3f("google_play_availability", c3624CZw.A0A);
            eu1AcquireEvent.A3P("google_play_enabled", c3624CZw.A01);
            eu1AcquireEvent.A3y("attribution_json", c3624CZw.A0L);
            eu1AcquireEvent.A3y("attribution", c3624CZw.A0K);
            eu1AcquireEvent.A3y("persistent_restricted_mode_bitmask", c3624CZw.A0W);
            eu1AcquireEvent.A3y("first_sim_mccmnc", c3624CZw.A0O);
            eu1AcquireEvent.A3y("latest_sim_mccmnc", c3624CZw.A0U);
            String str2 = c3624CZw.A0Y;
            eu1AcquireEvent.A3f("preloads_stub_growth_exp_group", str2 != null ? C9tI.A0s(str2) : null);
            eu1AcquireEvent.APu();
        }
    }
}
