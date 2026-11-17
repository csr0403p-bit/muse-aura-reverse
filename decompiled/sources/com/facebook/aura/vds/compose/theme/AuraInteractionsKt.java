package com.facebook.aura.vds.compose.theme;

import X.AGO;
import X.AKH;

/* loaded from: classes.dex */
public abstract class AuraInteractionsKt {
    public static final AKH<AuraInteractions> LocalAuraInteractions = new AGO(AuraInteractionsKt$LocalAuraInteractions$1.INSTANCE);
    public static final AuraInteractions auraInteractions = new AuraInteractions(false);

    public static final AuraInteractions getAuraInteractions() {
        return auraInteractions;
    }

    public static final AKH<AuraInteractions> getLocalAuraInteractions() {
        return LocalAuraInteractions;
    }
}
