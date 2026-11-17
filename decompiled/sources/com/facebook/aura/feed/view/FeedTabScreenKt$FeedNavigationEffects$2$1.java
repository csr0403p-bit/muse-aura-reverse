package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import android.view.View;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.model.HatchPendingFeedUnit;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedNavigationEffects$2$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ C1BO<HatchPendingFeedUnit.Event> $currentPendingFeedUnit$delegate;
    public final /* synthetic */ View $rootView;
    public final /* synthetic */ FeedViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$viewModel.clearAnchorIfAwayTooLong();
        if (this.$currentPendingFeedUnit$delegate.getValue() == null) {
            this.$viewModel.onFeedResumed();
        }
        final FeedViewModel feedViewModel = this.$viewModel;
        final View view = this.$rootView;
        return new InterfaceC06807bD() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedNavigationEffects$2$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                FeedViewModel feedViewModel2 = feedViewModel;
                feedViewModel2.onFeedPaused();
                feedViewModel2.flushSeenBatch();
                view.clearFocus();
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedNavigationEffects$2$1(FeedViewModel feedViewModel, C1BO<HatchPendingFeedUnit.Event> c1bo, View view) {
        super(1);
        this.$viewModel = feedViewModel;
        this.$currentPendingFeedUnit$delegate = c1bo;
        this.$rootView = view;
    }
}
