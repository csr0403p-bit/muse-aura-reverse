package com.facebook.aura.feed.view;

import X.AIW;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0924AIa;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitBody$1$1$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
    public final /* synthetic */ FeedUnit $unit;

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitBody$1$1$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Context context, String str, G0U<? super FeedTapKind, Unit> g0u) {
            super(0);
            this.$context = context;
            this.$url = str;
            this.$reportTap = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FeedUnitRowKt.startExternalUriActivity(this.$context, this.$url);
            this.$reportTap.invoke(FeedTapKind.LINK);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        String strFeedLinkType = FeedUnitRowKt.feedLinkType(str);
        if (strFeedLinkType != null) {
            FeedUnit feedUnit = this.$unit;
            int i = this.$absolutePosition;
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchSurface hatchSurface = HatchSurface.FEED;
            HatchSubsurface hatchSubsurface = HatchSubsurface.FEED_WIDGET;
            HatchScreen hatchScreen = HatchScreen.FEED_HOME;
            HatchComponent hatchComponent = HatchComponent.FEED_UNIT_LINK;
            C0924AIa c0924AIa = new C0924AIa();
            c0924AIa.putAll(FeedUnitRowKt.feedCardLogMetadata(feedUnit, i));
            AnonymousClass001.A1C(HatchMetadataKey.LINK_TYPE, strFeedLinkType, c0924AIa);
            hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AIW.A0K(c0924AIa), null);
        }
        FeedUnitRowKt.openFeedLink(new AnonymousClass2(this.$context, str, this.$reportTap));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitBody$1$1$1$1$1(FeedUnit feedUnit, int i, Context context, G0U<? super FeedTapKind, Unit> g0u) {
        super(1);
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$context = context;
        this.$reportTap = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
