package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedReaction;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$10$8$1 extends AbstractC7559F3s implements G0V<FeedUnit, Integer, Unit> {
    public final /* synthetic */ FeedViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$10$8$1(FeedViewModel feedViewModel) {
        super(2);
        this.$viewModel = feedViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(FeedUnit feedUnit, Integer num) {
        invoke(feedUnit, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FeedUnit feedUnit, int i) {
        C7384Etj.A0Y(feedUnit, 0);
        FeedViewModel feedViewModel = this.$viewModel;
        String id = feedUnit.getId();
        FeedReaction reaction = feedUnit.getReaction();
        FeedReaction feedReaction = FeedReaction.DISLIKE;
        if (reaction == feedReaction) {
            feedReaction = null;
        }
        feedViewModel.setReaction(id, feedReaction);
    }
}
