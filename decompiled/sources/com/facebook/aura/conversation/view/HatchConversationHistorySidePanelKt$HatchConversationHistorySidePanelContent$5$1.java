package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<SidePanelMode> $mode$delegate;
    public final /* synthetic */ G0U<Boolean, Unit> $onSearchModeChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$5$1(G0U<? super Boolean, Unit> g0u, MutableState<SidePanelMode> mutableState) {
        super(1);
        this.$onSearchModeChanged = g0u;
        this.$mode$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        G0U<Boolean, Unit> g0u = this.$onSearchModeChanged;
        MutableState<SidePanelMode> mutableState = this.$mode$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        AnonymousClass001.A1K(AnonymousClass002.A1Z(mutableState.getValue(), SidePanelMode.SEARCH), g0u);
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
