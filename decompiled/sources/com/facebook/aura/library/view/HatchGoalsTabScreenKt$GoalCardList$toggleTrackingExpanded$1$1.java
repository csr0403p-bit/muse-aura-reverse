package com.facebook.aura.library.view;

import X.AHG;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$toggleTrackingExpanded$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<AHG<String>> $trackingExpandedGoalIds$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        MutableState<AHG<String>> mutableState = this.$trackingExpandedGoalIds$delegate;
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        mutableState.Af8(HatchGoalsTabScreenKt.toggle(mutableState.getValue(), str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalCardList$toggleTrackingExpanded$1$1(MutableState<AHG<String>> mutableState) {
        super(1);
        this.$trackingExpandedGoalIds$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
