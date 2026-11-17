package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitUfi$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ Function0<Unit> $onWhyToggle;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedUnitUfi$1$2$1(FeedUnit feedUnit, int i, Function0<Unit> function0) {
        super(0);
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$onWhyToggle = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FeedUnitRowKt.logFeedUnitClick(HatchComponent.FEED_UNIT_WHY, this.$unit, this.$absolutePosition);
        this.$onWhyToggle.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
