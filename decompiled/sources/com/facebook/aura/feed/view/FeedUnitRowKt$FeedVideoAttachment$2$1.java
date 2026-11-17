package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoAttachment$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
    public final /* synthetic */ FeedUnit $unit;

    public final void invoke(boolean z) {
        if (z) {
            this.$reportTap.invoke(FeedTapKind.VIDEO);
        }
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, HatchComponent.FEED_UNIT_VIDEO, null, FeedUnitRowKt.feedCardLogMetadata(this.$unit, this.$absolutePosition));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedVideoAttachment$2$1(G0U<? super FeedTapKind, Unit> g0u, FeedUnit feedUnit, int i) {
        super(1);
        this.$reportTap = g0u;
        this.$unit = feedUnit;
        this.$absolutePosition = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
