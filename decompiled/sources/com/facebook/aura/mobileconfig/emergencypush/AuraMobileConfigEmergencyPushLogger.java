package com.facebook.aura.mobileconfig.emergencypush;

import X.AbstractC4990DKm;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3143BzU;
import X.C3339CFj;
import X.C3341CFl;
import X.C3cH;
import X.C4994DKs;
import X.C7384Etj;
import X.CA3;
import X.CFK;
import X.CUB;
import X.DKr;
import X.DRZ;
import X.Eu1;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public final class AuraMobileConfigEmergencyPushLogger {
    public static final AuraMobileConfigEmergencyPushLogger INSTANCE = new AuraMobileConfigEmergencyPushLogger();

    private final boolean shouldLog(DKr dKr) {
        if (dKr.A04) {
            return true;
        }
        String str = dKr.A03;
        return !(str == null || str.length() == 0) || CUB.A01.A00() <= 0.01d;
    }

    private final String toYesNo(boolean z) {
        return z ? "Yes" : "No";
    }

    private final String debugString(DRZ drz, List<? extends C4994DKs> list) {
        C3143BzU c3143BzUA0A = drz.A0A();
        String strA00 = "";
        if (c3143BzUA0A != null && CUB.A01.A00() <= 0.05d) {
            try {
                C3341CFl c3341CFlA03 = AbstractC4990DKm.A00.A03();
                C3341CFl c3341CFlA01 = C3339CFj.A01(c3341CFlA03, "configs");
                for (C4994DKs c4994DKs : list) {
                    List<CA3> listA00 = c3143BzUA0A.A00(c4994DKs.A03);
                    c4994DKs.A01 = AbstractC4990DKm.A01(c4994DKs.A08, listA00, true);
                    c4994DKs.A00 = AbstractC4990DKm.A01(c4994DKs.A07, listA00, true);
                    C3341CFl c3341CFlA012 = C3339CFj.A01(c3341CFlA01, String.valueOf(c4994DKs.A04));
                    C3341CFl.A00(c3341CFlA012, Boolean.valueOf(c4994DKs.A0B), VoiceCallConnectionTracker.END_REASON_RESTART);
                    C3341CFl.A00(c3341CFlA012, Integer.valueOf(c4994DKs.A05), "delay_restart");
                    C3341CFl.A00(c3341CFlA012, Boolean.valueOf(c4994DKs.A09), "force_refresh");
                    C3341CFl.A00(c3341CFlA012, Integer.valueOf(c4994DKs.A02), "cached_version");
                    C3341CFl.A00(c3341CFlA012, Integer.valueOf(c4994DKs.A06), "latest_version");
                    C3341CFl.A00(c3341CFlA012, Boolean.valueOf(c4994DKs.A0A), "param_values_changed");
                    C3341CFl.A00(c3341CFlA012, AnonymousClass001.A0h(), "exists_in_cache");
                    C3341CFl.A00(c3341CFlA012, c4994DKs.A01, "latest_values");
                    C3341CFl.A00(c3341CFlA012, c4994DKs.A00, "cached_values");
                }
                strA00 = AbstractC4990DKm.A00(c3341CFlA03);
            } catch (IOException e) {
                CFK.A08("MobileConfigDebugUtil", "Failed to generate ep per config JSON", e);
                strA00 = "Unknown";
            }
            C7384Etj.A0U(strA00);
        }
        return strA00;
    }

    public final void log(DRZ drz, DKr dKr, List<? extends C4994DKs> list) {
        AnonymousClass005.A0x(drz, dKr, list);
        if (shouldLog(dKr)) {
            Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("mobile_config_emergency_push_check_complete");
            if (eu1AcquireEvent.isSampled()) {
                eu1AcquireEvent.A3y("configs_causing_restart", dKr.A02);
                eu1AcquireEvent.A3y("restart_needed", dKr.A04 ? "Yes" : "No");
                eu1AcquireEvent.A3y("shadowing", "No");
                eu1AcquireEvent.A3y("debug_string", debugString(drz, list));
                eu1AcquireEvent.A3y("handler_language", "Java");
                eu1AcquireEvent.A3y("is_background", AuraAppLifecycleManager.INSTANCE.canPresentInteractiveUi() ^ true ? "Yes" : "No");
                Double dValueOf = Double.valueOf(-1.0d);
                eu1AcquireEvent.A3U(dValueOf, "time_since_foreground");
                eu1AcquireEvent.A3U(dValueOf, "time_since_launch");
                eu1AcquireEvent.A3y("configs_force_refreshed", dKr.A03);
                eu1AcquireEvent.A3y("relogin_enabled", "No");
                eu1AcquireEvent.A3f("restart_delay", Long.valueOf(dKr.A00));
                eu1AcquireEvent.A3f("restart_delay_including_shadow", Long.valueOf(dKr.A01));
                eu1AcquireEvent.A3y("restart_needed_including_shadow", dKr.A05 ? "Yes" : "No");
                eu1AcquireEvent.APu();
            }
        }
    }
}
