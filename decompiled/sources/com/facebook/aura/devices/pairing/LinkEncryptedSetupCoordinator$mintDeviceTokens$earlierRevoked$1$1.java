package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceTokens$earlierRevoked$1$1", f = "LinkEncryptedSetupCoordinator.kt", l = {311}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$mintDeviceTokens$earlierRevoked$1$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public final /* synthetic */ LinkUnconfirmedTokens $it;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkEncryptedSetupCoordinator$mintDeviceTokens$earlierRevoked$1$1(LinkUnconfirmedTokens linkUnconfirmedTokens, HtJ<? super LinkEncryptedSetupCoordinator$mintDeviceTokens$earlierRevoked$1$1> htJ) {
        super(1, htJ);
        this.$it = linkUnconfirmedTokens;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LinkEncryptedSetupCoordinator$mintDeviceTokens$earlierRevoked$1$1(this.$it, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return new LinkEncryptedSetupCoordinator$mintDeviceTokens$earlierRevoked$1$1(this.$it, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LinkUnconfirmedTokens linkUnconfirmedTokens = this.$it;
            this.label = 1;
            obj = linkUnconfirmedTokens.revokeBeforeMint(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}
