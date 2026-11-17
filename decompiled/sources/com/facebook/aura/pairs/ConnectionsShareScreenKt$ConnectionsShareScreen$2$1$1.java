package com.facebook.aura.pairs;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsShareScreenKt$ConnectionsShareScreen$2$1$1 extends AbstractC7559F3s implements G0W<String, Integer, Boolean, Unit> {
    public final /* synthetic */ Map<String, String> $contentType;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ ConnectionsShareViewModel $viewModel;

    public final void invoke(String str, int i, boolean z) {
        C7384Etj.A0Y(str, 0);
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.toggle$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(z, this.$log.screen, HatchComponent.CONNECTIONS_SHARE_TARGET_ROW, AGH.A02(this.$contentType, pairsAnalytics.position$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(i)));
        this.$viewModel.toggle(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsShareScreenKt$ConnectionsShareScreen$2$1$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, ConnectionsShareViewModel connectionsShareViewModel) {
        super(3);
        this.$log = connectionsLogContext;
        this.$contentType = map;
        this.$viewModel = connectionsShareViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, Boolean bool) {
        invoke(str, AnonymousClass001.A0F(num), AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
