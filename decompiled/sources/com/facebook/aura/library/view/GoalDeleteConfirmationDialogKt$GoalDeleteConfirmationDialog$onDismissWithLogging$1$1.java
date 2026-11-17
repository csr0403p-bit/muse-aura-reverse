package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$onDismissWithLogging$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchScreen $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$onDismissWithLogging$1$1(HatchScreen hatchScreen, String str, Function0<Unit> function0) {
        super(0);
        this.$screen = hatchScreen;
        this.$goalId = str;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.GOALS, HatchSubsurface.GOAL_DELETE_DIALOG, this.$screen, HatchComponent.GOAL_DELETE_CANCEL_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.GOAL_ID.getValue(), this.$goalId));
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
