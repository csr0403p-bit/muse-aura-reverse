package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.repo.FeedIdeaAction;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ExploreIdeaCardDetailSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitIdeaAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ FeedIdeaAction $ideaAction;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedUnitIdeaAction$1$1(FeedUnit feedUnit, int i, AuraNavigator auraNavigator, FeedIdeaAction feedIdeaAction) {
        super(0);
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$navigator = auraNavigator;
        this.$ideaAction = feedIdeaAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, HatchComponent.IDEA_CARD_EXECUTE, null, FeedUnitRowKt.feedCardLogMetadata(this.$unit, this.$absolutePosition), null);
        this.$navigator.navigate((AuraNavKey) new ExploreIdeaCardDetailSheetKey(this.$ideaAction.ideaId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
