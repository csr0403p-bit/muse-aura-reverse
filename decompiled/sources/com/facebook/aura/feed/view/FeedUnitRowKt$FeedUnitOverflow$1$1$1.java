package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C0dx;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitOverflow$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedUnitOverflow$1$1$1(C0dx c0dx, FeedUnit feedUnit, int i, MutableState<Boolean> mutableState) {
        super(0);
        this.$haptics = c0dx;
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptics.AXr(AuraHaptics.BUTTON_TAP);
        FeedUnitRowKt.logFeedUnitClick(HatchComponent.FEED_UNIT_OVERFLOW_MENU, this.$unit, this.$absolutePosition);
        MutableState.A09(true, this.$expanded$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
