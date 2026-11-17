package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.GoalAssociation;
import com.facebook.aura.library.view.GoalDetailScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalArtifactsSection$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AHD<GoalAssociation> $associations;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ MutableState<Integer> $visibleCount$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalDetailScreenKt$GoalArtifactsSection$2$2$1(String str, AHD<? extends GoalAssociation> ahd, MutableState<Integer> mutableState) {
        super(0);
        this.$goalId = str;
        this.$associations = ahd;
        this.$visibleCount$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_ARTIFACTS_SHOW_MORE_BUTTON, HatchScreen.GOAL_DETAIL, this.$goalId, HatchSubsurface.GOALS, null);
        MutableState<Integer> mutableState = this.$visibleCount$delegate;
        int iA0F = AnonymousClass001.A0F(mutableState.getValue()) + 10;
        int size = this.$associations.size();
        if (iA0F > size) {
            iA0F = size;
        }
        GoalDetailScreenKt.C123492.invoke$lambda$2(mutableState, iA0F);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
