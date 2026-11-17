package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$requestPairingReady$2$1$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ G0U<LinkPairingReady, Unit> $callback;
    public final /* synthetic */ LinkEncryptedSetupCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkEncryptedSetupCoordinator$requestPairingReady$2$1$1(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, G0U<? super LinkPairingReady, Unit> g0u) {
        super(1);
        this.this$0 = linkEncryptedSetupCoordinator;
        this.$callback = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.this$0.transport.clearPendingPairingReadyCallback(this.$callback);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
