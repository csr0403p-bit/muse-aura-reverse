package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C3cJ;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.TaskCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class UpcomingScreenKt$TaskCategoryCard$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ TaskCategory $category;
    public final /* synthetic */ G0U<HatchTaskUiModel, Unit> $onTaskClick;
    public final /* synthetic */ HatchTaskUiModel $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpcomingScreenKt$TaskCategoryCard$1$1$1$1(TaskCategory taskCategory, G0U<? super HatchTaskUiModel, Unit> g0u, HatchTaskUiModel hatchTaskUiModel) {
        super(0);
        this.$category = taskCategory;
        this.$onTaskClick = g0u;
        this.$task = hatchTaskUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.TASK_CARD, null, C3cJ.A0R(this.$category, HatchMetadataKey.SECTION.getValue()), null);
        this.$onTaskClick.invoke(this.$task);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
