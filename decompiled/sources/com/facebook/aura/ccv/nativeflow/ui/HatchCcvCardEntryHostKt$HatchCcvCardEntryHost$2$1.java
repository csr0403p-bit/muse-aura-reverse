package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $hasLoggedLinkingFooter$delegate;
    public final /* synthetic */ C1BO<HatchCcvUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$2$1(C1BO<HatchCcvUiState> c1bo, MutableState<Boolean> mutableState) {
        super(1);
        this.$uiState$delegate = c1bo;
        this.$hasLoggedLinkingFooter$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$uiState$delegate.getValue().linkableAccountTypes.isEmpty() && !MutableState.A0A((MutableState) this.$hasLoggedLinkingFooter$delegate)) {
            MutableState.A09(true, this.$hasLoggedLinkingFooter$delegate);
            HatchCcvCardEntryHostKt.logCcvImpression(HatchComponent.LINKING_FOOTER, null);
        }
        return new C78g() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
