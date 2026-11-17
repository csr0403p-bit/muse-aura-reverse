package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.model.HatchPendingFeedUnit;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedNavigationEffects$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<HatchPendingFeedUnit.Event> $pendingFeedUnit$delegate;
    public final /* synthetic */ FeedViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedNavigationEffects$3$1(C1BO<HatchPendingFeedUnit.Event> c1bo, FeedViewModel feedViewModel) {
        super(1);
        this.$pendingFeedUnit$delegate = c1bo;
        this.$viewModel = feedViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchPendingFeedUnit.Event value = this.$pendingFeedUnit$delegate.getValue();
        if (value != null) {
            this.$viewModel.openFeedUnit(value.unitId);
            HatchPendingFeedUnit.INSTANCE.acknowledge(value);
        }
        return new C78g() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedNavigationEffects$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
