package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ String $deleteText;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ Function0<Unit> $onConfirm;
    public final /* synthetic */ Function0<Unit> $onDismissWithLogging;
    public final /* synthetic */ HatchScreen $screen;

    /* renamed from: com.facebook.aura.library.view.GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchScreen hatchScreen, String str, Function0<Unit> function0) {
            super(0);
            this.$screen = hatchScreen;
            this.$goalId = str;
            this.$onConfirm = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_DELETE_CONFIRM_BUTTON, this.$screen, this.$goalId, HatchSubsurface.GOAL_DELETE_DIALOG, null);
            this.$onConfirm.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$deleteText;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$screen, this.$goalId, this.$onConfirm);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, true, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, anonymousClass1, null, bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelText, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onDismissWithLogging, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$1$1$1(String str, String str2, Function0<Unit> function0, HatchScreen hatchScreen, String str3, Function0<Unit> function02) {
        super(1);
        this.$deleteText = str;
        this.$cancelText = str2;
        this.$onDismissWithLogging = function0;
        this.$screen = hatchScreen;
        this.$goalId = str3;
        this.$onConfirm = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
