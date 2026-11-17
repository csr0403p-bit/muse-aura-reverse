package com.facebook.aura.vds.compose.theme;

import X.AGO;
import X.AKH;
import com.facebook.aura.R;

/* loaded from: classes.dex */
public abstract class AuraDrawablesKt {
    public static final AKH<AuraDrawables> LocalAuraDrawables = new AGO(AuraDrawablesKt$LocalAuraDrawables$1.INSTANCE);
    public static final AuraDrawables auraDrawables = new AuraDrawables(R.drawable.new_spinner, R.drawable.new_spinner, R.drawable.check_circle_checked, R.drawable.check_circle_unchecked, R.drawable.radio_checked, R.drawable.radio_unchecked);

    public static final AuraDrawables getAuraDrawables() {
        return auraDrawables;
    }

    public static final AKH<AuraDrawables> getLocalAuraDrawables() {
        return LocalAuraDrawables;
    }
}
