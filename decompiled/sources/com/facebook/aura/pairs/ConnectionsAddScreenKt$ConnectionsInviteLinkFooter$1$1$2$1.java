package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.sharesheet.HatchShareDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsAddScreenKt$ConnectionsInviteLinkFooter$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsAddScreenKt$ConnectionsInviteLinkFooter$1$1$2$1(ConnectionsLogContext connectionsLogContext, ConnectionsViewModel connectionsViewModel) {
        super(0);
        this.$log = connectionsLogContext;
        this.$viewModel = connectionsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        HatchScreen hatchScreen = this.$log.screen;
        HatchComponent hatchComponent = HatchComponent.SHARE_DESTINATION;
        HatchSubsurface hatchSubsurface = HatchSubsurface.DESTINATION_BAR;
        HatchShareDestination hatchShareDestination = HatchShareDestination.OS_SHARE_TO;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(hatchScreen, hatchComponent, hatchSubsurface, pairsAnalytics.inviteDestination$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(hatchShareDestination));
        this.$viewModel.shareInviteLink(hatchShareDestination);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
