package com.facebook.aura.library.view;

import X.AHD;
import X.AHG;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0CD;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.library.model.CompletedGoalsSection;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKt$CompletedGoalsList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ boolean $hasNextPage;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
    public final /* synthetic */ G0V<Goal, Integer, Unit> $onOpenGoalDetail;
    public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
    public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
    public final /* synthetic */ AHG<String> $pendingCompletionIds;
    public final /* synthetic */ AHD<CompletedGoalsSection> $sections;

    /* renamed from: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalsList$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoadingMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z) {
            super(3);
            this.$isLoadingMore = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string.goals_loading_more);
                BRg bRgA04 = C10G.A04(C10G.A02, GoalsCompletedScreenKt.LoadMoreFooterHeight);
                boolean zA1S = AnonymousClass003.A1S(bfm, strA01, this.$isLoadingMore);
                boolean z = this.$isLoadingMore;
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new GoalsCompletedScreenKt$CompletedGoalsList$1$1$2$1$1(z, strA01);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
                Alignment alignment = C2VU.A09;
                boolean z2 = this.$isLoadingMore;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                if (z2) {
                    bfm.AgE(-1036055155);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                } else {
                    bfm.AgE(-1036017676);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("title", "title", ComposableSingletons$GoalsCompletedScreenKt.lambda$422546319);
        AHD<CompletedGoalsSection> ahd = this.$sections;
        final G0V<Goal, Integer, Unit> g0v = this.$onOpenGoalDetail;
        final G0V<String, Boolean, Boolean> g0v2 = this.$onToggleComplete;
        final AHG<String> ahg = this.$pendingCompletionIds;
        final G0U<String, Unit> g0u = this.$onDeleteGoal;
        final G0W<String, String, String, Unit> g0w = this.$onRenameGoal;
        final int size = 0;
        for (CompletedGoalsSection completedGoalsSection : ahd) {
            String str = completedGoalsSection.monthLabel;
            if (str != null) {
                c0cd.APJ(FGI.A0M("month-", str), "month-header", B1V.A01(new GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$1$1(str), 852970998, true));
            }
            final AHD<Goal> ahd2 = completedGoalsSection.goals;
            final GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$2 goalsCompletedScreenKt$CompletedGoalsList$1$1$1$2 = GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$2.INSTANCE;
            c0cd.APL(goalsCompletedScreenKt$CompletedGoalsList$1$1$1$2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalsList$1$1$invoke$lambda$0$$inlined$itemsIndexed$1
                public final Object invoke(int i) {
                    return goalsCompletedScreenKt$CompletedGoalsList$1$1$1$2.invoke(Integer.valueOf(i), ahd2.get(i));
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(AnonymousClass001.A0F(num));
                }
            } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalsList$1$1$invoke$lambda$0$$inlined$itemsIndexed$2
                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    ahd2.get(AnonymousClass001.A0F(num));
                    return ReplyAttributionSerializer.TYPE_GOAL;
                }

                public final Object invoke(int i) {
                    ahd2.get(i);
                    return ReplyAttributionSerializer.TYPE_GOAL;
                }
            }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.library.view.GoalsCompletedScreenKt$CompletedGoalsList$1$1$invoke$lambda$0$$inlined$itemsIndexed$3
                public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                    int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                    if ((i2 & 48) == 0) {
                        iA0d |= AnonymousClass004.A0E(bfm, i);
                    }
                    if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                        bfm.Afo();
                        return;
                    }
                    Goal goal = (Goal) ahd2.get(i);
                    bfm.AgE(76401906);
                    int i3 = size + i;
                    boolean zA1a = AnonymousClass001.A1a(AnonymousClass003.A1J(bfm, g0v, goal), bfm, i3);
                    Object objAaT = bfm.AaT();
                    if (zA1a || objAaT == C78N.A00) {
                        objAaT = new GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$4$1$1(g0v, goal, i3);
                        bfm.Ai0(objAaT);
                    }
                    Function0 function0 = (Function0) objAaT;
                    boolean zA1J = AnonymousClass003.A1J(bfm, g0v2, goal);
                    Object objAaT2 = bfm.AaT();
                    if (zA1J || objAaT2 == C78N.A00) {
                        objAaT2 = new GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$4$2$1(g0v2, goal);
                        bfm.Ai0(objAaT2);
                    }
                    GoalsCompletedScreenKt.CompletedGoalRow(goal, i3, function0, (G0U) objAaT2, ahg.contains(goal.id), g0u, g0w, null, bfm, 0, 128);
                    AnonymousClass001.A1D(bfm);
                }

                @Override // X.G2j
                public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                    invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                    return Unit.INSTANCE;
                }
            }, 2039820996, true), ahd2.size());
            size += completedGoalsSection.goals.size();
        }
        if (this.$hasNextPage) {
            c0cd.APJ("completed_loading_more", "loading_more", B1V.A01(new AnonymousClass2(this.$isLoadingMore), 1716151380, true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalsCompletedScreenKt$CompletedGoalsList$1$1(AHD<CompletedGoalsSection> ahd, boolean z, G0V<? super Goal, ? super Integer, Unit> g0v, G0V<? super String, ? super Boolean, Boolean> g0v2, AHG<String> ahg, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, boolean z2) {
        super(1);
        this.$sections = ahd;
        this.$hasNextPage = z;
        this.$onOpenGoalDetail = g0v;
        this.$onToggleComplete = g0v2;
        this.$pendingCompletionIds = ahg;
        this.$onDeleteGoal = g0u;
        this.$onRenameGoal = g0w;
        this.$isLoadingMore = z2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
