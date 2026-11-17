package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.G0U;
import X.Hm1;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$requestPairingReady$2$1$callback$1 extends AbstractC7559F3s implements G0U<LinkPairingReady, Unit> {
    public final /* synthetic */ Hm1<LinkPairingReady> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkEncryptedSetupCoordinator$requestPairingReady$2$1$callback$1(Hm1<? super LinkPairingReady> hm1) {
        super(1);
        this.$continuation = hm1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinkPairingReady linkPairingReady) {
        if (this.$continuation.isActive()) {
            this.$continuation.resumeWith(linkPairingReady);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LinkPairingReady linkPairingReady) {
        invoke2(linkPairingReady);
        return Unit.INSTANCE;
    }
}
