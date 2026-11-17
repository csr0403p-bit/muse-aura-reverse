package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsStatusScreenKt$PairsStatusScreen$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmRemoval$delegate;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ PairsStatusViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsStatusScreenKt$PairsStatusScreen$3$1(ConnectionsLogContext connectionsLogContext, PairsStatusViewModel pairsStatusViewModel, MutableState<Boolean> mutableState) {
        super(0);
        this.$log = connectionsLogContext;
        this.$viewModel = pairsStatusViewModel;
        this.$confirmRemoval$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.DELETE_CONFIRM_BUTTON, HatchSubsurface.CONNECTIONS_DIALOG, null);
        MutableState.A09(false, this.$confirmRemoval$delegate);
        this.$viewModel.remove();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
