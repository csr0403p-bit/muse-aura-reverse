package com.facebook.aura.navigation;

import X.AnonymousClass006;
import X.C7384Etj;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AuraModeMetadata {
    public static final int $stable = 0;
    public static final AuraModeMetadata INSTANCE = new AuraModeMetadata();
    public static final String MODE_KEY = "aura_theme_mode";

    public final Map<String, Object> mode(AuraThemeMode auraThemeMode) {
        C7384Etj.A0Y(auraThemeMode, 0);
        return AnonymousClass006.A10(MODE_KEY, auraThemeMode);
    }
}
