package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingBottomSheetKt$BottomSheetConsentContent$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onEnable;
    public final /* synthetic */ WearablesLinkingOrigin $origin;
    public final /* synthetic */ String $setupSessionId;
    public final /* synthetic */ String $utmMedium;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingBottomSheetKt$BottomSheetConsentContent$1$1$1(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, Function0<Unit> function0) {
        super(0);
        this.$origin = wearablesLinkingOrigin;
        this.$utmMedium = str;
        this.$setupSessionId = str2;
        this.$onEnable = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        WearablesLinkingOrigin wearablesLinkingOrigin = this.$origin;
        hatchInteractionLogger.logClick(wearablesLinkingOrigin.getSurface(), wearablesLinkingOrigin.getSubsurface(), HatchScreen.WEARABLES_LINKING, HatchComponent.ENABLE_ON_GLASSES_BUTTON, null, WearablesLinkingOriginKt.wearablesLinkingMetadata(this.$utmMedium, this.$setupSessionId), null);
        this.$onEnable.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
