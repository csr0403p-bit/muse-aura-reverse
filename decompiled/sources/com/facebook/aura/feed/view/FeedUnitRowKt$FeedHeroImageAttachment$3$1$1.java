package com.facebook.aura.feed.view;

import X.AGI;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.BL4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.repo.FeedHeroImageUnit;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.file.view.api.ContentSocialSource;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedHeroImageAttachment$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ MutableState<BL4> $mediaSizePx$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
    public final /* synthetic */ String $resolvedUrl;
    public final /* synthetic */ String $sharedKey;
    public final /* synthetic */ ContentSocialSource $socialSource;
    public final /* synthetic */ FeedHeroImageUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedHeroImageAttachment$3$1$1(FeedHeroImageUnit feedHeroImageUnit, int i, G0U<? super FeedTapKind, Unit> g0u, AuraNavigator auraNavigator, String str, String str2, ContentSocialSource contentSocialSource, MutableState<BL4> mutableState) {
        super(0);
        this.$unit = feedHeroImageUnit;
        this.$absolutePosition = i;
        this.$reportTap = g0u;
        this.$navigator = auraNavigator;
        this.$resolvedUrl = str;
        this.$sharedKey = str2;
        this.$socialSource = contentSocialSource;
        this.$mediaSizePx$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, HatchComponent.FEED_UNIT_IMAGE, null, AnonymousClass006.A11(HatchMetadataKey.IMAGE_PLACEMENT.getValue(), "hero", FeedUnitRowKt.feedCardLogMetadata(this.$unit, this.$absolutePosition)), null);
        this.$reportTap.invoke(FeedTapKind.IMAGE);
        ContentViewerDataHolderKt.navigateToContentViewer(this.$navigator, AGI.A0E(FeedUnitRowKt.m845feedImageContentItemmLhObY(this.$resolvedUrl, this.$sharedKey, FeedUnitRowKt.FeedHeroImageAttachment$lambda$7(this.$mediaSizePx$delegate), this.$socialSource)), 0, true, false, null, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
