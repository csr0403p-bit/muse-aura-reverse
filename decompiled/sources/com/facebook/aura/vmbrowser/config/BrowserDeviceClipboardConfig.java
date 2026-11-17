package com.facebook.aura.vmbrowser.config;

import X.C31u;
import X.C3cG;
import X.C4992DKo;
import X.C7384Etj;
import X.C7491Exw;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.vmbrowser.config.MC;

/* loaded from: classes2.dex */
public final class BrowserDeviceClipboardConfig {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(BrowserDeviceClipboardConfig.class, "isEnabled", "isEnabled()Z")};
    public static final BrowserDeviceClipboardConfig INSTANCE = new BrowserDeviceClipboardConfig();
    public static final C31u isEnabled$delegate;

    static {
        C7491Exw c7491Exw = MC.hatch_browser.enable_device_clipboard;
        C4992DKo c4992DKo = C4992DKo.A06;
        C7384Etj.A0V(c4992DKo);
        isEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBooleanWithOptions(c7491Exw, c4992DKo);
    }

    public final boolean isEnabled() {
        return C31u.A01(this, isEnabled$delegate, $$delegatedProperties, 0);
    }
}
