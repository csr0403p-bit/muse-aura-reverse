package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalContent$1$5$4$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ SharedGoalTask $task;
    public final /* synthetic */ SharedGoalViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.RENAME_CONFIRM_BUTTON, HatchSubsurface.CONNECTIONS_DIALOG, null);
        this.$viewModel.renameTask(this.$task.id, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedGoalScreenKt$SharedGoalContent$1$5$4$1(ConnectionsLogContext connectionsLogContext, SharedGoalViewModel sharedGoalViewModel, SharedGoalTask sharedGoalTask) {
        super(1);
        this.$log = connectionsLogContext;
        this.$viewModel = sharedGoalViewModel;
        this.$task = sharedGoalTask;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
