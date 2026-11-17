package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsShareScreenKt$ConnectionsShareScreen$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $contentType;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ ConnectionsShareViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsShareScreenKt$ConnectionsShareScreen$2$3$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, ConnectionsShareViewModel connectionsShareViewModel) {
        super(0);
        this.$log = connectionsLogContext;
        this.$contentType = map;
        this.$viewModel = connectionsShareViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.RETRY_BUTTON, null, this.$contentType);
        this.$viewModel.retryLoad();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
