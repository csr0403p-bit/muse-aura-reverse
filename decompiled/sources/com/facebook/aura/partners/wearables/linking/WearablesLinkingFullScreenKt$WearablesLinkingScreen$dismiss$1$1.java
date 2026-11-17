package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C60Q;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$WearablesLinkingScreen$dismiss$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ WearablesLinkingOrigin $origin;
    public final /* synthetic */ String $setupSessionId;
    public final /* synthetic */ C1BO<WearablesLinkingUiState> $uiState$delegate;
    public final /* synthetic */ String $utmMedium;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingFullScreenKt$WearablesLinkingScreen$dismiss$1$1(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, Function0<Unit> function0, C1BO<WearablesLinkingUiState> c1bo) {
        super(0);
        this.$origin = wearablesLinkingOrigin;
        this.$utmMedium = str;
        this.$setupSessionId = str2;
        this.$onDismiss = function0;
        this.$uiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C60Q.A0N(this.$uiState$delegate).sheetState == WearablesLinkingState.CONSENT) {
            WearablesLinkingOriginKt.logWearablesConsentDismiss(this.$origin, this.$utmMedium, this.$setupSessionId);
        }
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
