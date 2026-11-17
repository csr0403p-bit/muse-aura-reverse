package com.facebook.aura.feed.view;

import X.AIW;
import X.AbstractC7559F3s;
import X.C0924AIa;
import X.G0U;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSocialSourceApp;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitKicker$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $destinationUrl;
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
    public final /* synthetic */ String $sourceName;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitKicker$2$1$1(G0U<? super FeedTapKind, Unit> g0u, Context context, String str, FeedUnit feedUnit, int i, String str2) {
        super(0);
        this.$reportTap = g0u;
        this.$context = context;
        this.$destinationUrl = str;
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$sourceName = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.FEED;
        HatchSubsurface hatchSubsurface = HatchSubsurface.FEED_WIDGET;
        HatchScreen hatchScreen = HatchScreen.FEED_HOME;
        HatchComponent hatchComponent = HatchComponent.SOCIAL_SOURCE_LINK;
        FeedUnit feedUnit = this.$unit;
        int i = this.$absolutePosition;
        String str = this.$sourceName;
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.putAll(FeedUnitRowKt.feedCardLogMetadata(feedUnit, i));
        HatchSocialSourceApp hatchSocialSourceAppFromSourceName = HatchSocialSourceApp.Companion.fromSourceName(str);
        if (hatchSocialSourceAppFromSourceName != null) {
            c0924AIa.put(HatchMetadataKey.SOCIAL_SOURCE_APP.getValue(), hatchSocialSourceAppFromSourceName.getValue());
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AIW.A0K(c0924AIa), null);
        this.$reportTap.invoke(FeedTapKind.SOCIAL_SOURCE);
        FeedUnitRowKt.openExternalUri(this.$context, this.$destinationUrl);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
