package com.facebook.aura.avatarassets.appearance;

import X.AnonymousClass003;
import X.C20Q;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.avatarassets.appearance.MC;
import com.facebook.aura.common.apptheme.AuraAppTheme;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes5.dex */
public final class HatchAvatarAppearance {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchAvatarAppearance.class, "isDarkAvatarEnabled", "isDarkAvatarEnabled()Z");
    public static final HatchAvatarAppearance INSTANCE = new HatchAvatarAppearance();
    public static final C31u isDarkAvatarEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_avatar_abra.enable_avatar_assets_api);

    public final boolean isDark() {
        return AuraAppTheme.INSTANCE.isDark() && isDarkAvatarEnabled();
    }

    public final boolean isDarkAvatarEnabled() {
        return C31u.A01(this, isDarkAvatarEnabled$delegate, $$delegatedProperties, 0);
    }

    public final C20Q<Boolean> isDarkFlow() {
        return new HatchAvatarAppearance$special$$inlined$map$1(AuraAppTheme.INSTANCE.isDarkFlow());
    }
}
