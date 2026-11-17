package com.facebook.aura.vds.compose.icons;

import X.AKH;
import X.BFM;
import X.C06G;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;

/* loaded from: classes.dex */
public final class AuraIconButtonStyles {
    public static final int $stable = 0;
    public static final AuraIconButtonStyles INSTANCE = new AuraIconButtonStyles();

    public final AuraIconButtonStyleConfig elevatedV2(BFM bfm, int i) {
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        return new AuraIconButtonStyleConfig(C06G.A0G(bfm, akh), C06G.A0J(bfm, akh), null, true, 4.0f);
    }

    public final AuraIconButtonStyleConfig flat(BFM bfm, int i) {
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        return new AuraIconButtonStyleConfig(C06G.A0L(bfm, akh), C06G.A0J(bfm, akh), null, true, 0.0f);
    }
}
