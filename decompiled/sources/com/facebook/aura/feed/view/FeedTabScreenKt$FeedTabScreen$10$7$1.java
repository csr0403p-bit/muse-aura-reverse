package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedReaction;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$10$7$1 extends AbstractC7559F3s implements G0V<FeedUnit, Integer, Unit> {
    public final /* synthetic */ FeedViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$10$7$1(FeedViewModel feedViewModel) {
        super(2);
        this.$viewModel = feedViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(FeedUnit feedUnit, Integer num) {
        invoke(feedUnit, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FeedUnit feedUnit, int i) {
        HatchComponent hatchComponent;
        C7384Etj.A0Y(feedUnit, 0);
        FeedReaction reaction = feedUnit.getReaction();
        FeedReaction feedReaction = FeedReaction.LIKE;
        boolean zA1Z = AnonymousClass006.A1Z(reaction, feedReaction);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.FEED;
        HatchSubsurface hatchSubsurface = HatchSubsurface.FEED_WIDGET;
        HatchScreen hatchScreen = HatchScreen.FEED_HOME;
        if (zA1Z) {
            hatchComponent = HatchComponent.FEED_UNIT_LIKE;
        } else {
            hatchComponent = HatchComponent.FEED_UNIT_UNLIKE;
        }
        hatchInteractionLogger.logToggle(zA1Z, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, FeedUnitRowKt.feedCardLogMetadata(feedUnit, i));
        FeedViewModel feedViewModel = this.$viewModel;
        String id = feedUnit.getId();
        if (feedUnit.getReaction() == feedReaction) {
            feedReaction = null;
        }
        feedViewModel.setReaction(id, feedReaction);
    }
}
