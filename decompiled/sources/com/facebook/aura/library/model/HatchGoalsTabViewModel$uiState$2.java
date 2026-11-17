package com.facebook.aura.library.model;

import X.A3q;
import X.AHD;
import X.AHG;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.C3cI;
import X.G2l;
import X.HtJ;
import X.HwV;
import X.Hwg;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalsState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$uiState$2", f = "HatchGoalsTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabViewModel$uiState$2 extends AbstractC07127nr implements G2l<GoalsState, GoalsState, GoalsState, HwV<? extends Integer, ? extends Boolean, ? extends AHG<? extends String>>, Boolean, HtJ<? super HatchGoalsTabViewModel.UiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ HatchGoalsTabViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabViewModel$uiState$2(HatchGoalsTabViewModel hatchGoalsTabViewModel, HtJ<? super HatchGoalsTabViewModel$uiState$2> htJ) {
        super(6, htJ);
        this.this$0 = hatchGoalsTabViewModel;
    }

    @Override // X.G2l
    public /* bridge */ /* synthetic */ Object invoke(GoalsState goalsState, GoalsState goalsState2, GoalsState goalsState3, HwV<? extends Integer, ? extends Boolean, ? extends AHG<? extends String>> hwV, Boolean bool, HtJ<? super HatchGoalsTabViewModel.UiState> htJ) {
        return invoke(goalsState, goalsState2, goalsState3, (HwV<Integer, Boolean, ? extends AHG<String>>) hwV, AnonymousClass001.A1X(bool), htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        GoalsState goalsState = (GoalsState) this.L$0;
        GoalsState goalsState2 = (GoalsState) this.L$1;
        GoalsState goalsState3 = (GoalsState) this.L$2;
        HwV hwV = (HwV) this.L$3;
        boolean z = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        int iA0F = AnonymousClass001.A0F(hwV.first);
        boolean zA1X = AnonymousClass001.A1X(hwV.second);
        AHG ahg = (AHG) hwV.third;
        AHD<Goal> ahd = goalsState.goals;
        A3q a3q = A3q.A00;
        AHD<Goal> ahdDistinctByIdExcluding = HatchGoalsTabViewModelKt.distinctByIdExcluding(ahd, a3q);
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it = ahdDistinctByIdExcluding.iterator();
        while (it.hasNext()) {
            C3cI.A1R(linkedHashSetA0k, it);
        }
        return new HatchGoalsTabViewModel.UiState(goalsState.copy(HatchGoalsTabViewModelKt.withSessionCompletion(ahdDistinctByIdExcluding, goalsState.sessionCompleted), goalsState.loadingState, goalsState.hasNextPage, goalsState.isLoadingMore, goalsState.sessionCompleted), HatchGoalsTabViewModelKt.withSessionCompletion(HatchGoalsTabViewModelKt.distinctByIdExcluding(goalsState2.goals, linkedHashSetA0k), goalsState2.sessionCompleted), goalsState2.hasNextPage, goalsState2.isLoadingMore, HatchGoalsTabViewModelKt.groupCompletedGoalsByMonth(HatchGoalsTabViewModelKt.distinctByIdExcluding(goalsState3.goals, a3q), this.this$0.displayLocale), goalsState3.loadingState, goalsState3.hasNextPage, goalsState3.isLoadingMore, iA0F, zA1X, z, ahg);
    }

    public final Object invoke(GoalsState goalsState, GoalsState goalsState2, GoalsState goalsState3, HwV<Integer, Boolean, ? extends AHG<String>> hwV, boolean z, HtJ<? super HatchGoalsTabViewModel.UiState> htJ) {
        HatchGoalsTabViewModel$uiState$2 hatchGoalsTabViewModel$uiState$2 = new HatchGoalsTabViewModel$uiState$2(this.this$0, htJ);
        hatchGoalsTabViewModel$uiState$2.L$0 = goalsState;
        hatchGoalsTabViewModel$uiState$2.L$1 = goalsState2;
        hatchGoalsTabViewModel$uiState$2.L$2 = goalsState3;
        hatchGoalsTabViewModel$uiState$2.L$3 = hwV;
        hatchGoalsTabViewModel$uiState$2.Z$0 = z;
        return hatchGoalsTabViewModel$uiState$2.invokeSuspend(Unit.INSTANCE);
    }
}
