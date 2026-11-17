package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$WearablesLinkingScreen$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onSkip;
    public final /* synthetic */ WearablesLinkingOrigin $origin;
    public final /* synthetic */ String $setupSessionId;
    public final /* synthetic */ MutableState<Boolean> $showExitSetupDialog$delegate;
    public final /* synthetic */ String $utmMedium;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingFullScreenKt$WearablesLinkingScreen$4$1(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(0);
        this.$origin = wearablesLinkingOrigin;
        this.$utmMedium = str;
        this.$setupSessionId = str2;
        this.$onSkip = function0;
        this.$onDismiss = function02;
        this.$showExitSetupDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showExitSetupDialog$delegate);
        WearablesLinkingOriginKt.logWearablesConsentDismiss(this.$origin, this.$utmMedium, this.$setupSessionId);
        Function0<Unit> function0 = this.$onSkip;
        if (function0 == null) {
            function0 = this.$onDismiss;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
