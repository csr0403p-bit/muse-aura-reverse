package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityDaySection$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ActivityViewModel.ActionUiModel $actionUiModel;
    public final /* synthetic */ G0U<ActivityAction, Unit> $onActionClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityScreenKt$ActivityDaySection$1$2$1$1(G0U<? super ActivityAction, Unit> g0u, ActivityViewModel.ActionUiModel actionUiModel) {
        super(0);
        this.$onActionClick = g0u;
        this.$actionUiModel = actionUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onActionClick.invoke(this.$actionUiModel.action);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
