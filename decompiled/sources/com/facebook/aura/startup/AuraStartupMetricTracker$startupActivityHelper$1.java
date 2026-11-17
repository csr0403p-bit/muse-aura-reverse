package com.facebook.aura.startup;

import X.C3cI;
import X.C7384Etj;
import X.DAe;
import X.DBE;
import X.G0U;
import android.app.Activity;
import com.facebook.aura.main.AuraMainActivity;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.startup.AuraStartupMetricTracker;

/* loaded from: classes5.dex */
public final class AuraStartupMetricTracker$startupActivityHelper$1 implements DBE {
    public final /* synthetic */ AuraStartupMetricTracker this$0;

    @Override // X.DBE
    public String getSurfaceFromActivity(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        if (DAe.A0A.A04 == 3 && C3cI.A0Y(activity).equals(AuraMainActivity.TAG)) {
            AuraStartupMetricTracker auraStartupMetricTracker = this.this$0;
            AuraStartupMetricTracker.Companion companion = AuraStartupMetricTracker.Companion;
            String str = auraStartupMetricTracker.lastSurface;
            if (str != null) {
                HatchStartupQpl.Companion.markerAnnotate("last_surface", str);
                return str;
            }
        }
        return C3cI.A0Y(activity);
    }

    public String getTentativeSurface(Activity activity, G0U<? super Activity, String> g0u) {
        C7384Etj.A0Y(activity, 0);
        return getSurfaceFromActivity(activity);
    }

    public AuraStartupMetricTracker$startupActivityHelper$1(AuraStartupMetricTracker auraStartupMetricTracker) {
        this.this$0 = auraStartupMetricTracker;
    }

    public boolean isSplashActivity(Activity activity) {
        return false;
    }

    public boolean isSplashScreenActive(Activity activity) {
        return false;
    }

    public boolean isTransientActivity(Activity activity) {
        return false;
    }

    public AuraStartupMetricTracker$startupActivityHelper$1() {
    }
}
