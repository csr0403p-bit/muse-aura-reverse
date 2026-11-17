package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$10$10$1 extends AbstractC7559F3s implements G0V<FeedUnit, Integer, Unit> {
    public final /* synthetic */ FeedViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$10$10$1(FeedViewModel feedViewModel) {
        super(2);
        this.$viewModel = feedViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(FeedUnit feedUnit, Integer num) {
        invoke(feedUnit, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FeedUnit feedUnit, int i) {
        AnonymousClass006.A0b(feedUnit).logClick(HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, HatchComponent.FEED_UNIT_DELETE, null, FeedUnitRowKt.feedCardLogMetadata(feedUnit, i), null);
        this.$viewModel.deleteUnit(feedUnit.getId());
    }
}
