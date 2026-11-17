package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class GoalRowContextMenuKt$GoalRowContextMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ boolean $completionEnabled;
    public final /* synthetic */ Function0<Unit> $onAddSubgoal;
    public final /* synthetic */ Function0<Unit> $onComplete;
    public final /* synthetic */ Function0<Unit> $onDelete;
    public final /* synthetic */ Function0<Unit> $onDiscuss;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onPromoteToGoal;
    public final /* synthetic */ Function0<Unit> $onRename;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        switch (auraContextMenuItem.id) {
            case 1:
                if (this.$completionEnabled) {
                    function0 = this.$onComplete;
                    break;
                } else {
                    return;
                }
            case 2:
                function0 = this.$onRename;
                break;
            case 3:
                function0 = this.$onDelete;
                break;
            case 4:
                function0 = this.$onAddSubgoal;
                break;
            case 5:
                function0 = this.$onPromoteToGoal;
                if (function0 == null) {
                    return;
                }
                break;
            case 6:
                this.$onDismiss.invoke();
                function0 = this.$onDiscuss;
                break;
            default:
                return;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalRowContextMenuKt$GoalRowContextMenu$1$1(Function0<Unit> function0, Function0<Unit> function02, boolean z, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07) {
        super(1);
        this.$onDismiss = function0;
        this.$onDiscuss = function02;
        this.$completionEnabled = z;
        this.$onComplete = function03;
        this.$onAddSubgoal = function04;
        this.$onPromoteToGoal = function05;
        this.$onRename = function06;
        this.$onDelete = function07;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
