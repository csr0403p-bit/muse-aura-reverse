package com.facebook.aura.localbrowser.config;

import X.C31u;
import X.C3cG;
import X.C7384Etj;
import X.InterfaceC7359EnW;
import com.facebook.aura.localbrowser.config.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes2.dex */
public final class LocalBrowserConfig {
    public static final boolean NAVIGATION_CONSENT_ENABLED = true;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(LocalBrowserConfig.class, "isDefaultRoute", "isDefaultRoute()Z"), C3cG.A0y(LocalBrowserConfig.class, "isWakePushEnabled", "isWakePushEnabled()Z"), C3cG.A0y(LocalBrowserConfig.class, "experiment", "getExperiment()Lcom/facebook/aura/localbrowser/config/LocalBrowserConfig$Experiment;")};
    public static final LocalBrowserConfig INSTANCE = new LocalBrowserConfig();
    public static final C31u isDefaultRoute$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_browser.enable_android_local_browser_as_default);
    public static final C31u isWakePushEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_browser.enable_android_browser_wake_push);
    public static final C31u experiment$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(LocalBrowserConfig$experiment$2.INSTANCE);

    public final class Experiment {
        public final boolean isEnabled;
        public final long serverEvaluationTimestamp;
        public final String valueSource;

        public Experiment(boolean z, String str, long j) {
            C7384Etj.A0Y(str, 1);
            this.isEnabled = z;
            this.valueSource = str;
            this.serverEvaluationTimestamp = j;
        }

        public final long getServerEvaluationTimestamp() {
            return this.serverEvaluationTimestamp;
        }

        public final String getValueSource() {
            return this.valueSource;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }
    }

    public final Experiment getExperiment() {
        return (Experiment) experiment$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final boolean isDefaultRoute() {
        return C31u.A01(this, isDefaultRoute$delegate, $$delegatedProperties, 0);
    }

    public final boolean isWakePushEnabled() {
        return C31u.A01(this, isWakePushEnabled$delegate, $$delegatedProperties, 1);
    }
}
