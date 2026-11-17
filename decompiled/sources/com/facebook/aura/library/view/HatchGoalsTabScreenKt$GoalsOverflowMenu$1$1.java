package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalsOverflowMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onOpenCompletedGoals;
    public final /* synthetic */ G0U<Boolean, Unit> $onSetShowGoalsFirst;
    public final /* synthetic */ G0U<Boolean, Unit> $onSetShowSubtitles;
    public final /* synthetic */ Function0<Unit> $onSortAutomatically;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        G0U<Boolean, Unit> g0u;
        G0U<Boolean, Unit> g0u2;
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.DOT_MENU, HatchScreen.GOALS_HOME, HatchComponent.COMPLETED_GOALS_BUTTON, null, null, null);
                    function0 = this.$onOpenCompletedGoals;
                } else if (i == 9) {
                    HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.DOT_MENU, HatchScreen.GOALS_HOME, HatchComponent.GOAL_SORT_AUTOMATICALLY_BUTTON, null, null, null);
                    function0 = this.$onSortAutomatically;
                } else if (i == 6) {
                    HatchGoalsTabScreenKt.logSectionOrderOption(HatchGoalsTabScreenKt.GOALS_SECTION_TRACKING);
                    g0u2 = this.$onSetShowGoalsFirst;
                } else {
                    if (i != 7) {
                        return;
                    }
                    HatchGoalsTabScreenKt.logSectionOrderOption("goals");
                    g0u = this.$onSetShowGoalsFirst;
                }
                function0.invoke();
                return;
            }
            HatchGoalsTabScreenKt.logSubtitlesToggle(false);
            g0u2 = this.$onSetShowSubtitles;
            AnonymousClass001.A1K(false, g0u2);
            return;
        }
        HatchGoalsTabScreenKt.logSubtitlesToggle(true);
        g0u = this.$onSetShowSubtitles;
        g0u.invoke(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$GoalsOverflowMenu$1$1(Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$onDismiss = function0;
        this.$onSetShowSubtitles = g0u;
        this.$onSetShowGoalsFirst = g0u2;
        this.$onSortAutomatically = function02;
        this.$onOpenCompletedGoals = function03;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
