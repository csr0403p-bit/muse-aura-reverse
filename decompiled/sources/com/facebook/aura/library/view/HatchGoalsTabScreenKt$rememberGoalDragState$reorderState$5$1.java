package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.ui.DragRelease;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$5$1 extends AbstractC7559F3s implements G0U<DragRelease, Boolean> {
    public final /* synthetic */ C1BO<G0U<GoalDropOutcome, Unit>> $currentOnDropReleased$delegate;
    public final /* synthetic */ GoalDragResolver $resolver;

    @Override // X.G0U
    public final Boolean invoke(DragRelease dragRelease) {
        C7384Etj.A0Y(dragRelease, 0);
        GoalDropOutcome goalDropOutcomeOnRelease = this.$resolver.onRelease(dragRelease);
        C1BO<G0U<GoalDropOutcome, Unit>> c1bo = this.$currentOnDropReleased$delegate;
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        C1BO.A0B(c1bo).invoke(goalDropOutcomeOnRelease);
        return Boolean.valueOf(AnonymousClass002.A1X(goalDropOutcomeOnRelease));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$5$1(GoalDragResolver goalDragResolver, C1BO<? extends G0U<? super GoalDropOutcome, Unit>> c1bo) {
        super(1);
        this.$resolver = goalDragResolver;
        this.$currentOnDropReleased$delegate = c1bo;
    }
}
