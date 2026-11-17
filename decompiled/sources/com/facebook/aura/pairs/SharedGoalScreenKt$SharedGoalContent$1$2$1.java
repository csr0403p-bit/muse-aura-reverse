package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import X.G2j;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalContent$1$2$1 extends AbstractC7559F3s implements G2j<String, String, SharedGoalStatus, String, Unit> {
    public final /* synthetic */ MutableState<Boolean> $awaitingSave$delegate;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ G0U<Boolean, Unit> $onEditingChange;
    public final /* synthetic */ SharedGoalViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, SharedGoalStatus sharedGoalStatus, String str3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1B(str2, 1, str3);
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.GOAL_SAVE_BUTTON, null, null);
        if (this.$viewModel.editGoal(str, str2, sharedGoalStatus, str3)) {
            MutableState.A09(true, this.$awaitingSave$delegate);
        } else {
            AnonymousClass001.A1K(false, this.$onEditingChange);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SharedGoalScreenKt$SharedGoalContent$1$2$1(ConnectionsLogContext connectionsLogContext, SharedGoalViewModel sharedGoalViewModel, G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(4);
        this.$log = connectionsLogContext;
        this.$viewModel = sharedGoalViewModel;
        this.$onEditingChange = g0u;
        this.$awaitingSave$delegate = mutableState;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, SharedGoalStatus sharedGoalStatus, String str3) {
        invoke2(str, str2, sharedGoalStatus, str3);
        return Unit.INSTANCE;
    }
}
