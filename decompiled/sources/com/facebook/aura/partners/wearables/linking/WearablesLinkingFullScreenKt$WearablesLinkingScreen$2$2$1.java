package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$WearablesLinkingScreen$2$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ WearablesLinkingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingFullScreenKt$WearablesLinkingScreen$2$2$1(WearablesLinkingViewModel wearablesLinkingViewModel) {
        super(1);
        this.$viewModel = wearablesLinkingViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$viewModel.onCommsConsentDecision(z);
    }
}
