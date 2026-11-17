package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$10$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FeedViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$10$4$1(FeedViewModel feedViewModel) {
        super(0);
        this.$viewModel = feedViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.FEED, null, HatchScreen.FEED_HOME, HatchComponent.RETRY_BUTTON, null, null, null);
        this.$viewModel.refreshFeed(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
