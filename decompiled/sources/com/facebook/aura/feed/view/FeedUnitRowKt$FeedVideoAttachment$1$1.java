package com.facebook.aura.feed.view;

import X.AGI;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoAttachment$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
    public final /* synthetic */ FeedUnit $unit;
    public final /* synthetic */ ContentItem $viewerItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedVideoAttachment$1$1(G0U<? super FeedTapKind, Unit> g0u, FeedUnit feedUnit, int i, AuraNavigator auraNavigator, ContentItem contentItem) {
        super(0);
        this.$reportTap = g0u;
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$navigator = auraNavigator;
        this.$viewerItem = contentItem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$reportTap.invoke(FeedTapKind.VIDEO);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, HatchComponent.FEED_UNIT_VIDEO, null, AnonymousClass006.A11(HatchMetadataKey.IMAGE_PLACEMENT.getValue(), "hero_video_open_viewer", FeedUnitRowKt.feedCardLogMetadata(this.$unit, this.$absolutePosition)), null);
        ContentViewerDataHolderKt.navigateToContentViewer(this.$navigator, AGI.A0E(this.$viewerItem), 0, true, true, null, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
