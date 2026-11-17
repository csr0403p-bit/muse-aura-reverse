package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.security.KeyPair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetup$pairingStart$1", f = "LinkEncryptedSetupCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$ensureEncryptedSetup$pairingStart$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LinkPairingStart>, Object> {
    public final /* synthetic */ LinkDeviceInfo $deviceInfo;
    public int label;
    public final /* synthetic */ LinkEncryptedSetupCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkEncryptedSetupCoordinator$ensureEncryptedSetup$pairingStart$1(LinkDeviceInfo linkDeviceInfo, LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, HtJ<? super LinkEncryptedSetupCoordinator$ensureEncryptedSetup$pairingStart$1> htJ) {
        super(2, htJ);
        this.$deviceInfo = linkDeviceInfo;
        this.this$0 = linkEncryptedSetupCoordinator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LinkEncryptedSetupCoordinator$ensureEncryptedSetup$pairingStart$1(this.$deviceInfo, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        LinkSetupCrypto linkSetupCrypto = LinkSetupCrypto.INSTANCE;
        LinkDeviceInfo linkDeviceInfo = this.$deviceInfo;
        LinkFleetPublicKeyProvider linkFleetPublicKeyProvider = this.this$0.fleetPublicKeyProvider;
        KeyPair keyPairGenerateP256KeyPair = linkSetupCrypto.generateP256KeyPair();
        byte[] bArr = new byte[16];
        LinkSetupCrypto.secureRandom.nextBytes(bArr);
        return linkSetupCrypto.beginPairing(linkDeviceInfo, linkFleetPublicKeyProvider, keyPairGenerateP256KeyPair, bArr);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super LinkPairingStart> htJ) {
        return ((LinkEncryptedSetupCoordinator$ensureEncryptedSetup$pairingStart$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
