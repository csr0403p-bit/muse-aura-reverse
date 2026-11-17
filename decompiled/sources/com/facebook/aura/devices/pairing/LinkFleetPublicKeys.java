package com.facebook.aura.devices.pairing;

import java.security.interfaces.ECPublicKey;

/* loaded from: classes4.dex */
public final class LinkFleetPublicKeys implements LinkFleetPublicKeyProvider {
    public static final int $stable = 0;
    public static final LinkFleetPublicKeys INSTANCE = new LinkFleetPublicKeys();
    public static final LinkMcFleetPublicKeyProvider provider = new LinkMcFleetPublicKeyProvider(LinkFleetPublicKeys$provider$1.INSTANCE, LinkFleetPublicKeys$provider$2.INSTANCE);

    @Override // com.facebook.aura.devices.pairing.LinkFleetPublicKeyProvider
    public ECPublicKey publicKeyForEpoch(int i) {
        return provider.publicKeyForEpoch(i);
    }
}
