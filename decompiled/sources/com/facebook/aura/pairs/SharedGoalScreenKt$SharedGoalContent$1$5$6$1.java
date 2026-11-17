package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalContent$1$5$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ Map<String, String> $position;
    public final /* synthetic */ SharedGoalTask $task;
    public final /* synthetic */ SharedGoalViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedGoalScreenKt$SharedGoalContent$1$5$6$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, SharedGoalViewModel sharedGoalViewModel, SharedGoalTask sharedGoalTask) {
        super(0);
        this.$log = connectionsLogContext;
        this.$position = map;
        this.$viewModel = sharedGoalViewModel;
        this.$task = sharedGoalTask;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.DELETE_BUTTON, HatchSubsurface.DOT_MENU, this.$position);
        this.$viewModel.removeTask(this.$task.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
