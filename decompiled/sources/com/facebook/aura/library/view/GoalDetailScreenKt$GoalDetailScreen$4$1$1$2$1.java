package com.facebook.aura.library.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.library.model.GoalDetailViewModel;
import com.facebook.aura.library.repo.GoalAssociation;
import com.facebook.aura.library.repo.GoalDetail;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$4$1$1$2$1 extends AbstractC7559F3s implements G0V<GoalAssociation, Integer, Unit> {
    public final /* synthetic */ GoalDetail $detail;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ GoalDetailViewModel $viewModel;

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalDetailScreen$4$1$1$2$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, GoalDetailViewModel.class, "recordGoalEngagement", "recordGoalEngagement()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((GoalDetailViewModel) this.receiver).recordGoalEngagement();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$4$1$1$2$1(GoalDetail goalDetail, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, GoalDetailViewModel goalDetailViewModel) {
        super(2);
        this.$detail = goalDetail;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$viewModel = goalDetailViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(GoalAssociation goalAssociation, Integer num) {
        invoke(goalAssociation, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(GoalAssociation goalAssociation, int i) {
        C7384Etj.A0Y(goalAssociation, 0);
        GoalAssociationUiKt.handleGoalAssociationClick(goalAssociation, this.$detail.goal.id, this.$navigator, this.$userSession, new AnonymousClass1(this.$viewModel), Integer.valueOf(i));
    }
}
