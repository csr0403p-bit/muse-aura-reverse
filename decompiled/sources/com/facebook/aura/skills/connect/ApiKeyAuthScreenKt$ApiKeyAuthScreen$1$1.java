package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ApiKeyAuthSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ApiKeyAuthScreenKt$ApiKeyAuthScreen$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ApiKeyAuthSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiKeyAuthScreenKt$ApiKeyAuthScreen$1$1(ApiKeyAuthSheetKey apiKeyAuthSheetKey, AuraNavigator auraNavigator) {
        super(0);
        this.$navKey = apiKeyAuthSheetKey;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        ApiKeyAuthSheetKey apiKeyAuthSheetKey = this.$navKey;
        hatchInteractionLogger.logClick(apiKeyAuthSheetKey.origin, HatchComponent.CLOSE_BUTTON, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), apiKeyAuthSheetKey.identifier));
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
