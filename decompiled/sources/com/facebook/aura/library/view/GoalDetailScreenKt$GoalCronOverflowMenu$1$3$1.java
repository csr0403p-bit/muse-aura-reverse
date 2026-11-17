package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalCronOverflowMenu$1$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ String $cronId;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        if (auraContextMenuItem.id == 1) {
            MutableState.A09(false, this.$menuExpanded$delegate);
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.DOT_MENU, HatchScreen.GOAL_DETAIL, HatchComponent.DELETE_BUTTON, null, GoalDetailScreenKt.cronRowLogMetadata(this.$goalId, this.$cronId, this.$absolutePosition), null);
            MutableState.A09(true, this.$showDeleteConfirmation$delegate);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalCronOverflowMenu$1$3$1(String str, String str2, int i, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$goalId = str;
        this.$cronId = str2;
        this.$absolutePosition = i;
        this.$menuExpanded$delegate = mutableState;
        this.$showDeleteConfirmation$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
