package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsComponentsKt$PairsBackButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $logMetadata;
    public final /* synthetic */ HatchScreen $logScreen;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsComponentsKt$PairsBackButton$1$1(HatchScreen hatchScreen, AuraNavigator auraNavigator, Map<String, String> map) {
        super(0);
        this.$logScreen = hatchScreen;
        this.$navigator = auraNavigator;
        this.$logMetadata = map;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchScreen hatchScreen = this.$logScreen;
        if (hatchScreen != null) {
            PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(hatchScreen, HatchComponent.BACK_BUTTON, HatchSubsurface.HEADER, this.$logMetadata);
        }
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
