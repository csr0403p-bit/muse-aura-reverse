package com.facebook.aura.ui.adaptive;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraAdaptiveInfoKt$LocalAuraAdaptiveInfo$1 extends AbstractC7559F3s implements Function0<AuraAdaptiveInfo> {
    public static final AuraAdaptiveInfoKt$LocalAuraAdaptiveInfo$1 INSTANCE = new AuraAdaptiveInfoKt$LocalAuraAdaptiveInfo$1();

    public AuraAdaptiveInfoKt$LocalAuraAdaptiveInfo$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraAdaptiveInfo invoke() {
        return new AuraAdaptiveInfo(AuraWidthClass.Compact, AuraHeightClass.Medium);
    }
}
