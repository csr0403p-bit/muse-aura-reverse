package com.facebook.aura.analytics.timespent.config;

import X.C31u;
import X.C3cG;
import X.InterfaceC7359EnW;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes5.dex */
public final class TimeSpentMC {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(TimeSpentMC.class, "appStateLoggingEnabled", "getAppStateLoggingEnabled()Z"), C3cG.A0y(TimeSpentMC.class, "bitArrayInteractionLoggingEnabled", "getBitArrayInteractionLoggingEnabled()Z"), C3cG.A0y(TimeSpentMC.class, "navigationLoggingEnabled", "getNavigationLoggingEnabled()Z")};
    public final C31u appStateLoggingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_time_spent_killswitch.android_app_state_enabled);
    public final C31u bitArrayInteractionLoggingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_time_spent_killswitch.android_bit_array_interaction_enabled);
    public final C31u navigationLoggingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_time_spent_killswitch.android_navigation_enabled);

    public final boolean getAppStateLoggingEnabled() {
        return C31u.A01(this, this.appStateLoggingEnabled$delegate, $$delegatedProperties, 0);
    }

    public final boolean getBitArrayInteractionLoggingEnabled() {
        return C31u.A01(this, this.bitArrayInteractionLoggingEnabled$delegate, $$delegatedProperties, 1);
    }

    public final boolean getNavigationLoggingEnabled() {
        return C31u.A01(this, this.navigationLoggingEnabled$delegate, $$delegatedProperties, 2);
    }
}
