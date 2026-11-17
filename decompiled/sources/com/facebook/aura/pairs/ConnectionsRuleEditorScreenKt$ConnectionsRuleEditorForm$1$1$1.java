package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorForm$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ ConnectionsRuleEditorViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorForm$1$1$1(ConnectionsLogContext connectionsLogContext, ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel) {
        super(0);
        this.$log = connectionsLogContext;
        this.$viewModel = connectionsRuleEditorViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.USE_SAVED_VERSION_BUTTON, null, null);
        this.$viewModel.useSavedVersion();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
