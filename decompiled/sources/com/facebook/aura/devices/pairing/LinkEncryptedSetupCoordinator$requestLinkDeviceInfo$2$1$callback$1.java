package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.G0U;
import X.Hm1;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$requestLinkDeviceInfo$2$1$callback$1 extends AbstractC7559F3s implements G0U<LinkDeviceInfo, Unit> {
    public final /* synthetic */ Hm1<LinkDeviceInfo> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkEncryptedSetupCoordinator$requestLinkDeviceInfo$2$1$callback$1(Hm1<? super LinkDeviceInfo> hm1) {
        super(1);
        this.$continuation = hm1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinkDeviceInfo linkDeviceInfo) {
        if (this.$continuation.isActive()) {
            this.$continuation.resumeWith(linkDeviceInfo);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LinkDeviceInfo linkDeviceInfo) {
        invoke2(linkDeviceInfo);
        return Unit.INSTANCE;
    }
}
