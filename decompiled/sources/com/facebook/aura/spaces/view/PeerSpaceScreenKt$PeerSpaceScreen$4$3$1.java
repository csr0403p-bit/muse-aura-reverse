package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.pairs.intf.ConnectionsAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PeerSpaceScreenKt$PeerSpaceScreen$4$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PeerSpaceViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceScreenKt$PeerSpaceScreen$4$3$1(PeerSpaceViewModel peerSpaceViewModel) {
        super(0);
        this.$viewModel = peerSpaceViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConnectionsAnalytics.INSTANCE.logPeerSpaceClick(HatchComponent.RETRY_BUTTON);
        this.$viewModel.retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
