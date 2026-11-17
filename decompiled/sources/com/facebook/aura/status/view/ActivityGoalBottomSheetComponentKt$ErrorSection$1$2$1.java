package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityGoalBottomSheetComponentKt$ErrorSection$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onRetry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGoalBottomSheetComponentKt$ErrorSection$1$2$1(Function0<Unit> function0) {
        super(0);
        this.$onRetry = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ActivityGoalBottomSheetComponentKt.logGoalSheetClick(HatchSubsurface.BOT_SHEET_CONTENT, HatchComponent.RETRY_BUTTON);
        this.$onRetry.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
