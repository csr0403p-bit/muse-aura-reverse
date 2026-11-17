package com.facebook.aura.watchhandoff;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C31u;
import X.C7384Etj;
import X.InterfaceC7359EnW;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.watchhandoff.MC;

/* loaded from: classes5.dex */
public final class WatchHandoffGate {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(WatchHandoffGate.class, "isEnabled", "isEnabled()Z");
    public static final WatchHandoffGate INSTANCE = new WatchHandoffGate();
    public static final C31u isEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_wear.enable_watch_handoff);

    public final boolean canSetUpWatch(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return isEnabled() && ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz).isStandardVm();
    }

    public final boolean isEnabled() {
        return C31u.A01(this, isEnabled$delegate, $$delegatedProperties, 0);
    }
}
