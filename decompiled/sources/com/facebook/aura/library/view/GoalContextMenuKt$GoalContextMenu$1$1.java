package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.share.view.ItemShareMenuEntries;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class GoalContextMenuKt$GoalContextMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ boolean $completionPending;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ boolean $isCompleted;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onAddSubgoal;
    public final /* synthetic */ Function0<Boolean> $onComplete;
    public final /* synthetic */ Function0<Unit> $onDiscuss;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onRename;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ ItemShareMenuEntries $shareEntries;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        int i = auraContextMenuItem.id;
        if (i == 1) {
            if (this.$completionPending) {
                return;
            }
            this.$onDismiss.invoke();
            Function0<Boolean> function02 = this.$onComplete;
            if (function02 == null || !AnonymousClass003.A1Y(function02)) {
                return;
            }
            GoalRowOverflowMenuKt.logGoalCompleteToggle(!this.$isCompleted, this.$screen, this.$goalId, null, HatchSubsurface.DOT_MENU);
            return;
        }
        if (i == 2) {
            GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_SUB_GOAL_BUTTON, this.$screen, this.$goalId, HatchSubsurface.DOT_MENU, null);
            function0 = this.$onAddSubgoal;
        } else {
            if (i == 3) {
                this.$onDismiss.invoke();
                GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.DELETE_BUTTON, this.$screen, this.$goalId, HatchSubsurface.DOT_MENU, null);
                MutableState.A09(true, this.$showDeleteConfirmation$delegate);
                return;
            }
            if (i == 4) {
                GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_EDIT_BUTTON, this.$screen, this.$goalId, HatchSubsurface.DOT_MENU, null);
                this.$onDismiss.invoke();
                function0 = this.$onRename;
                if (function0 == null) {
                    return;
                }
            } else {
                if (i != 5) {
                    AuraNavKey auraNavKeyOnItemClick = this.$shareEntries.onItemClick(i);
                    if (auraNavKeyOnItemClick != null) {
                        Function0<Unit> function03 = this.$onDismiss;
                        AuraNavigator auraNavigator = this.$navigator;
                        function03.invoke();
                        auraNavigator.navigate(auraNavKeyOnItemClick, false);
                        return;
                    }
                    return;
                }
                this.$onDismiss.invoke();
                function0 = this.$onDiscuss;
            }
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalContextMenuKt$GoalContextMenu$1$1(Function0<Unit> function0, Function0<Unit> function02, boolean z, Function0<Boolean> function03, boolean z2, HatchScreen hatchScreen, String str, Function0<Unit> function04, Function0<Unit> function05, ItemShareMenuEntries itemShareMenuEntries, MutableState<Boolean> mutableState, AuraNavigator auraNavigator) {
        super(1);
        this.$onDismiss = function0;
        this.$onDiscuss = function02;
        this.$completionPending = z;
        this.$onComplete = function03;
        this.$isCompleted = z2;
        this.$screen = hatchScreen;
        this.$goalId = str;
        this.$onAddSubgoal = function04;
        this.$onRename = function05;
        this.$shareEntries = itemShareMenuEntries;
        this.$showDeleteConfirmation$delegate = mutableState;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
