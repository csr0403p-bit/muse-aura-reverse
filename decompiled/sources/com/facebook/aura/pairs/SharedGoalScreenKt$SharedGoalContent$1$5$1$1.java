package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalContent$1$5$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ Map<String, String> $position;
    public final /* synthetic */ SharedGoalTask $task;
    public final /* synthetic */ SharedGoalViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedGoalScreenKt$SharedGoalContent$1$5$1$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, SharedGoalViewModel sharedGoalViewModel, SharedGoalTask sharedGoalTask) {
        super(1);
        this.$log = connectionsLogContext;
        this.$position = map;
        this.$viewModel = sharedGoalViewModel;
        this.$task = sharedGoalTask;
    }

    public final void invoke(boolean z) {
        PairsAnalytics.INSTANCE.toggle$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(z, this.$log.screen, HatchComponent.GOAL_TASK_TOGGLE, this.$position);
        this.$viewModel.setTaskCompleted(this.$task.id, z);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
