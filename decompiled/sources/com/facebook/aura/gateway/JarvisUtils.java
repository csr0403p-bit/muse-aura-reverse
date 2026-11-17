package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;

/* loaded from: classes.dex */
public final class JarvisUtils {
    public static final int $stable = 0;
    public static final JarvisUtils INSTANCE = new JarvisUtils();

    public final String getSelectedAssistantName(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        String selectedAssistantNameOrNull = getSelectedAssistantNameOrNull(abstractC3358CGz);
        return selectedAssistantNameOrNull == null ? HatchAppName.value : selectedAssistantNameOrNull;
    }

    public final String getSelectedAssistantNameOrNull(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getCachedAiIdentityName();
    }
}
