package com.facebook.aura.utils;

import X.C31u;
import X.C7354EnR;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.utils.MC;

/* loaded from: classes.dex */
public final class MetaAccountEntrypoint {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(MetaAccountEntrypoint.class, "canSeeNewEntrypoint", "getCanSeeNewEntrypoint()Z", 0), new C7354EnR(MetaAccountEntrypoint.class, "title", "getTitle()Ljava/lang/String;", 0)};
    public static final MetaAccountEntrypoint INSTANCE = new MetaAccountEntrypoint();
    public static final C31u canSeeNewEntrypoint$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.xe_feta_entrypoint_rl.can_see_new_entrypoint);
    public static final C31u title$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.xe_feta_entrypoint_rl.title);

    public final boolean getCanSeeNewEntrypoint() {
        return C31u.A01(this, canSeeNewEntrypoint$delegate, $$delegatedProperties, 0);
    }

    public final String getTitle() {
        return (String) title$delegate.getValue(this, $$delegatedProperties[1]);
    }
}
