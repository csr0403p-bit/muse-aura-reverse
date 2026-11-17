package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class UpcomingScreenKt$UpcomingCard$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onRemoveTask;
    public final /* synthetic */ HatchUpcomingTaskUiModel $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpcomingScreenKt$UpcomingCard$1$1$1$1(G0U<? super String, Unit> g0u, HatchUpcomingTaskUiModel hatchUpcomingTaskUiModel) {
        super(0);
        this.$onRemoveTask = g0u;
        this.$task = hatchUpcomingTaskUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.UPCOMING_ITEM, null, null);
        this.$onRemoveTask.invoke(this.$task.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
