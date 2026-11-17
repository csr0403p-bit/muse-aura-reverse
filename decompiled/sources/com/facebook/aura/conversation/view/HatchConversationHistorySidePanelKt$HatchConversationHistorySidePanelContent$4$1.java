package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.LoadingState;
import com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel;
import com.facebook.aura.gateway.HatchSessionItem;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $currentHasMore;
    public final /* synthetic */ LoadingState $currentLoadingState;
    public final /* synthetic */ AHD<HatchSessionItem> $currentSessions;
    public final /* synthetic */ HatchThreadsViewModel $currentViewModel;
    public final /* synthetic */ boolean $isVisible;
    public final /* synthetic */ MutableState<SidePanelMode> $mode$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$4$1(boolean z, AHD<HatchSessionItem> ahd, LoadingState loadingState, boolean z2, HatchThreadsViewModel hatchThreadsViewModel, MutableState<SidePanelMode> mutableState) {
        super(1);
        this.$isVisible = z;
        this.$currentSessions = ahd;
        this.$currentLoadingState = loadingState;
        this.$currentHasMore = z2;
        this.$currentViewModel = hatchThreadsViewModel;
        this.$mode$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchThreadsViewModel hatchThreadsViewModel;
        MutableState<SidePanelMode> mutableState = this.$mode$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.getValue();
        this.$currentSessions.size();
        if (this.$isVisible && (hatchThreadsViewModel = this.$currentViewModel) != null) {
            hatchThreadsViewModel.refresh();
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
