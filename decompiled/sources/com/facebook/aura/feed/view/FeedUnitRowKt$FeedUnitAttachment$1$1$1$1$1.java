package com.facebook.aura.feed.view;

import X.AHD;
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
public final class FeedUnitRowKt$FeedUnitAttachment$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ AHD<ContentItem> $contentItems;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isVideo;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitAttachment$1$1$1$1$1(boolean z, FeedUnit feedUnit, int i, G0U<? super FeedTapKind, Unit> g0u, AuraNavigator auraNavigator, AHD<ContentItem> ahd, int i2) {
        super(0);
        this.$isVideo = z;
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$reportTap = g0u;
        this.$navigator = auraNavigator;
        this.$contentItems = ahd;
        this.$index = i2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, this.$isVideo ? HatchComponent.FEED_UNIT_VIDEO : HatchComponent.FEED_UNIT_IMAGE, null, AnonymousClass006.A11(HatchMetadataKey.IMAGE_PLACEMENT.getValue(), this.$isVideo ? "carousel_video" : "carousel", FeedUnitRowKt.feedCardLogMetadata(this.$unit, this.$absolutePosition)), null);
        this.$reportTap.invoke(this.$isVideo ? FeedTapKind.VIDEO : FeedTapKind.IMAGE);
        ContentViewerDataHolderKt.navigateToContentViewer(this.$navigator, this.$contentItems, this.$index, true, true, null, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
