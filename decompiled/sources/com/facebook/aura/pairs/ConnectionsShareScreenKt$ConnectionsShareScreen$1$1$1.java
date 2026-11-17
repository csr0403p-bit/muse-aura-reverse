package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsShareScreenKt$ConnectionsShareScreen$1$1$1 extends AbstractC7559F3s implements G0U<HatchComponent, Unit> {
    public final /* synthetic */ Map<String, String> $contentType;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ ConnectionsShareViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchComponent hatchComponent) {
        C7384Etj.A0Y(hatchComponent, 0);
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, hatchComponent, null, this.$contentType);
        this.$viewModel.share();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsShareScreenKt$ConnectionsShareScreen$1$1$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, ConnectionsShareViewModel connectionsShareViewModel) {
        super(1);
        this.$log = connectionsLogContext;
        this.$contentType = map;
        this.$viewModel = connectionsShareViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchComponent hatchComponent) {
        invoke2(hatchComponent);
        return Unit.INSTANCE;
    }
}
