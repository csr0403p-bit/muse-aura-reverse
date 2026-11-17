package com.facebook.aura.ui.adaptive;

import X.AXN;
import X.AbstractC7559F3s;
import X.C60K;
import android.content.res.Configuration;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraAdaptiveInfoKt$ProvideAuraAdaptiveInfo$adaptiveInfo$2$1 extends AbstractC7559F3s implements Function0<AuraAdaptiveInfo> {
    public final /* synthetic */ Configuration $configuration;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C60K $windowInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraAdaptiveInfoKt$ProvideAuraAdaptiveInfo$adaptiveInfo$2$1(C60K c60k, Configuration configuration, AXN axn) {
        super(0);
        this.$windowInfo = c60k;
        this.$configuration = configuration;
        this.$density = axn;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraAdaptiveInfo invoke() {
        return AuraAdaptiveInfoKt.m2355adaptiveInfoForEaSLcWc(AuraAdaptiveInfoKt.windowDpSize(this.$windowInfo, this.$configuration, this.$density));
    }
}
