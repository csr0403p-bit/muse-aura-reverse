package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityContent$1$1$1$3$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ActivityViewModel.DayGroupUiModel $dayGroup;
    public final /* synthetic */ G0U<String, Unit> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityScreenKt$ActivityContent$1$1$1$3$1$1$1(G0U<? super String, Unit> g0u, ActivityViewModel.DayGroupUiModel dayGroupUiModel) {
        super(0);
        this.$it = g0u;
        this.$dayGroup = dayGroupUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$it.invoke(this.$dayGroup.dateKey);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
